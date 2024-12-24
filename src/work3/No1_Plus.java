package work3;

import java.util.Arrays;
import java.util.Scanner;

//請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形,如圖示結果:
public class No1_Plus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		int[] array = { sc.nextInt(), sc.nextInt(), sc.nextInt() };
//		System.out.println(array[0]);
		Arrays.sort(array);
		if (array[0] + array[1] > array[2]) {
			if (array[0] == array[2]) {
				System.out.println("正三角形");
			} else if (array[0] == array[1] || array[1] == array[2]) {
				System.out.println("等腰三角形");
			} else if (Math.pow(array[0], 2) + Math.pow(array[1], 2) == Math.pow(array[2], 2)) {
				System.out.println("直角三角形");
			} else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("不是三角形");
		}
	}
}