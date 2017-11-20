
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x = 0, y = 0, z = 0;
			Scanner input = new Scanner(System.in);
			System.out.println("정수 두 개 입력: "); // 정수 두 개를 입력받음
			x = input.nextInt();
			y = input.nextInt();
			z = x * y;
			System.out.printf("%d * %d = %d \n", x, y, z);

		} catch (Exception e) { // 예외 처리 모듈 
			System.out.println("예외 발생 : " + e);
		}
	}

}
