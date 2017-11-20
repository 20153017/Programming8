class InvalidWithdraw extends Exception { // ���ο� ���� InvalidWithdraw ����
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}

class BankAccount { 
	public int money; 
	public int minmoney; // ���� �ܱ��� �����ϴ� �ʵ�
	
	public BankAccount(int minmoney) {
		this.minmoney = minmoney;
	}
	public void deposit(int money) {
		minmoney += money;
		System.out.printf("���� �Ա�ó��: �Աݱݾ� = %d, �ܱ� = %d \n", money, minmoney);
		
	}
	public void withdraw(int money) throws InvalidWithdraw{
		
		if (minmoney >= money) { // ���� �ܱ��� ����ݾ׺��� Ŭ ��
			minmoney -= money;
			System.out.printf("���� ���ó��: ����ݾ� = %d, �ܱ� = %d \n", money, minmoney);
		} 
	}
}
public class Ex03 {
	public static void main(String[] args) throws InvalidWithdraw {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount(0);
		try {
			ba.deposit(100000);
			ba.withdraw(100000);
			ba.withdraw(200000);
			} catch(Exception e) { // ���� ó�� ���
				System.out.println(e);
			}
	}
}
