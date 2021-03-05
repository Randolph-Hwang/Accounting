import javax.swing.JOptionPane;

public class MyAccountingApp4 {

	public static double vatRate;
	public static double vOS;
	public static double expenseRate;
	public static double vAT;
	public static double total;
	public static double expense;
	public static double income;
	
	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("Your product is : ");
		double  VOS = Double.parseDouble(JOptionPane.showInputDialog("Enter your VOS(Value Of Supply) : ")); // VOS = Value Of Supply
		
		vOS = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		
		print();
		
		double [] dividendRates = new double [3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		System.out.println("Your Product : "+id);
		System.out.println("Value of supply : "+vOS);
		System.out.println("VAT : " +getVAT());
		System.out.println("Total : " +getTotal());
		System.out.println("Expense : "+getExpense());
		System.out.println("Income : "+getIncome());

		int i = 0;
		while(i < dividendRates.length) {
			System.out.println("Dividend " + (i+1) +" : " + (income * dividendRates [i]));
			i = i + 1;
			}
		}

	private static double getIncome() {
		return vOS - getExpense();
	}

	private static double getExpense() {
		return vOS * expenseRate;
	}

	private static double getTotal() {
		return vOS + getVAT();
	}

	private static double getVAT() {
		return vOS * vatRate;
	}
}
