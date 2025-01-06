package work5;

//請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
public class No2 {
	public static void randAvg() {
		int[] arr = new int[10];
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 101);
			System.out.print(arr[i]+ " ");
			sum += arr[i];
		}
		System.out.println("平均值:" + (sum / 10));
	}

	public static void main(String[] args) {
		randAvg();
	}

}
