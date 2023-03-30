package Tourism;
import java.util.*;
import java.io.*;
class MyThread implements Runnable
{
	String  status;
	int sno;
	Thread t;
	MyThread(String st,int n)
	{ 
		sno=n;
		status=st; 
		t=new Thread(this,"Thread"+sno);
		t.start();
	}
	public void run()
	{
		try
		{
			Reader r1=new FileReader(status);
			BufferedReader br1=new BufferedReader(r1);
			String s1=br1.readLine();
			while(s1!=null)
			{
				System.out.println(s1);
				s1=br1.readLine();
				Thread.sleep(1000);
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
public class TourDetails
{
	public void displayTourDetails()
	{
		new MyThread("Bill.txt",1);
	}
}