package work5;

//請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,
//即會印出對應的*長方形
import java.util.Scanner;

public class No1 {
	public static void main(String[] args) {
		starSquare();
	}

	public static void starSquare() {
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入寬");
		int width = sc.nextInt();
		System.out.println("輸入高");
		int height = sc.nextInt();
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
