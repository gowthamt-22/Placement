package DAY04;
import java.util.*;
public class day04 {
	static Scanner sc=new Scanner(System.in);
	public static void main (String[] args) {
		//space();
		//int a=130;//130-256
		//byte b=(byte)a;
		//System.out.println(b);
		/*int a1=5;
		double b1=6.5;
		double c=a1+b1;
		System.out.println(c);
		byte b=50;
		b=50*2;
		System.out.println(b);*/ 
		//char c='A';
		//int a=c;
		//System.out.println(a);
		/*dwint A=66;
		char c=(char)A;
		System.out.println(c);*/
		//p1();
		//p2();
		
		//widening();
		//numberbaseconverter();
		//autoboxing();
		//pointing();
		//classcastException();
		//array();
		//binarystring()
;		//character();
		valueof();
	}
	static void space() {
		String s=sc.nextLine();
	    int count=0;
	    boolean flag=false;
		
		for(int i=0;i<s.length()-1;i++) {
			char ch=s.charAt(i);
		
			if(ch!=' ' && !flag) {
				count++;
				flag=true;
			}
			else if(ch==' ') {
				flag=false;
				
			}
		}
		System.out.println(count);
		
	}
    static void p1() {
    	double s=sc.nextDouble(); 
    	long h=(long)s;
    	double p=(double)h;
    	System.out.println(s);
    	System.out.println(h);
    	System.out.println(p);
    	}
    static void p2() {
    	char A=sc.next().trim().charAt(0);
    	char B=sc.next().trim().charAt(0);
    	int num1=A-'0';
    	int num2=B-'0';
    	int sum=num1+num2;
    	System.out.println(sum);
    	
    	
    }
    static void widening() {
    	int i=100;
    	long l=i;
    	byte b=(byte)i;
    	float f=l;
    	short s=(short)f;
    	System.out.println(l);
    	System.out.println(b);
    	System.out.println(f);
    	System.out.println(s);
    }
   static void numberbaseconverter() {
	   String str=sc.next();
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   int n=Integer.parseInt(str,a);
	   String s1=Integer.toString(n,b);
	   System.out.println(s1);
	   
   }
   static void autoboxing() {
	     Integer a=100;
	     Integer b=100;
	     Integer c=1000;
	     Integer d=1000;
	     System.out.println(a==b);
	     System.out.println(c==d);
   }
   static void pointing() {
	   Object o="hello world";
	   if(o instanceof String){
		   String s=(String)o;
		   System.out.println(s.length());
		   
		   }else {
			   System.out.println("not a string");
		   }
	   }
   static void  classcastException() {
	   
	   try {
		   Object o=Integer.valueOf(100);
		   String s=(String)o;
	   }
		   catch(ClassCastException e) {
			   System.out.println("invalid");
			   
		   }
	   
   }
static void array() {
	char[] arr={'j','a','v','a'};
	String s=new String(arr);
	System.out.println(s);
}
static void binarystring() {
	String s=sc.next();
	/*byte b=Byte.parseByte(s,2);
	System.out.println(b);*/
	byte b1= (byte)Integer.parseInt(s,2);
	System.out.println(b1);
}
static void character() {
	String o=sc.nextLine();
	char[] c=o.toCharArray();
	for(char ch:c) {
		System.out.println(ch);
	}
	
}
static void valueof() {
	 Integer a=Integer.valueOf(100);
	 Integer b=Integer.valueOf(100);
	 Integer c=new Integer(200);
	 Integer d=new Integer(200);
	 System.out.println(a==b);
	 System.out.println(c==d);
	}
}
