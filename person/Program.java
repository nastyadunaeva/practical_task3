package person;

public class Program {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setLastName("Bongiovi");
		p1.setFirstName("John");
		System.out.println(p1.getFullName());
		System.out.println(p1.getReducedName());
		System.out.println();
		
		Person p2 = new Person();
		p2.setLastName("Kuzmina");
		p2.setFirstName("Anna");
		p2.setMiddleName("Alekseevna");
		System.out.println(p2.getFullName());
		System.out.println(p2.getReducedName());
		System.out.println();
		
		Person p3 = new Person();
		p3.setLastName("Cooper");
		System.out.println(p3.getFullName());
		System.out.println(p3.getReducedName());
		System.out.println();
	}
}
