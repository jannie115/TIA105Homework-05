package work2;

/*請設計一隻Java程式,輸出結果為以下:
1 4 9 16 25 36 49 64 81 100 */
public class No4 {
	public static void main(String[] args) {
		for (int n = 1; n <= 10; n++) {
			System.out.print(n * n + " ");
			// System.out.print(Math.pow(n, 2)+" "); type 會是double
		}
	}
}
