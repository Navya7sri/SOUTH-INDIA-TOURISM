import java.util.*;
class Main
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice=0,n1,n2;
		double bill;
		System.out.println("**********Welcome to South India Tourism************");
		System.out.println("Select the state : ");
		System.out.println("1.Kerala");
		System.out.println("2.TamilNadu");
		System.out.println("3.Maharastra");
		System.out.println("4.Karnataka");
		System.out.println("5.Exit");
		choice=sc.nextInt();		
		switch(choice)
		{
			case 1: Tourism.Kerala k=new Tourism.Kerala();
					System.out.println("Choose The Package : ");
					bill=k.ChoosePackage();
					Tourism.Bill b1=new Tourism.Bill();
					double A1= b1.Transaction(bill,"Kerala");
					b1.TransactionDetails(A1);
					Tourism.TourDetails t1=new Tourism.TourDetails();
					t1.displayTourDetails();
					break;		
			case 2: Tourism.TamilNadu t=new Tourism.TamilNadu();
					System.out.println("Choose The Package : ");
					bill=t.ChoosePackage();
					Tourism.Bill b2=new Tourism.Bill();
					double A2= b2.Transaction(bill,"TamilNadu");
					b2.TransactionDetails(A2);
					Tourism.TourDetails t2=new Tourism.TourDetails();
					t2.displayTourDetails();
					break;
			case 3: Tourism.Maharastra m=new Tourism.Maharastra();
					System.out.println("Choose The Package : ");
					bill=m.ChoosePackage();
					Tourism.Bill b3=new Tourism.Bill();
					double A3= b3.Transaction(bill,"Maharastra");
					b3.TransactionDetails(A3);
					Tourism.TourDetails t3=new Tourism.TourDetails();
					t3.displayTourDetails();
					break;
			case 4: Tourism.Karnataka k1=new Tourism.Karnataka();
					System.out.println("Choose The Package : ");
					bill=k1.ChoosePackage();
					Tourism.Bill b4=new Tourism.Bill();
					double A4= b4.Transaction(bill,"Karnataka");
					b4.TransactionDetails(A4);
					Tourism.TourDetails t4=new Tourism.TourDetails();
					t4.displayTourDetails();
					break;		
			case 5: System.out.println("ThankYou for visiting Our Website\nHope we will see you again......");
					System.exit(0); 
			
			default: System.out.println("Choose the correct option!!!");
		}	
	}
}