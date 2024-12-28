package work4;
//班上有8位同學,他們進行了6次考試結果如下:
//請算出每位同學考最高分的次數
import java.util.Arrays;


public class No6 {
	public static int no1count(int k,int[][] s) {
		int no1 = 0;
		for(int j=1;j<s.length;j++) {
			int count = 0;
			for (int i=0; i < s[j].length;i++) {
//				System.out.println(s[j][k]+" "+s[j][i]);
				if (s[j][k] > s[j][i]) {
					count++;
				}
				if(count == 7) {
				no1++;
//				System.out.println(no1);
				break;
				}
			}
		}
			
		
		System.out.println(s[0][k]+ "號同學考最高分的次數:" + no1 + "次");
		return no1;
	}
	
	public static void main(String[] args) {
		int[][] score = {
						{1,2,3,4,5,6,7,8},//2,1,1,1,0,0,0,1
						{10,35,40,100,90,85,75,70},
						{37,75,77,89,64,75,70,95},
						{100,70,79,90,75,70,79,90},
						{77,95,70,89,60,75,85,89},
						{98,70,89,90,75,90,89,90},
						{90,80,100,75,50,20,99,75}
		};
		for(int k = 0; k<8; k++) {
			no1count(k,score);
		}
//		no1count(7,score);
		
		
	}
	
 			

}
