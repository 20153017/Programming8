class PrimeNumber03 implements Runnable { // �������̽� Runnable�� �����ϴ� Ŭ���� PrimeNumber03
	public int end;
	
	public PrimeNumber03(int end) {
		this.end = end;
	}
	
	public void run() {
		int j = 0;
		for (int num=2; num <= this.end; num++) { //2���� 25������ ���� �� �Ҽ��� ���
			for(int i =1; i<=num; i++) {
				if(num%i == 0) {
					j += 1; // ������ ������ �� ���� 1�� ������Ŵ
				}
			}
			if(j == 2) { // ����������� ��찡 2���� �� ���
				System.out.printf("%d ", num);
				j = 0;
			}
			else { // 2���� �ƴϿ��� �������� �Ǻ��� ���� �ʱ�ȭ
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
		
		Thread pn = new Thread(new PrimeNumber03(25), "�Ҽ� ����� ������");
		System.out.println(pn.getName());
		pn.start();
	}
}
