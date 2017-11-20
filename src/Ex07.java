import java.util.Date;

interface Runnable{ // 인터페이스 Runnable 구현
	public abstract void run();
}

class PrintTime extends Thread{ // 현재시간과 스레드 이름을 출력하는 스레드 PrintTime 프로그램 
	int num;
	
	public PrintTime(int num) {
		this.num = num;
	}

	public void run() { 
		while(num-- > 0) {
			Date d = new Date();
			System.out.println("순위: " + Thread.currentThread().getPriority() + " " + d.toString() + " "+ Thread.currentThread().getName());
			try {
				sleep(1000);
			} catch (InterruptedException e) { // 예외 처리 모듈
				e.printStackTrace();
			}
		}
	}
}
public class Ex07{ // 클래스 Ex07 의 main() 메소드에서 테스트

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTime p1 = new PrintTime(3);
		Thread th1 = new Thread(p1, "안녕하세요!");
		th1.setPriority(Thread.MAX_PRIORITY-1);
		th1.start();
		
		PrintTime p2 = new PrintTime(6);
		Thread th2 = new Thread(p2, "반갑습니다.");
		th2.setPriority(Thread.MAX_PRIORITY-1);
		th2.start();
	}

}
