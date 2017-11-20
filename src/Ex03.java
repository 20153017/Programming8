class InvalidWithdraw extends Exception { // 새로운 예외 InvalidWithdraw 구헌
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}

class BankAccount { 
	public int money; 
	public int minmoney; // 최저 잔금을 저장하는 필드
	
	public BankAccount(int minmoney) {
		this.minmoney = minmoney;
	}
	public void deposit(int money) {
		minmoney += money;
		System.out.printf("정상 입금처리: 입금금액 = %d, 잔금 = %d \n", money, minmoney);
		
	}
	public void withdraw(int money) throws InvalidWithdraw{
		
		if (minmoney >= money) { // 최저 잔금이 인출금액보다 클 때
			minmoney -= money;
			System.out.printf("정상 출금처리: 인출금액 = %d, 잔금 = %d \n", money, minmoney);
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
			} catch(Exception e) { // 예외 처리 모듈
				System.out.println(e);
			}
	}
}
