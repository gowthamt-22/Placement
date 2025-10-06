package DAY01;

import java.util.Scanner;

public class TIMESTAMP {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String [] arr=str1.split(":");
		int h1=Integer.parseInt(arr[0]);
		int m1=Integer.parseInt(arr[1]);
		int s1=Integer.parseInt(arr[2]);
		
		String str2=sc.nextLine();
		String [] arr2=str2.split(":");
		int h2=Integer.parseInt(arr2[0]);
		int m2=Integer.parseInt(arr2[1]);
		int s2=Integer.parseInt(arr2[2]);
		int time1=h1*3600 +m1*60 +s1;
		
		int time2=h2*3600 +m2*60 +s2;
		System.out.println(Math.abs(time1-time2));
		
	}

}
