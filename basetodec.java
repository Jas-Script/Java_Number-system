package functions;

import java.util.Scanner;

public class basetodec {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int b=sc.nextInt();
		int x= bastodec(no,b);
		System.out.println(x);

	}
	public static int bastodec(int no,int b)
	{int dig=1;
	int res=0;
		while(no>0)
		{
			int rem=no%10;
			no=no/10;
			res+=rem*dig;
			dig=dig*b;
		}
		return res;
	}
	
}
