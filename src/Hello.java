
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		System.out.println("lab2_1: �ڹ̸�\n");
		Scanner input = new Scanner(System.in);

		System.out.print("���ø��� �Է��Ͻÿ�:");
		String city = input.nextLine();
		System.out.print("�α� �Է��Ͻÿ�:");
		int population = input.nextInt();
		System.out.print("��ձ���� �Է��Ͻÿ�:");
		double averageDegree = input.nextDouble();
		System.out.print("���ø� =" + city);
		System.out.print("�α� =" + population);
		System.out.print("��ձ�� =" + averageDegree);
	}
}