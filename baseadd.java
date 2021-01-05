package functions;

import java.util.Scanner;

public class baseadd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no1= sc.nextInt();
		int no2= sc.nextInt();
		int b= sc.nextInt();
		int res= getSum(b,no1,no2);
		System.out.println(res);

	}
	
	public static int getSum(int b, int n1, int n2) {
        int rv = 0;

        int c = 0;
        int p = 1;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int d = d1 + d2 + c;
            c = d / b;
            d = d % b;

            rv += d * p;
            p = p * 10;
        }

        return rv;
    }

}
