package DAY01;
import java.util.Scanner;
public class FINANCIALREPORT {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String [] arr=str.split(",");
		String a=arr[0];
		Double b=Double.parseDouble(arr[1]);
		int c=Integer.parseInt(arr[2]);
		System.out.printf("%-20s%10.2f%5d",a,b,c);
		
	}
                                                                                                                         
}
