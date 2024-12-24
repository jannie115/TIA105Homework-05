package work3;

import java.util.Scanner;

//(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
public class No3_Plus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字?");
		int inputnumber = sc.nextInt();
		int[] array = new int[6];
//		檢查有無重複
		int r;
		for (int i = 0; i < 6; i++) {
			label: 
				while (true) {
				r = (int) (Math.random() * 49 + 1);
				if( r %10 == inputnumber || (r/10) == inputnumber ||r==inputnumber) {
					continue label;
				}
					
				for (int j = 0; j < 6; j++) {
					if (r == array[j]) {
						r = (int) (Math.random() * 49 + 1);
						continue label;
					}
				}
				array[i] = r;
				break;
			}
			System.out.print(array[i] + " ");
		}
	}
}