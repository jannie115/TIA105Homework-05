package work5;
//身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//與數字的亂數組合,
public class No5 {
	public static void main(String[] args) {
		System.out.println(genAuthCode()); 
		
	
	}
	
	
	static String genAuthCode() {
		String code = "";
		for(int i = 1; i <= 8; i++) {
			int r = (int)(Math.random() * 75 + 48);
			while(true) {
				if(47 < r && r < 58) {
					break;				
				}else if(64 < r && r < 91) {
					break;
				}else if(96 < r && r < 123) {
					break;
				}else {
					r = (int)(Math.random() * 75 + 48);
				}
			}
//			System.out.print((char)r);
			code += (char)r;
		}
		return code;
	}
}
