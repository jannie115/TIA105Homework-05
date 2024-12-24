package work3;

import java.util.Scanner;

//阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//的號碼與總數,如圖:
public class No3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字?");
		int inputnumber = sc.nextInt();
		int count = 0;
		for (int n=1;n<=49;n++) {
			if(n<=9 && n!=inputnumber) {
				System.out.print(n + " ");
				count++;
			}
			else if( n %10 != inputnumber && (n/10) != inputnumber ) {
				System.out.print(n + " ");
				count++;
			}
		}
		System.out.println(" ");
		System.out.println("總共有" + count + "個數字可選");
		
	}

}
