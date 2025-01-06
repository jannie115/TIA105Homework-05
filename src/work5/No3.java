package work5;

import java.util.Arrays;

//利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//可以找出二維陣列的最大值並回傳,如圖:
public class No3 {
	
	
	public int maxElement(int x[][]) {
		int[] y = new int[x.length];
		for(int i = 0; i < x.length; i++) {
			Arrays.sort(x[i]);
			y[i] = x[i][x[i].length - 1];		
		}
		Arrays.sort(y);
		return y[y.length - 1];
	}
	
	
	public double maxElement(double x[][]) {
		double[] y = new double[x.length];
		for(int i = 0; i < x.length; i++) {
			Arrays.sort(x[i]);
			y[i] = x[i][x[i].length - 1];		
		}
		Arrays.sort(y);
		return y[y.length - 1];
	}
	
	public static void main(String[] args) {
		int[][] intArray = {
				{1, 6, 3},
				{9, 5, 2}
				};
		double[][] doubleArray = {
									{1.2, 3.5, 2.2},
									{7.4, 2.1, 8.2}
								};
		No3 w = new No3();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
		
	}
}
