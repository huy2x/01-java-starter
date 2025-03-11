package HelloWord;

import java.util.Scanner;

public class HelloWord {

	public static void main(String[] args) {
		System.out.println("Hello Word");
		Scanner scanner = new Scanner(System.in);
		// Bài 1
//		System.out.println("Nhập tên sv: ");
//		String name = scanner.nextLine();
//		System.out.println("Nhập điểm tb: ");
//		String point = scanner.nextLine();
//		System.out.println("Sinh viên: " + name + " Có điểm: " + point);

		// bài 2
//		System.out.println("Nhập vào chiều rộng: ");
//		Double width = scanner.nextDouble();
//		System.out.println("Nhập vào chiều dài: ");
//		Double length = scanner.nextDouble();
//		System.out.println("Chu vi hình chữ nhật là: " + (width + length) * 2);
//		System.out.println("Diện tích hình chữ nhật là: " + (width * length));
//		System.out.println("Cạnh nhỏ nhất là: " + Math.min(width, length));

		// bài 3
		System.out.println("Nhập vào cạnh của khối lập phương: ");
		Double edge = scanner.nextDouble();
		System.out.println("Thể tích khối lập phương là: " + Math.pow(edge, 3));
		scanner.close();
	}
}
