package work1;

/*請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
5+5
5+'5'
5+"5"
並請用註解各別說明答案的產生原因 */
public class No6 {
	public static void main(String[] args) {
		System.out.println(5 + 5); // 兩個5皆為int +為運算子 所以單純計算5+5=10
		System.out.println(5 + '5');// '5'為char，'5'的Unicode為53，所以是計算int 5+53=58
		System.out.println(5 + "5");// "5"為string，只是接在int 5後面
	}
}
