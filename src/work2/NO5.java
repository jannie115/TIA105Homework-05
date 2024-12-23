package work2;

//阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。
//請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
public class NO5 {
	public static void main(String[] args) {
		System.out.println("阿文可以選擇的數字有");
		int count = 0;
		for (int n = 1; n <= 39; n++) {
			if (n != 4 && n != 14 && n != 24 && n != 34) {
				System.out.print(n + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("總共有" + count + "個");
	}

}
