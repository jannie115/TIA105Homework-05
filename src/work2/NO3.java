package work2;

//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
public class No3 {
	public static void main(String[] args) {
		int product = 1, n = 1;
		while (n <= 10) {
			product *= n;
			n++;
		}
		System.out.println("1~10的連乘積為" + product);
	}

}
