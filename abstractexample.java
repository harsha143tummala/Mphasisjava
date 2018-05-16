import java.util.*;
abstract class examsof{
abstract void inputStudentdetails();
abstract void inputStudentmarks();
void Studentclass(){
	System.out.println("he is a student of class X");
	
}
}
public class Abstracte extends examsof
{
	void inputStudentdetails()
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter rollno name of the student");
		int rollno=ob.nextInt();
		String name=ob.next();
	}
	 void inputStudentmarks()
	 {
		 Scanner ob=new Scanner(System.in);
		 System.out.println("enter phy chem and biology");
		 int phy=ob.nextInt();
		 int chem=ob.nextInt();
		 int biology=ob.nextInt();
		 int total=phy+chem+biology;
		 System.out.println("the total marks are"+total);
		 }
	public static void main(String[] args) {
		Abstracte ch=new Abstracte();
		ch.inputStudentdetails();
		ch.inputStudentmarks();
	}
}


