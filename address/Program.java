package address;

public class Program {
	public static void main(String[] args) {
		Address ad1 = new Address();
		Address ad2 = new Address();
		Address ad3 = new Address();
		Address ad4 = new Address();
		ad1.setAdrressSplit("Russia, Moskovskaya obl, Moscow, Lomonosovskiy prospect, 27, 11, 638");
		System.out.println(ad1.toString());
		ad2.setAddressTokenizer("USA-Massachusetts-Boston-Cambrdge St-100-1-2");
		System.out.println(ad2.toString());
		ad3.setAddressTokenizer("France. Ile de France. Paris. Rue de Villersexel. 9. 1. 4");
		System.out.println(ad3.toString());
		ad4.setAddressTokenizer("Spain; Girona; Roses; Carrer de la Riera Ginjolers; 71; 1; 3");
		System.out.println(ad4.toString());
	}
}
