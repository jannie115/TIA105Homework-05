package work1;

//03.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
public class No3 {
	public static void main(String[] args) {
		int time = 256559;
		int day = time / 60 / 60 / 24;
		int hour = time / 60 / 60 - (day * 24);
		int min = time / 60 - (day * 24 * 60) - (hour * 60);
		int sec = time % 60;

		System.out.println(time + "秒=" + day + "天" + hour + "時" + min + "分" + sec + "秒");
	}
}
