package shirt;

public class Shirt {
	private String id;
	private String description;
	private String color;
	private String size;
	/*
	 * Конструктор по умолчанию
	 */
	public Shirt() {}
	/*
	 * Конструктор с аргументом String
	 */
	public Shirt(String s) {
		String[] arr = s .split(",");
		id = arr[0];
		description = arr[1];
		color = arr[2];
		size = arr[3];
	}
	@Override
	public String toString() {
		return "id: " + id + "\n"
			   + description + "\n"
			   + "color: " + color + "\n"
			   + "size: " + size + "\n\n";
	}
}
