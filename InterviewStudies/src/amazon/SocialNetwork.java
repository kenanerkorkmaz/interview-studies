package amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SocialNetwork {

	public static void main(String[] args) {

	}

	public List<String> getDirectFriendsForUser(String user) {
		return null;
	}

	public List<String> getAttendedCoursesForUser(String user) {
		System.out.println("deneme");
		return null;
	}

	public List<String> getRankedCourses(String user) {
		List<String> rankedCourses = new ArrayList<>();
		// first find all network
		List<String> firstLevel = getDirectFriendsForUser(user);
		if (firstLevel != null && !firstLevel.isEmpty()) {
			List<String> allFriends = new ArrayList<>(firstLevel);
			for (String friend : firstLevel) {
				List<String> secondLevel = getDirectFriendsForUser(friend);
				if (secondLevel != null && !secondLevel.isEmpty()) {
					for (String secondFriend : secondLevel) {
						// don't include me
						// don't include duplicate friends
						if (!firstLevel.contains(secondFriend) && !secondFriend.equals(user)) {
							allFriends.add(secondFriend);
						}
					}
				}
			}
			List<String> myCourses = getAttendedCoursesForUser(user);
			HashMap<String, Integer> courseRankMap = new HashMap<>();
			for (String friend : allFriends) {
				List<String> courses = getAttendedCoursesForUser(friend);
				int courseRank = 1;
				for (String course : courses) {
					if (myCourses.contains(course)) {
						continue;
					}
					Integer totalCourseRank = courseRankMap.get(course);
					if (totalCourseRank == null) {
						totalCourseRank = 0;
					}
					totalCourseRank += courseRank;
					courseRankMap.put(course, totalCourseRank);
					courseRank++;
				}
			}
			if (courseRankMap != null && courseRankMap.size() > 0) {
				List<Integer> courseRanks = new ArrayList<>(courseRankMap.values());
				// sort course ranks from min to max meaning most popular first
				Collections.sort(courseRanks);
				List<String> courses = new ArrayList<>(courseRankMap.keySet());
				for (Integer courseRank : courseRanks) {
					for (String course : courses) {
						if (courseRankMap.get(course).equals(courseRank) && !rankedCourses.contains(course)) {
							rankedCourses.add(course);
						}
					}
				}
			}
		}
		return rankedCourses;
	}
}
