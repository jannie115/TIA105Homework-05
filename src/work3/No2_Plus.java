package work3;

import java.util.Scanner;

//產生0~100亂數,每次猜就會提示你是大於還是小於正確答案
public class No2_Plus {
	public static void main(String[] args) {
		int r = (int) (Math.random() * 101);
//		System.out.println(r);
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!");
		while (true) {
			int inputnumber = sc.nextInt();
			if (inputnumber == r) {
				System.out.println("答對了!答案就是" + r);
				break;
			} else if (inputnumber > r) {
				System.out.println(inputnumber + "大於正確答案");
			} else {
				System.out.println(inputnumber + "小於正確答案");
			}
		}
	}

}
