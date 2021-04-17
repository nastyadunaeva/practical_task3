package address;

import java.util.StringTokenizer;

public class Address {
	String country;
	String region;
	String city;
	String street;
	String house;
	String building;
	String apartment;
	
	public Address() {}
	
	public Address(String country, String region, String city, String street, String house, String building, String apartment) {
		this.country = country;
		this.region = region;
		this.city = city;
		this.street = street;
		this.house = house;
		this.building = building;
		this.apartment = apartment;
	}
	
	/*
	 * Устанавливает поля адреса, разделяет строку
	 * с помощью метода split
	 */
	public void setAdrressSplit(String address) {
		String[] arr = address.split(",");
		for (int i = 0; i < arr.length; i++) {
			switch (i) {
			case 0:
				country = arr[0].trim();
				break;
			case 1:
				region = arr[1].trim();
				break;
			case 2:
				city = arr[2].trim();
				break;
			case 3:
				street = arr[3].trim();
				break;
			case 4:
				house = arr[4].trim();
				break;
			case 5:
				building = arr[5].trim();
				break;
			case 6:
				apartment = arr[6].trim();
				break;
			}

		}
	}
	
	public void setAddressTokenizer(String address) {
		StringTokenizer st = new StringTokenizer(address, "\\.,\\-;");
		int i = 0;
		while (st.hasMoreTokens()) {
			String str = st.nextToken().trim();
			switch (i) {
			case 0:
				country = str;
				break;
			case 1:
				region = str;
				break;
			case 2:
				city = str;
				break;
			case 3:
				street = str;
				break;
			case 4:
				house = str;
				break;
			case 5:
				building = str;
				break;
			case 6:
				apartment = str;
				break;
			}
			i++;
		}
	}
	
	/*
	 * Сравнение двух адресов
	 */
	public boolean equals(Address other) {
		if ((other.country.equals(country)) && (other.region.equals(region)) && (other.city.equals(city))
				&& (other.street.equals(street)) && (other.house.equals(house))
				&& (other.building == building) && (other.apartment == apartment)) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return apartment + " apt, " + building + ", " + house + ", "+ street + ", " + city + ", " + region + ", " + country;
	}
}
