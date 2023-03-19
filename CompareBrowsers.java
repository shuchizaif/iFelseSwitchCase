package switchCase;

public class CompareBrowsers {

	public static void main(String[] args) {

		String launchbrowser = "Firefox";
		
		switch (launchbrowser) {
		case "Chrome":
			System.out.println("Launch Chrome ");
			break;
		case "Firefox":
			System.out.println("Launch Firefox ");
			break;
		case "Safari":
			System.out.println("Launch Safari ");
			break;

		default:
			System.out.println("Please pass correct browser name");
			break;
		}
	}

}
