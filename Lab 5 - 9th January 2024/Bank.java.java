import java.util.Scanner;
import java.lang.Math;
class Account
{
	String customername;
	int accountnumber;
	float balance=0;
	void deposit(float amount)
	{
		balance=balance+amount;
	}
}
class Cur_Acct extends Account
{
	int penaltyimposed=0;
	void check_minimum_balance()
	{
		if(balance<300)
		{
			System.out.println("Your current account balance is less than Rs.300. A service charge of Rs.50 is imposed. ");
			balance=balance-50;
			penaltyimposed=1;
		}
		else
		{
			penaltyimposed=0;
		}
	}
	void withdrawal(float amount)
	{
		if((balance-amount)>=0)
		{
			if(penaltyimposed==0)
			{
				balance=balance-amount;
				check_minimum_balance();
			}
			else
			{
				System.out.println("The penalty is already imposed due to lack of minimum balance. Cannot withdraw.");
			}
			
		}
		else	
			System.out.println("Balance is too less to withdraw.");
	}
}
class Sav_Acct extends Account
{
	double interestrate=0.06;
	double calculate_interest(int years)
	{
		return(Math.pow(1.06,years)*balance);
	}
	void withdrawal(float amount)
	{
		if(balance<amount)
		{
			System.out.println("Balance is too less to withdraw the required amount.");
		}
		else
		{
			balance=balance-amount;
		}
	}
}
class Bank
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String customername;
		Cur_Acct current=new Cur_Acct();
		Sav_Acct savings=new Sav_Acct();
		int choice;
		int accounttype;
		System.out.println("Enter the customer name.");
		current.customername=savings.customername=s.nextLine();
		System.out.println("Enter the account number.");
		current.accountnumber=savings.accountnumber=s.nextInt();
		System.out.println("Deposit a minimum balance of Rs.300 for the current account.");
		current.balance=300;
		while(true)
		{
			System.out.println("-------MENU-------");
			System.out.println("ENTER 1 TO DEPOSIT MONEY, 2 TO WITHDRAW MONEY, 3 TO CALCULATE INTEREST FOR SAVINGS ACCOUNT, 4 TO DISPLAY THE DETAILS AND BALANCE AND 5 TO EXIT.");
			System.out.println("ENTER YOUR CHOICE");
			choice=s.nextInt();
			if(choice==1)
			{
				float amount;
				System.out.println("ENTER 1 TO DEPOSIT IN THE CURRENT ACCOUNT AND ENTER 2 TO DEPOSIT IN THE SAVINGS ACCOUNT");
				accounttype=s.nextInt();
				if(accounttype==1)
				{
					System.out.println("Enter the amount to deposit into the current account.");
					amount=s.nextFloat();
					current.deposit(amount);
				}
				else if(accounttype==2)
				{
					System.out.println("Enter the amount to deposit into the savings account.");
					amount=s.nextFloat();
					savings.deposit(amount);
				}
				else
					System.out.println("Invalid number entered.");
			}
			else if(choice==2)
			{
				float amount;
				System.out.println("ENTER 1 TO WITHDRAW FROM THE CURRENT ACCOUNT AND ENTER 2 TO WITHDRAW FROM THE SAVINGS ACCOUNT");
				accounttype=s.nextInt();
				if(accounttype==1)
				{
					System.out.println("Enter the amount to withdraw from the current account.");
					amount=s.nextFloat();
					current.withdrawal(amount);
				}
				else if(accounttype==2)
				{
					System.out.println("Enter the amount to withdraw from the savings account.");
					amount=s.nextFloat();
					savings.withdrawal(amount);
				}
				else
					System.out.println("Invalid number entered.");
			}
			else if(choice==3)
			{
				int years;
				System.out.println("Enter the number of years to compound.");
				years=s.nextInt();
				System.out.println("The balance in your savings account at the end of "+years+" years after compounding annually at a rate of 6% is "+savings.calculate_interest(years));
			}
			else if(choice==4)
			{
				System.out.println("ACCOUNT DETAILS:");
				System.out.println("CUSTOMER NAME:"+current.customername);
				System.out.println("ACCOUNT NUMBER:"+current.accountnumber);
				System.out.println("SAVINGS ACCOUNT BALANCE:"+savings.balance);
				System.out.println("CURRENT ACCOUNT BALANCE:"+current.balance);
			}
			else if(choice==5)
				break;
			else
				System.out.println("Invalid number entered.");
			System.out.println("\n\n");
		}


	}
}