package DAY01;
import java.util.Scanner;
import java.math.BigDecimal;

public class SCIENTIFICNOTATION {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		BigDecimal str1=new BigDecimal(str);
		System.out.println(str1.toPlainString());
	}
	
}
