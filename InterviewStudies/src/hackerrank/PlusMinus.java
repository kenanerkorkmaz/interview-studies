package hackerrank;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class PlusMinus {
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int arr[] = new int[n];
     for(int arr_i=0; arr_i < n; arr_i++){
         arr[arr_i] = in.nextInt();
     }
     in.close();
     double plus = 0, minus=0,zero=0;
     for (int i = 0; i < n; i++) {
    	 if (arr[i ] > 0) {
    		 plus++;
    	 } else if (arr[i] < 0) {
    		 minus++;
    	 } else {
    		 zero++;
    	 }
     }
     NumberFormat formatter = new DecimalFormat("#0.000000");
     System.out.println(formatter.format(plus/n));
     System.out.println(formatter.format(minus/n));
     System.out.println(formatter.format(zero/n));
}
}
