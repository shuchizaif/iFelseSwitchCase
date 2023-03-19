package switchCase;

public class TestingEnvironment {

	public static void main(String[] args) {
	
		
		String environment = "Prod";
		
		switch (environment) {
		case "QA":
			System.out.println("Testing to be done in QA Environment");
			break;
		case "UAT":
			System.out.println("Testing to be done in UAT environment");
             break;
		case "Staging":
			System.out.println("Testing to be done in Staging environment");
			break;
		default:
			System.out.println("Environment not setup till now");
			break;
		}

	}

}
