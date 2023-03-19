package switchCase;

public class Checkloantype {

	public static void main(String[] args) {

		String loantype = "Housing Loan";
		int Salary = 780000;
		double interest = 5.5;
		
		switch (loantype) {
		case "Car loan":
			System.out.println(" Applied for Car loan ");
			break;
		case "Personal Loan":
			System.out.println("Applied for Personal loan ");
			break;
		case "Housing Loan":
			if(Salary<35000)
				System.out.println("Not applicable for the loan");
			else
				System.out.println(" Housing Loan Approved ");
			  System.out.println(" Hurray ! You will get interest rate of " +interest+"%");
			   
		default:
			break;
		}
	}

}
