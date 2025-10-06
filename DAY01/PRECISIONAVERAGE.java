package DAY01;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class PRECISIONAVERAGE {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		BigDecimal sum=BigDecimal.ZERO;
		int N=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<N;i++) {
			
			String s=sc.nextLine();
			BigDecimal bg=new BigDecimal(s);
			sum=sum.add(bg);
			
			
			
			
			
		}
		BigDecimal avg=sum.divide(BigDecimal.valueOf(N),10,RoundingMode.HALF_UP);
		System.out.println(avg.toPlainString());
		
	}
}
