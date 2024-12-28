package work4;
//有個字串陣列如下 (八大行星):
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//(提示:字元比對,String方法)
public class No3 {
	public void countletter(String[] s, char letter) {
		int count = 0;
		for(int k = 0; k < s.length; k++) {
			for(int j = 0; j < s[k].length(); j++) {
				if(s[k].charAt(j) == letter) {
					count++;
				}
			}	
		}
		System.out.println(letter + "有" + count + "個");
	}
	
	public static void main(String[] args) {
		String[] s = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		No3 a = new No3();
		No3 e = new No3();
		No3 i = new No3();
		No3 o = new No3();
		No3 u = new No3();
		a.countletter(s,'a');
		e.countletter(s,'e');
		i.countletter(s,'i');
		o.countletter(s,'o');
		u.countletter(s,'u');
	}	
}
