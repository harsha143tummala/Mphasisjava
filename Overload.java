package hari.sow;
package hari.sow;

public class Overload {

	int sum(int a,int b)
	{ return a+b;}
	int sum(int a,int b,int c)
	{ return a+b+c; }
	float sum(float a,float b)
	{ return a+b; }
	public static void main(String[] args) {
		Overload ff=new Overload();
		System.out.println("the sum is "+ff.sum(1,2));
		System.out.println("the sum2 is "+ff.sum(1, 2,33));
		System.out.println("floate is "+ff.sum(2.2f,44.55f));
	}

}
