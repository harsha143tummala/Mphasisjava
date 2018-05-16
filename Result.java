import java.util.*;
 class EXAM1 {
int a,b,c,d;
Scanner hu=new Scanner(System.in);
void harsha(){
	System.out.println("enter the values of a,b,c,d");
	a=hu.nextInt();
	b=hu.nextInt();
	c=hu.nextInt();
	d=hu.nextInt();
}
}
class Result extends EXAM1{
	int f,y;
	void sowbha()
	{
		super.harsha();
		 y=(a+b+c+d);
		f=(y/4);
	}
 void display(){
	 System.out.println("the marks for harsha are "+a+b+c+d+" with an total of "+y+" and averag of "+f);
	
}
	public static void main(String[] args) {
Result re=new Result();
re.sowbha();
re.display();
	}}
