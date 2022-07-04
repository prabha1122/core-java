import java.util.*;
abstract class Staff
{
	String name;
	int age;
	int salary;
	String pos;
	static int count=0;
	Staff()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter name :");
		name=sc.nextLine();
		System.out.print("\n Enter Age :");
		age=sc.nextInt();
            
		
		
	}
	public void display()
	{
		System.out.println("\nNAME:"+name+ "\nAGE:"+age+ "\nSALARY:"+salary+"\nPosition:"+pos);	
	}
	public abstract void riseSalary();	
	
	
}

final class Principal extends Staff {
	public Principal(){
		salary=100000;
		pos="Principal";
	}
	public void riseSalary(){
           
		salary=salary+50000;
		
	}
}

final class HOD extends Staff{
	public HOD(){
		salary=80000;
		pos="Head of the Department";
	}
	public void riseSalary(){
           
		salary=salary+30000;
           
		
	}
}
final class Lecturer extends Staff{
	public Lecturer(){
		salary=70000;
		pos="Lecturer";
	}
	public void riseSalary(){
           
		salary=salary+20000;
		
	}
}
final class PET extends Staff {
	public PET(){
		salary=10000;
		pos="Physical Educational Teacher";
	}
	public void riseSalary(){
           
		salary=salary+5000;
		
	}
}

public class Collections {
	public static void main(String args[])
	{
		int ch1=0,ch2=0;
		
		ArrayList<Staff> list=new ArrayList<Staff>();
		
		do{ 
		System.out.println("--------------------------------");
		System.out.println("1.Create");
		System.out.println("2.Display");
		System.out.println("3.RiseSalary");
		System.out.println("4.Exit");
		System.out.println("--------------------------------");
		System.out.println("Enter your Choice: ");
		Scanner sc1=new Scanner(System.in);
		ch1=sc1.nextInt();

			if(ch1==1){
			do{
				System.out.println("--------------------------------");
				System.out.println("1.Principal");
				System.out.println("2.HOD");
				System.out.println("3.lecturer");
                        System.out.println("4.PET");
				System.out.println("5.Exit");
				System.out.println("--------------------------------");
				System.out.println("Enter your Choice: ");
				Scanner sc2=new Scanner(System.in);
				ch2=sc2.nextInt();
				switch(ch2){
					case 1:
						
						list.add( new Principal() );
						
						break;
						
					case 2:
						list.add(new HOD());
						break;
					
					case 3:
						list.add(new Lecturer());
						break;
                              case 4:
						list.add(new PET());
						break;
					}
			}while(ch2!=5);
		}
		if(ch1==2)
		{
			Iterator i=list.iterator();
			while(i.hasNext())
			{
				Staff y=(Staff) i.next();
				y.display();
			}
			
		}
		if(ch1==3)
		{
			Iterator i=list.iterator();
			while(i.hasNext())
			{
				Staff y=(Staff) i.next();
				y.riseSalary();
                        
			}
		}
		}while(ch1!=4);
		
	}
}