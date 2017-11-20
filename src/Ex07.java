import java.util.Date;

interface Runnable{ // �������̽� Runnable ����
	public abstract void run();
}

class PrintTime extends Thread{ // ����ð��� ������ �̸��� ����ϴ� ������ PrintTime ���α׷� 
	int num;
	
	public PrintTime(int num) {
		this.num = num;
	}

	public void run() { 
		while(num-- > 0) {
			Date d = new Date();
			System.out.println("����: " + Thread.currentThread().getPriority() + " " + d.toString() + " "+ Thread.currentThread().getName());
			try {
				sleep(1000);
			} catch (InterruptedException e) { // ���� ó�� ���
				e.printStackTrace();
			}
		}
	}
}
public class Ex07{ // Ŭ���� Ex07 �� main() �޼ҵ忡�� �׽�Ʈ

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTime p1 = new PrintTime(3);
		Thread th1 = new Thread(p1, "�ȳ��ϼ���!");
		th1.setPriority(Thread.MAX_PRIORITY-1);
		th1.start();
		
		PrintTime p2 = new PrintTime(6);
		Thread th2 = new Thread(p2, "�ݰ����ϴ�.");
		th2.setPriority(Thread.MAX_PRIORITY-1);
		th2.start();
	}

}
