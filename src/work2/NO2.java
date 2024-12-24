package work2;

//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
public class No2 {
	public static void main(String[] args) {
		int product = 1;
		for (int n = 1; n <= 10; n++) {
			product *= n;
		}
		System.out.println("1~10的連乘積為" + product);
	}

}
