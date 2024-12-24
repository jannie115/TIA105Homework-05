package work1;

//02.請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
public class No2 {
	public static void main(String[] args) {
		int egg = 200;
		System.out.print(egg + "顆蛋共是" + (egg / 12) + "打" + (egg % 12) + "顆");

	}
}
