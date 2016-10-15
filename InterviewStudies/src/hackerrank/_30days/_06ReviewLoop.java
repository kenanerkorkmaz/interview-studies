package hackerrank._30days;

import java.util.Locale;
import java.util.Scanner;

public class _06ReviewLoop {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        scan.nextLine();
	        for (int i = 0; i< n;i++) {
	            String s = scan.nextLine();
	            String even = new String("");
	            String odd = new String("");
	            for(int j = 0; j < s.length();j++) {
	                if (j%2==0) {
	                even = even.concat(String.valueOf(s.charAt(j)));
	                } else {
	                    odd = odd.concat(String.valueOf(s.charAt(j)));
	                }
	            }
	            System.out.println(even + " " + odd);
	        }
	        scan.close();
	}

}
