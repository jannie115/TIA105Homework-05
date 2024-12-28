package work4;

import java.util.Scanner;

//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//表如下:
//
//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//員工編號: 25 19 27 共 3 人!」
public class No4constructor {
	static int count = 0;
	int number, money;
	
	public No4constructor(int number, int money) {
		this.number = number;
		this.money = money;
		
	}
	
	public void borrowmoney(int borrow) {
		if (money >= borrow) {
			System.out.print(number + " ");
			count++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入欲借的金額");
		int borrow = sc.nextInt();
		No4constructor no25 = new No4constructor(25, 2500);
		No4constructor no32 = new No4constructor(32, 800);
		No4constructor no8 = new No4constructor(8, 500);
		No4constructor no19 = new No4constructor(19, 1000);
		No4constructor no27 = new No4constructor(27, 1200);
		System.out.println("有錢可借的員工編號:");
		no25.borrowmoney(borrow);
		no32.borrowmoney(borrow);
		no8.borrowmoney(borrow);
		no19.borrowmoney(borrow);
		no27.borrowmoney(borrow);
		System.out.println("共" + count +"人!");
		
	}
	
}
