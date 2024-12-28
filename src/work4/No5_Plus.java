package work4;

import java.util.Scanner;

//請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
public class No5_Plus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入西元年 月 日");
		int year = sc.nextInt();
		boolean leap_year_days;
//	System.out.println(year+"/" +month+"/"+day);

//		防止年份錯誤
		while (year <= 0) {
			System.out.println("輸入年份錯誤，請重新輸入西元年份");
			year = sc.nextInt();
		}
//		判斷閏年
		if (year % 400 == 0) {
//			System.out.println("閏年");
			leap_year_days = true;
		} else if (year % 4 == 0 && year % 100 != 0) {
//			System.out.println("閏年");
			leap_year_days = true;
		} else {
//			System.out.println("平年");
			leap_year_days = false;
		}

//		防止月份錯誤
//		System.out.println("輸入月份");
		int month = sc.nextInt();
		while (month <= 0 || month > 12) {
			System.out.println("輸入月份錯誤，請重新輸入月份");
			month = sc.nextInt();
		}

//		判斷月份天數
		int count = 0;
		int[] month_days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (leap_year_days == true) {
			month_days[1] = 29;
		}
		for (int i = 0; i < month - 1; i++) {
			count += month_days[i];
//			System.out.println("天數" + count);
		}

//		防止月份對應日期錯誤
//		System.out.println("輸入日期");
		int day = sc.nextInt();
		while (day > month_days[month - 1] || day <= 0) {
			System.out.println("輸入日期錯誤，請重新輸入日期");
			day = sc.nextInt();
		}

//		總天數
		System.out.println("輸入的日期為該年第" + (count + day) + "天");

	}

}
