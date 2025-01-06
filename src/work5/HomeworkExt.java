package work5;

public class HomeworkExt {
	//• (3) 多型操作，當共同呼叫write()方法與getPrice()方法，各種筆都可正確顯示write內容與售價金額
	public static void main(String[] args) {
		Pen[] p = new Pen[2];
		p[0] = new Pencil("chiikawa",100);
		p[1] = new InkBrush("ussagi",200);
//		p[0].setPrice(10);
		for(int i = 0; i < p.length; i++) {
			p[i].write();
			System.out.println(p[i].getPrice()); 
		}
		
	}
}
//建立父類別Pen
abstract class Pen{
	//• (1) 兩個屬性：品牌(brand)、價格(price) (封裝設計)
	private String brand;
	private double price;
	//• (2) 建構子設計：一個無參數與一個根據屬性而設計
	public Pen() {
	}
	public Pen(String brand, double price) {
		this.brand = brand;
		if(price > 0) {
			this.price = price;
		}else {
			System.out.println("輸入金額錯誤，請重新輸入");
		}
	}
	//• (3) 定義Getter/Setter方法
	public String getBrand() {
		return brand;
	}
	public double getPrice() {
		return price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(double price) {
		if(price > 0) {
			this.price = price;
		}else {
			System.out.println("輸入金額錯誤，請重新輸入");
		}
			
	}
	//• (4) 宣告一個抽象方法write()
	public abstract void write();
}

//• 建立兩個子類別Pencil與InkBrush繼承Pen父類別
class Pencil extends Pen{
	//• (1) 實作方法：Pencil輸出為削鉛筆再寫，InkBrush為沾墨汁再寫
	public void write() {
		System.out.println("Pencil削鉛筆再寫");
	}
		//• (2) Pencil實際售價為定價8折，InkBrush為定價9折
	public Pencil(String brand, double price) {
		super(brand,price * 0.8);
	}
	public void setPrice(double price) {
		super.setPrice(price*0.8);
	}
}

class InkBrush extends Pen{
	//• (1) 實作方法：Pencil輸出為削鉛筆再寫，InkBrush為沾墨汁再寫
	public void write() {
		System.out.println("InkBrush沾墨汁再寫");
	}
	//• (2) Pencil實際售價為定價8折，InkBrush為定價9折
	public InkBrush(String brand, double price) {
		super(brand,price * 0.9);
	}
	public void setPrice(double price) {
		super.setPrice(price*0.9);
	}
}

