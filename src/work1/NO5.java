package work1;

/*某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行, 
請用程式計算10年後,本金加利息共有多少錢*/
public class No5 {
	public static void main(String[] args) {
		double money = 1500000;
		double r = 0.02;
		double total = money * Math.pow(1 + r, 10);
		System.out.println("10年後,本金加利息共有" + total + "元");
		System.out.println("10年後,本金加利息共有" + (int) total + "元");
	}
}
