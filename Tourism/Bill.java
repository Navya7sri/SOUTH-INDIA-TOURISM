package Tourism;
import java.util.*;
import java.lang.*;
import java.io.*;
interface Transactions
{
	public double Transaction(double total,String state);
	public void TransactionDetails(double Amount);
}
public class Bill
{

	int P,N,i=0;
	double Total;
	Scanner sc = new Scanner(System.in);
	public double Transaction(double tot,String State)
	{
		try
		{
			BufferedWriter bw=new BufferedWriter(new FileWriter("Bill.txt",false));
			System.out.println("----------Enter Your Details----------");
			System.out.println("Enter your Full name : ");
			String name=sc.nextLine();
			System.out.println("Enter your Mobile Number : ");
			String number=sc.nextLine();
			System.out.println("No of Persons : ");
			P=sc.nextInt();
			System.out.println("No of Nights you want to stay : ");
			N=sc.nextInt();	
			Total = N*P*tot;	
			String str=String.valueOf(Total);			
			String persons=String.valueOf(P);
			String nights=String.valueOf(N);
			ArrayList<String> Details = new ArrayList<String>();
			Details.add("*************Your Tour Details****************");
			Details.add("Name : "+name);
			Details.add("Phone Number : "+number);
			Details.add("State : "+State);
			Details.add("No.of Nights : "+nights);
			Details.add("No.of persons : "+persons);
			Details.add("Total Amount : "+str);
			Details.add("Transaction Status : Successful");
			Iterator itr = Details.iterator();
			while(itr.hasNext())
			{
                bw.write(itr.next().toString());
                bw.newLine();
            }
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return Total;
	}
	public void TransactionDetails(double Amo)
	{
		try
		{
			System.out.println("------------Payable Amount in Rupees------------");
			System.out.println("Total Bill : "+Amo);
			System.out.print("Press any key to make Payment : ");
			String a=sc.nextLine();
			String b=sc.nextLine();
			System.out.println("-------------Your Transaction Successfull-------");		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}