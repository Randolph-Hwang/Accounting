import javax.swing.JOptionPane;

public class MyAccountingApp3 {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("Your product is : ");
		double  VOS = Double.parseDouble(JOptionPane.showInputDialog("Enter your VOS(Value Of Supply) : ")); // VOS = Value Of Supply
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = VOS * vatRate;
		double Total = VOS + VAT;
		double Expense = VOS * expenseRate;
		double Income = VOS - Expense;
		
		double [] dividendRates = new double [3];
		dividendRates[0] = 0.5;  
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		
		System.out.println("Your Product : "+id);
		System.out.println("Value of supply : "+VOS);
		System.out.println("VAT : " +VAT);
		System.out.println("Total : " +Total);
		System.out.println("Expense : "+Expense);
		System.out.println("Income : "+Income);

		int i = 0;
		while(i < dividendRates.length) {
			System.out.println("Dividend " + (i+1) +" : " + (Income * dividendRates [i]));
			i = i + 1;
			}
		
		}
}
