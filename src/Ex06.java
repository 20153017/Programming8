class PrimeNumber03 implements Runnable { // 인터페이스 Runnable을 구현하는 클래스 PrimeNumber03
	public int end;
	
	public PrimeNumber03(int end) {
		this.end = end;
	}
	
	public void run() {
		int j = 0;
		for (int num=2; num <= this.end; num++) { //2부터 25까지의 숫자 중 소수를 출력
			for(int i =1; i<=num; i++) {
				if(num%i == 0) {
					j += 1; // 나누어 떨어질 때 마다 1씩 누적시킴
				}
			}
			if(j == 2) { // 나누어떨어지는 경우가 2번인 수 출력
				System.out.printf("%d ", num);
				j = 0;
			}
			else { // 2번이 아니여도 다음수의 판별을 위해 초기화
				j = 0;
			}
		}
	}
}
public class Ex06 extends PrimeNumber03{
	public Ex06(int end){
		super(end);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread pn = new Thread(new PrimeNumber03(25), "소수 만드는 스레드");
		System.out.println(pn.getName());
		pn.start();
	}
}
