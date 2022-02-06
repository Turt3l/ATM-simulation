package simulation;
import java.util.Random;
public class ATM {
	
	int moneyAvailable;
	boolean isBroken = false;
	String Name;
	
	Random rand = new Random();

	public ATM(int availableMoney, String name) {
		this.moneyAvailable = availableMoney;
		this.Name = name;
	}
	public void deposit(int ammount) {
		this.moneyAvailable += ammount;
	}
	public void withdraw(int ammount) {
		this.moneyAvailable -= ammount;
	}
	public void simulate(int days) {
		for (int j = 1; j <= days; j++) {
			System.out.println("================"+"\nDAY: " + j + "\n================");
			if (isBroken == false) {
				for (int i = 1; i <= 10; i++) {
					int Break = rand.nextInt(0, 60);
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
					if (Break == 5) {
						System.out.println("This ATM just broke: " +this.Name);
						isBroken = true;
						break;
					}
				}
		
			}

			
		}

	}

	
	public static void main(String[] args) {
		ATM atm1 = new ATM(5000, "alpha");
		atm1.simulate(7);
	}
}
