package telephone;

public class Program {
	public static void main(String[] args) {
		Phone ph1 = new Phone();
		ph1.setPhone("+19200587871");
		System.out.println("Phone: " + ph1.getPhone());
		System.out.println("Phone in format: " + ph1.getPhoneInFormat());
		
		Phone ph2 = new Phone();
		ph2.setPhone("89200587871");
		System.out.println("Phone: " + ph2.getPhone());
		System.out.println("Phone in format: " + ph2.getPhoneInFormat());
		
		Phone ph3 = new Phone();
		ph3.setPhone("+1009200587871");
		System.out.println("Phone: " + ph3.getPhone());
		System.out.println("Phone in format: " + ph3.getPhoneInFormat());
		
		Phone ph4 = new Phone();
		ph4.setPhone("4656768");
		System.out.println("Phone: " + ph4.getPhone());
		System.out.println("Phone in format: " + ph4.getPhoneInFormat());
	}
}
