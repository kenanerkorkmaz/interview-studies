//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

/*
 * Complete the function below.
 */
package amazon;

import java.util.ArrayList;

public class Locker {

	static int[][] getLockerDistanceGrid1(int cityLength, int cityWidth,
			int[] lockerXCoordinates, int[] lockerYCoordinates) {
		int[][] lockerDistances = new int[1][cityWidth];
		// we assume that length of lockerXCoordinates and lockerYCoordinates
		// are same
		int numberOfCoordinates = lockerXCoordinates.length;
		ArrayList<Integer[]> lockerCoordinates = new ArrayList<Integer[]>();
		for (int i = 0; i < numberOfCoordinates; i++) {
			// we'll add coordinates as list of int array having x,y as int
			// array elements
			Integer[] coordinate = new Integer[2];
			// x
			coordinate[0] = lockerXCoordinates[i];
			// y
			coordinate[1] = lockerYCoordinates[i];
			lockerCoordinates.add(coordinate);
		}
		// first traverse x'es
		for (int x = 1; x <= cityWidth; x++) {
			// then traverse y's
			for (int y = 1; y <= cityLength; y++) {

				for (Integer[] locker : lockerCoordinates) {
					int distance = Math.abs(x - locker[0])
							+ Math.abs(y - locker[1]);
				}
			}
		}

		return lockerDistances;
	}

	static int[][] getLockerDistanceGrid(int cityLength, int cityWidth,
			int[] lockerXCoordinates, int[] lockerYCoordinates) {
		int[][] result = new int[cityLength][cityWidth];
		for (int i = 1; i <= cityLength; i++) {
			for (int j = 1; j <= cityWidth; j++) {
				// distance may be 16 max, since if locker is at (1,1) and cell
				// is (9,9) then distance is |9-1|+|9-1|=16
				int distance = 16;
				if (lockerXCoordinates.length == 0) {
					distance = 0;
				}
				for (int k = 0; k < lockerXCoordinates.length; k++) {
					if ((lockerXCoordinates[k] - i)
							+ (lockerYCoordinates[k] - j) < distance) {
						distance = Math.abs(lockerXCoordinates[k] - i)
								+ Math.abs(lockerYCoordinates[k] - j);
					}
				}
				result[i - 1][j - 1] = distance;
			}
		}

		return result;
	}

}
