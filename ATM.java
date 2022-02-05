package simulation;
import java.util.Random;
public class ATM {
	
	int moneyAvailable;
	Random rand = new Random();

	public ATM(int availableMoney) {
		this.moneyAvailable = availableMoney;
	}
	public void deposit(int ammount) {
		this.moneyAvailable += ammount;
	}
	public void withdraw(int ammount) {
		this.moneyAvailable -= ammount;
	}
	public void simulate(int amt) {
		
		for (int i = 1; i <= amt; i++) {
			int action = rand.nextInt(1, 3);
			if (action == 1) {
				this.deposit(rand.nextInt(0, 500));
				System.out.println("Deposited");
				System.out.println(this.moneyAvailable);
				}
			if (action == 2) {
				this.withdraw(rand.nextInt(0, 500));
				System.out.println("Withdraw");
				System.out.println(this.moneyAvailable);
				
			}
		}
		System.out.println("Money left on the ATM: " +this.moneyAvailable);
	}
	
	public static void main(String[] args) {
		ATM atm1 = new ATM(10000);
		atm1.simulate(10);
	}
}
