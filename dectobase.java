package functions;

import java.util.Scanner;

public class dectobase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int no=sc.nextInt();
		int b=sc.nextInt();
		int result=dectobase(no,b);
		System.out.println(result);

	}

	public static int dectobase(int n, int b)
	{
		int rv=0;
		int p=1;
		while(n>0)
		{
			int dig=n%b;
			n=n/b;
			rv+=dig*p;
			p=p*10;
		}
		return rv;
	}
}
