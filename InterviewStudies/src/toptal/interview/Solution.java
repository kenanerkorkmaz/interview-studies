package toptal.interview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {

	private ArrayList<String> readFromFile(String fileName) {
		ArrayList<String> lines = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

			String line = br.readLine();

			while (line != null) {
				lines.add(line);
				line = br.readLine();
			}
		} catch (IOException ioe) {
			System.out.println("io exception");
		}
		return lines;
	}

	public void domino() {
		ArrayList<String> lines = readFromFile("src/toptal/interview/s2.txt");
		for(String line: lines) {
			line = line.trim();
			if (line.length() == 0) {
				System.out.println(0);
				continue;
			}
			if(!line.contains(",")) {
				System.out.println(1);
			} else {
				String[] tiles = line.split(",");
				Character last = null;
				int count = 0;
				int maxCount = 0;
				for (String tile : tiles) {
					if (last != null) {
						if (tile.length() > 0 && last == tile.charAt(0)) {
							count++;
						} else {
							maxCount = Math.max(maxCount, count);
							count = 1;
						}
					} else {
						count ++;
					}
					last = tile.charAt(tile.length()-1);
				}
				maxCount = Math.max(maxCount, count);
				System.out.println(maxCount);
			}
		}
}
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.domino();
}}
