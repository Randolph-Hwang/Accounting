
public class MyAccountingApp {

	public static void main(String[] args) {
			
		double VOS = Double.parseDouble(args[0]); // VOS = Value Of Supply
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = VOS * vatRate;
		double Total = VOS + VAT;
		double Expense = VOS * expenseRate;
		double Income = VOS - Expense;
		double dividend1 = Income * 0.5;
		double dividend2 = Income * 0.3;
		double dividend3 = Income * 0.2;
			
		System.out.println("Value of supply : "+VOS);
		System.out.println("VAT : " +VAT);
		System.out.println("Total : " +Total);
		System.out.println("Expense : "+Expense);
		System.out.println("Income : "+Income);
		System.out.println("Dividend 1 : " + dividend1 );
		System.out.println("Dividend 2 : "+dividend2 );
		System.out.println("Dividend 3 : "+dividend3 );
			
			
		}

	}

