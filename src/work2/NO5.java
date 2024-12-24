package work2;

//阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。
//請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
public class No5 {
	public static void main(String[] args) {
		System.out.println("阿文可以選擇的數字有");
		int count = 0;
		for (int n = 1; n <= 49; n++) {
			if ( n %10 != 4 && n/10 != 4 )  {
				System.out.print(n + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("總共有" + count + "個");
	}

}
