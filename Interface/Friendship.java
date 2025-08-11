package Interface;

public interface Friendship {
	
	default void Vamshi() {
		System.out.println("Vamshi is a good programmer");
		Bond();
	}
	default void Venkat() {
		System.out.println("Venkat is a good person");
		Bond();
	}
	default void Avinash() {
		System.out.println("Avinash is a good BGMI player");
		Bond();
	}
	default void Madhukar() {
		System.out.println("LEELAMadhukar is a good Extrovert");
		Bond();
	}
	default void Nagaraj() {
		System.out.println("Nagaraj is a Kind Hearted person");
		Bond();
	}
	static void Model() {
		System.out.println("he is Model Star Praveen ");
		Bond();
	}
	private static void Bond() {
		System.out.println("he is my friend");
	}
}
