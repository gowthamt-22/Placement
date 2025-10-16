package DAY08;
import java.util.*;

public class gowtham08 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		//countandsay();
		//recursivefactorial();
		/*double a=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.println(calculatearea(a));
		System.out.println(calculatearea(a,b));
		System.out.println(calculateareac(a));*/
		}
static void countandsay(){
	String str="1";
	int n = sc.nextInt();
    for(int i=2;i<=n;i++){
        StringBuilder s=new StringBuilder();
        int count=1;
        for(int j=1;j<str.length();j++){
            if(str.charAt(j)==str.charAt(j-1)){
                count++;
            }else{
                s.append(count).append(str.charAt(j-1));
                count=1;
            }
        }
        s.append(count).append(str.charAt(str.length()-1));
        str=s.toString();
    }System.out.println(str);
    
}
static void recursivefactorial() {
	int n=sc.nextInt();
	System.out.println(fact(n));
}
static int fact(int n) {
	if(n==0||n==1) {
		return 1;}
		else {
			n=n*fact(n-1);
			return n;
		}
	}
static double calculatearea(double a) {
	
	return a*a;
}static double calculatearea(double l,double b) {
	return l*b;
}static double calculateareac(double r) {
	return 3.14*r*r;
}



}

