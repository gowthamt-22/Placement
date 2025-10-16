package Day11;
import java.util.*;
public class flames {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine().toLowerCase();
		char[] c1=s1.toCharArray();
		String s2=sc.nextLine().toLowerCase();
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		int count=0;
        for(int i=0;i<c1.length;i++) {
        	for(int j=0;j<c2.length;j++) {
        		if(c1[i]==c2[j]) {
        			c1[i]=' ';
        			c2[j]=' ';
        			count++;
        			break;
        		}
        	}
        }
        count=count*2;
        System.out.println(c1.length+c2.length-count);
        char[] f = { 'f', 'l', 'a', 'm', 'e', 's' };
        int len = f.length;
        int index = 0;

        // Use array shrinking manually
        while (len > 1) {
            index = (count % len) - 1;
            if (index < 0) {
                index = len - 1; // wrap around if index == -1
            }

            // Shift characters left from index position
            for (int k = index; k < len - 1; k++) {
                f[k] = f[k + 1];
            }
            len--; // reduce the array size
        }

        char result = f[1];
        System.out.println("FLAMES result: " + result);

        switch (result) {
            case 'f' -> System.out.println("friends ");
            case 'l' -> System.out.println("beloved love");
            case 'a' -> System.out.println("all together");
            case 'm' -> System.out.println(" Mangalyam ");
            case 'e' -> System.out.println(" beloved love");
            case 's' -> System.out.println(" Siblings ");
        }


	}

}
