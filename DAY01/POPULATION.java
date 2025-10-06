package DAY01;
import java.math.*;
import java.util.Scanner;

public class POPULATION {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		String c=sc.nextLine();
		BigInteger a1=new BigInteger(a);
		BigInteger b1=new BigInteger(b);
		BigInteger c1=new BigInteger(c);
		BigInteger sum=a1.add(b1).add(c1);
		System.out.println("Population:" +sum);// TODO Auto-generated method stub

	}

}
