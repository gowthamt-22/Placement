package DAY02;
import java. util.Scanner;
public class COUNTNUMBER {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		//Bitwise();
		//ternaryoperator();
		//month();
		//leapyear();
		booleanexp();
		
		
		
		
	}
	private static void getday() {
		int day=sc.nextInt();
		switch(day) 
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("Wednesay");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
	
		case 7:
			System.out.println("Saturday");
			break;
			default:
				System.out.println("Invalid");
		}
	}
    static void Bitwise(){
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	sc.nextLine();
    	String res=sc.nextLine().trim().toUpperCase();
  
    	switch(res) {
    	case "AND":
    		System.out.println( a&b);
    		break;
    	case "OR":
    		System.out.println(a|b);
    		break;
    	case "XOR":
    		System.out.println(a^b);
    		break;
    	case "NAND":
    		System.out.println(~(a&b));
    		break;
    	default:
    		System.out.println("invalid");
    	}
    	
    	
    	
    	
   }
    static void ternaryoperator(){
    	int o=sc.nextInt();
    	String grade=(o>=90)?"A":(o>=80)?"B":(o>=70)?"C":(o>=60)?"D":"F";
    	System.out.println(grade);
    	
    }
    static void month() {

    	
    	int m=sc.nextInt();
    	switch(m) {
    	case 1:
    		System.out.print("January ");
    	case 2:
    		System.out.print("februauary ");
    	case 3:
    		System.out.print("march ");
    	case 4:
    		System.out.print("april ");
    	case 5:
    		System.out.print("may ");
    	case 6:
    		System.out.print("June ");
    	case 7:
    		System.out.print("July ");
    	case 8:
    		System.out.print("august ");
    	case 9:
    		System.out.print("september ");
    	case 10:
    		System.out.print("october ");
    	case 11:
    		System.out.print("november ");
    	case 12:
    		System.out.print("december ");
    		break;
    	default: 
    		System.out.println("invalid");
    		
    		
    	}
    }
    static void leapyear() {
    	int year=sc.nextInt();
    	int day=sc.nextInt();
    	String isleap=(year%4==0 && year%100!=0 || year%400==0)?"leap":"common";
    	System.out.println(isleap);
    		
    	if(isleap.equals("common") && day>365) {
    		System.out.println("invalid");
    		
    	}
    	int d=(day-1)%7;
    	//String str="";
    	switch(d) {
    	case 1: System.out.println("monday"); break;
    	case 2:System.out.println("tuesday"); break;
    	case 3:System.out.println("wednesay" );break;
    	case 4:System.out.println("thursday"); break;
    	case 5:System.out.println("friday"); break;
    	case 6:System.out.println("saturday"); break;
    	default: 
    		System.out.println("invalid");
    		
    	}
    	//System.out.println(str);
    }
    static void booleanexp() {
    	boolean a=true,b=false;
    	if(b && methodA()) {
    		System.out.println("hello");
    	}
    	if(a|| methodB()) {
    		System.out.println("good");
    	}
    	
    }
	

    private static boolean methodB() {
		// TODO Auto-generated method stub
		return false;
	}
	private static boolean methodA() {
		// TODO Auto-generated method stub
		return false;
	}



}









	