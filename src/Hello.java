
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		System.out.println("lab2_1: 박미리\n");
		Scanner input = new Scanner(System.in);

		System.out.print("도시명을 입력하시요:");
		String city = input.nextLine();
		System.out.print("인구 입력하시요:");
		int population = input.nextInt();
		System.out.print("평균기온을 입력하시요:");
		double averageDegree = input.nextDouble();
		System.out.print("도시명 =" + city);
		System.out.print("인구 =" + population);
		System.out.print("평균기온 =" + averageDegree);
	}
}