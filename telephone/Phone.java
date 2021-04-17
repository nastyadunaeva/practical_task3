package telephone;

import java.util.IllegalFormatException;

public class Phone {
	/*
	 * Поле хранит полный телефон
	 */
	String phone;
	/*
	 * Поле хранит код страны
	 */
	String countryCode;
	/*
	 * Поле хранит часть телефона из 10 цифр без кода страны
	 */
	String mainPart;
	boolean flag = false;
	public Phone() {
		phone = "";
	}
	/*
	 * устанавливает значение телефона
	 */
	public void setPhone(String phone) {
		this.phone = phone; 
		flag = true;
	}
	/*
	 * Возвращает телефон в неизмененном виде
	 * Бросает исключение IllegalStateException, если 
	 * значение телефона не было установленио с помощью метода 
	 * setPhone
	 */
	public String getPhone() {
		if (flag == false) {
			throw new IllegalStateException();
		}
		return phone;
	}
	/*
	 * Возвращает телефон в заданном формате
	 * Бросает исключение IllegalStateException, если 
	 * значение телефона не было установленио с помощью метода 
	 * setPhone
	 * Возвращает строку Illegal format, если формат телефона 
	 * неправильный
	 */
	public String getPhoneInFormat() {
		if (flag == false) {
			throw new IllegalStateException();
		}
		if (phone.matches("\\+[0-9]{11,}")) {
			countryCode = phone.substring(1, phone.length()-10);
			mainPart = phone.substring(phone.length()-10);
			
			//return "normal";
		} else if (phone.matches("8[0-9]{10}")) {
			countryCode = "7";
			mainPart = phone.substring(phone.length()-10);
			
			//return "Russian";
		} else {
			return "Illegal format";
		}
		return "+" + countryCode + mainPart.substring(0, 3) + "-" + mainPart.substring(3, 6) + "-" + mainPart.substring(6);
		
	}
}
