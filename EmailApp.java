package emailapp;

public class EmailApp {
	public static void main(String[] args) {
		Email eml = new Email("John", "Smith");
		
//		eml.setAlternateEmail("js@gmail.com");
//		System.out.println(eml.getAlternativeEmail());
		
		System.out.println(eml.showInfo());
	}

}
