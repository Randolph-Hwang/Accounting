import javax.swing.JOptionPane;

public class MyAccountingApp8 {

	public static double vatRate;
	public static double vOS;
	public static double expenseRate;
	public static double vAT;
	public static double total;
	public static double expense;
	public static double income;
	
	public static void main(String[] args) {
		
		vatRate = 0.1;
		expenseRate = 0.3;
		
		print();
		}
		
	public static void print() {
		
		String id = JOptionPane.showInputDialog("Your product is : ");
		double vOS = Double.parseDouble(JOptionPane.showInputDialog("Enter your VOS(Value Of Supply) : ")); // VOS = Value Of Supply
		
		
		System.out.println("Your Product : "+id);
		System.out.println("Value of supply : "+vOS);
		System.out.println("VAT : " +getVAT(vOS));
		System.out.println("Total : " +getTotal(vOS));
		System.out.println("Expense : "+getExpense(vOS));
		System.out.println("Income : "+getIncome(vOS));

		double [] dividendRates = new double [3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		int i = 0;
		while(i < dividendRates.length) {
			System.out.println("Dividend " + (i+1) +" : " + (getIncome(vOS) * dividendRates [i]));
			i = i + 1;
			}
		}
		
	private static double getIncome(double vOS) {
		return vOS - getExpense(vOS);
	}

	private static double getExpense(double vOS) {
		return vOS * expenseRate;
	}

	private static double getTotal(double vOS) {
		return vOS + getVAT(vOS);
	}

	private static double getVAT(double vOS) {
		return vOS * vatRate;
	}
} 
