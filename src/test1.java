
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x = 0, y = 0, z = 0;
			Scanner input = new Scanner(System.in);
			System.out.println("���� �� �� �Է�: "); // ���� �� ���� �Է¹���
			x = input.nextInt();
			y = input.nextInt();
			z = x * y;
			System.out.printf("%d * %d = %d \n", x, y, z);

		} catch (Exception e) { // ���� ó�� ��� 
			System.out.println("���� �߻� : " + e);
		}
	}

}