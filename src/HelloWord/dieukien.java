package HelloWord;

public class dieukien {

	public static void main(String[] args) {
//		Bài tập: Viết chương trình tính thuế
//		Viết chương trình cho phép nhập vào số tiền thuế (đơn vị là triệu đồng), và in ra kết quả:
//		- dưới 10M: không đóng thuế
//		- từ 10M tới 15M: thuế 10%
//		- từ 15 tới 30M : thuế 20%
//		- trên 30M: thuế 50%
//		Ví dụ: nhập vào 25M -> in ra kết quả "thuế 20%"

//		int x = 25000000;
//		if (x < 10000000) {
//			System.out.println("khong can dong thue");
//		} else if (x >= 10000000 && x <= 15000000) {
//			System.out.println("cong them thue 10% " + x * 0.1);
//		} else if (x >= 15000000 && x <= 30000000) {
//			System.out.println("cong them thue 20% " + x * 0.2);
//		} else if (x > 30000000) {
//			System.out.println("thue 30%" + x * 0.5);
//		}
		int day = 4;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("dont't know");
		}

	}
}
