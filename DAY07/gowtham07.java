package DAY07;
import java.util.*;

public class gowtham07 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		//q1();
		//q2();
		//q3();
		//q4();
		//q5();
		q6();
		}
    static void q1() {
    	int n=sc.nextInt();
    	StringBuilder s=new StringBuilder();
    	for(int i=0;i<=n;i++) {
    		s.append(i);
    		
    	}System.out.println(s.toString());
    }
    static void q2() {
    	String str=sc.nextLine();
    	StringBuilder s=new StringBuilder(str);
    	s.reverse();
    	System.out.println(s);
    	
    }
    static void q3() {
    	String s=sc.nextLine();
    	String s1="";
    	
    	//StringBuilder sb=new StringBuilder(s);
    	for(int i=0;i<s.length();i++) {
    		if(s.charAt(i)=='a'
    				|| s.charAt(i)=='e'
    				||s.charAt(i)=='i'
    				||s.charAt(i)=='o'
    				||s.charAt(i)=='u'
    				||s.charAt(i)=='A'
    				|| s.charAt(i)=='E'
    				||s.charAt(i)=='I'
    				||s.charAt(i)=='O'
    				||s.charAt(i)=='U') {
    		
    			continue;
    		}
    		else {
    				s1=s1+s.charAt(i);
    				
    			
    		}
    	}System.out.println(s1);
    }
static void q4() {
	String str=sc.nextLine();
	/*char[] arr=str.toCharArray();
	char[] res=new char[str.length()];
	int index=0;
	for(int i=0;i<arr.length;i++) {
		char ch=arr[i];
		if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u') {
			res[index]=ch;
			index++;
			
		}
	}System.out.println(res);*/
	str=str.replaceAll("[aeiouAEIOU]", "");
	System.out.println(str);
}
static void q5() {
	String base=sc.nextLine();
	String target=sc.nextLine();
	String replace= sc.nextLine();
	StringBuilder sb=new StringBuilder(base);
	int index=sb.indexOf(target);
	while(index!=-1) {
		sb.replace(index, index+target.length(),replace);	
		index=sb.indexOf(target,index+replace.length());
		
	}
	System.out.println(sb);
}
static void q6() {
	String s = sc.nextLine();
    
    StringBuilder sb = new StringBuilder(s);
    sb.reverse();
    
    if (s.equals(sb.toString())) {
        System.out.println("Palindrome");
    } else {
        System.out.println("Not a Palindrome");
    }
}

}

