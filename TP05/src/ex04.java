import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		MonthProfit mp[] = new MonthProfit[12];
		int m;
		String m_n;
		float pf, total_profit=0;
		
		for(int i=0;i<12;i++) {
			System.out.print("Input month: ");
			m = sc.nextInt();
			System.out.print("Input month name: ");
			m_n = sc.next();
			System.out.println("Profit for month " + m + " (" + m_n + " ) :");
			pf = sc.nextFloat();
			
			mp[i] = new MonthProfit(m, m_n, pf);
		}
		
		System.out.print("\n");
		
		for(int i=0; i<12; i++) {
			System.out.printf("Profit for month %d (%s)\t: %.2f\n", mp[i].getMonth(),mp[i].getMonthName(),mp[i].getProfit());
			total_profit += mp[i].getProfit();
		}
		
		System.out.printf("\nTotal profits for 12 months\t:%.2f", total_profit);
		sc.close();
	}
}
class MonthProfit {
	private float profit;
	private int month;
	private String monthName;
	
	public MonthProfit(int m, String m_n, float p) {
		profit = p;
		month = m;
		monthName = m_n;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getMonthName() {
		return monthName;
	}

	public void setmonthName(String monthName) {
		this.monthName = monthName;
	}

	public float getProfit() {
		return profit;
	}

	public void setProfit(float profit) {
		this.profit = profit;
	}
}
