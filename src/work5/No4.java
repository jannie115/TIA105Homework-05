package work5;

/*請設計一個類別MyRectangle:
(1) 有兩個double型態的屬性為width, depth
(2) 有三個方法:
void setWidth(double width): 將收到的引數指定給width屬性
void setDepth(double depth): 將收到的引數指定給depth屬性
double getArea(): 能計算該長方形的面積
(3) 有兩個建構子:
public MyRectangle(): 不帶參數也無內容的建構子
public MyRectangle(double width, double depth): 傳入的兩個引數會指定給對應的屬性
• 請另外建立一個MyRectangleMain類別,此類別只有main方法
(1) 使用public MyRectangle()建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果
(2) 使用public MyRectangle(double width, double depth)建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果*/
public class No4 {
	public static void main(String[] args) {
		MyRectangle a = new MyRectangle();
		a.setWidth(10);
		a.setDepth(20);
		System.out.println(a.getArea());
		MyRectangle b = new MyRectangle(10, 20);
		System.out.println(b.getArea());
	}
}

class MyRectangle {
	private double width, depth;

	// 將收到的引數指定給width屬性
	void setWidth(double width) {
		this.width = width;
	}

	// 將收到的引數指定給depth屬性
	void setDepth(double depth) {
		this.depth = depth;
	}

	// 能計算該長方形的面積
	double getArea() {
		return width * depth;
	}

	// 不帶參數也無內容的建構子
	public MyRectangle() {
	}

	// 傳入的兩個引數會指定給對應的屬性
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
}
