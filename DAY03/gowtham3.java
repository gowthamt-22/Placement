package DAY03;
import java.util.*;
public class gowtham3 {
	static Scanner sc=new Scanner(System.in) ;
	public static void main(String[] args) {
		//p1();
		//p2();
		//primenumber();
		//multiply();
		//author();
		//sum();
		//div();
		//breakdowhile();
		//stress();
		hari();
		
	}
	static void p1() {
		int n=sc.nextInt();
		int step=0;
		while(n!=1) {
			if(n%2==0) {
				n=n/2;
				}
			else {
				n=3*n+1;
				
			}
			step++;
		}
		System.out.println(step);
	}
    static void p2() {
    	String s=sc.next();
    	int n=0;
    	int sum=0;
    	int a=0;
    	int ans;
    	for(int i=0;i<9;i++) {
    		int digit=s.charAt(i)-'0';
    		sum=sum+(digit) *(i+1);
    		
    	}
    	a=sum%11;
    	String str = null;
    	if(a==10) {
    		System.out.println(s+"X");
    		
    		
    	}
    	else {
    		str=s+a;
    		
    		
    	}
    	System.out.println(str);
    }
    static void primenumber() {

    	
		int n =sc.nextInt();
		int count=0;
		int num=2;
		outerloop:
		while(count<n) {
			for(int i=2;i<=num;i++) {
				if(i%num==0) {
					num++;
					continue outerloop;
					  
				}
				
					
				}
				
			}
			System.out.println(num);
			
			count++;
			
			                     
			
		}
    static void multiply() {
    	int m=sc.nextInt();
    	for(int i=1;i<=100;i++) {
    		if(m%i==0) {
    			continue;
    		}
    		else {
    			System.out.println(i+" ");
    		}
    	}
    }
     static void author() {
    	 outerloop:
    	 for(int i=1;i<=10;i++) {
    		 for(int j=1;j<=10;j++) {
    			 if((i+j)%7==0) {
    				 continue outerloop;
    			 }
    			 System.out.println("(" + i + "," +j + ")" );
    		 }
    	 }
     }
    static void sum() {
    	int t=0;
    	while(true) {
    		int n=sc.nextInt();
            t=t+n;
            if(t>1000) {
            	break;
            }
    		
    	}System.out.println(t);
    	
    }
    static void div() {
    	//int n=sc.nextInt();
    	int num=0;
    	
    	for(int i=1;i<= 10000;i++) {
    		int sums=0;
    		for(int j=1;j<=i/2;j++) {
    			
    			if(i%j==0) {
    				sums=sums+j;
    				
    			}
    			if(sums>i) {
    				break;
    			}
    			
			
				
    		}	if(sums==i) {
				System.out.println(i);
				
				
			
			}
    	}
    		
    }
    static void breakdowhile() {
    	do {
    	
    		if(sc.nextLine().equalsIgnoreCase("exit")) {
    			System.out.println("exiting.....");
    			break;
    		}
    	
    		
    	
    }while(true);










}
    static void stress() {
    	String s=sc.nextLine();
    	boolean flag=false;
    	for(int i=0;i<s.length();i++) {
    		char ch=s.charAt(i);
    		boolean found=true;
    		for(int j=0;j<s.length();j++) {
    			
    			if(s.charAt(j)==ch && i!=j ) {
    				
    				found=false;
    				break;
    				
    			
    		}else {
    			found=true;
    		}
    			
    			
    		}
    if(found) {
    	System.out.println(s.charAt(i));
    	flag=true;
    	break;
    }



    }
    	if(!flag) 
    	{
    		System.out.println("no unique character found");}}
    static void hari() {
    	String str=sc.nextLine();
    	String[] p=str.split(",");
    	int[] arr=new int[p.length];
    	for(int i=0;i<p.length;i++) {
    		arr[i]=Integer.parseInt(p[i].trim());
    		
    	}
    	int sum=0;
    	for(int num:arr) {
    		if(num<0) {
    			continue;
    		}sum=sum+num;
    		
    		
    		
    	}System.out.println(sum);
		
    	
    }




}









