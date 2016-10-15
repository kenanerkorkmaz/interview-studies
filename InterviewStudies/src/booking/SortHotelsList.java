package booking;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SortHotelsList {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String keyStr = in.nextLine();
		final String SPLIT_PATTERN = "[.,]\\s+|[.,]|\\s+";
		String[] keyList = keyStr.split(SPLIT_PATTERN);
		for (int i = 0; i < keyList.length;i++) {
			keyList[i] = keyList[i].toLowerCase();
		}
		Arrays.sort(keyList);

		int count = in.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		int commentCount = 0;
		for (int i = 0; i < count; i++) {
			int id = in.nextInt();
			if (map.get(id) != null) {
				commentCount = map.get(id);
			} else {
				commentCount = 0;
			}
			in.nextLine();
			String commentStr = in.nextLine();
			String[] commentList = commentStr.split(SPLIT_PATTERN);
			for (int j = 0; j < commentList.length;j++) {
				commentList[j] = commentList[j].toLowerCase();
			}
			Arrays.sort(commentList);
			int k = 0;
			for (int j = 0; j < keyList.length; j++) {
				while(k < commentList.length) {
					if (commentList[k].compareTo(keyList[j]) == 0) {
						commentCount++;
					} else if (commentList[k]
							.compareTo(keyList[j]) > 0) {
						// proceed to next key
						break;
					}
					// else continue with the next comment word
					k++;
				}
			}
			map.put(id, commentCount);
		}

		// sort map by value
		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(
				map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1,
					Map.Entry<Integer, Integer> o2) {
				if (o1.getValue().compareTo(o2.getValue()) > 0) {
					return -1;
				} else if (o1.getValue().compareTo(o2.getValue()) < 0) {
					return 1;
				} else {
					return o1.getKey().compareTo(o2.getKey());
				}
			}
		});
		int[] idList = new int[list.size()];
		int idListCount = 0;
		for (Map.Entry<Integer, Integer> entry : list) {
			idList[idListCount++] = entry.getKey();
		}
		if (idListCount > 0) {
			System.out.print(idList[0]);
		}
		for (int i = 1; i < idListCount; i++) {
			System.out.print(" " + idList[i]);
		}

		in.close();

	}
	public static void main2(String[] args) {
		String s = "This hotel has a nice view of the citycenter. The location is perfect.";
		String pattern = "[.,]\\s+|[.,]|\\s+";
		String[] arr = s.split(pattern);
		for (int i = 0; i < arr.length;i++) {
			arr[i] = arr[i].toLowerCase();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
