class SavingsAccount
{
// static variable
	public static float annualInterestRate;

// instance variable
	private float savingsBalance;

	public SavingsAccount(float balance)
	{
		this.savingsBalance = balance;
	}

	public float calculateMonthlyInterest()
	{
		float mInterest = (savingsBalance*annualInterestRate)/(12*100);

		this.savingsBalance += mInterest;

		return savingsBalance; //returning the new saving balance after adding with the monthly interest of the month
	}

	public static void modifyInterestRate(float newIRate)
	{
		annualInterestRate = newIRate;
	}

	public float show()
	{
		return savingsBalance;
	}
}

public class Assignment_6_2_1601cs41
{
	public static void main(String[] args) 
	{
		SavingsAccount saver1 = new SavingsAccount(1000);	
		SavingsAccount saver2 = new SavingsAccount(3500);

		saver1.annualInterestRate = 5;

		float mISaver1 = saver1.calculateMonthlyInterest();
		float mISaver2 = saver2.calculateMonthlyInterest();

		System.out.println("New Balance of saver1 after 1st month is: " + Float.toString(mISaver1));
		System.out.println("New Balance of saver2 after 1st month is: " + Float.toString(mISaver2));

		saver1.annualInterestRate = 10;

		float mISaver1_2 = saver1.calculateMonthlyInterest();
		float mISaver2_2 = saver2.calculateMonthlyInterest();

		System.out.println("New Balance of saver1 after 2nd month is: " + Float.toString(mISaver1_2));
		System.out.println("New Balance of saver2 after 2nd month is: " + Float.toString(mISaver2_2));
	}
}
