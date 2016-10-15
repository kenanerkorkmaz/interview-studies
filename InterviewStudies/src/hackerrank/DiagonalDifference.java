package hackerrank;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int a[][] = new int[n][n];
	        for(int a_i=0; a_i < n; a_i++){
	            for(int a_j=0; a_j < n; a_j++){
	                a[a_i][a_j] = in.nextInt();
	            }
	        }
	        in.close();
	        int sum = 0;
	        for (int i = 0; i < n; i++) {
	        	sum += a[i][i] - a[i][n-i-1];
	        }
	        System.out.println(Math.abs(sum));
	}

}
