package functions;

import java.util.Scanner;

public class bastobase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int no= sc.nextInt();
		int b1= sc.nextInt();
		int b2= sc.nextInt();
		int res= basetobase(no,b1,b2);
		System.out.println(res);

	}
	
public static int basetobase(int no,int b1, int b2) {
	
	
	int x=basetodec(no,b1);
	int y=dectobase(x,b2);
	return y;
}
public static int basetodec(int no,int b1) {
	
	int p=1;
	int dig=0;
	while(no>0)
	{
		int rem=no%10;
		no=no/10;
		rem=rem*p;
		p=p*b1;
		dig+=rem;
	}
	return dig;
}
public static int dectobase(int ans1,int b2) {
	
	int p=1;
	int dig=0;
	while(ans1>0)
	{
		int rem=ans1%b2;
		ans1=ans1/b2;
		rem=rem*p;
		p=p*10;
		dig+=rem;
	}
	return dig;
}

}
