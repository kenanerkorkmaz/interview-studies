package toptal;

import java.util.ArrayList;
import java.util.HashMap;

public class Three {

	class Position {
		int x;
		int y;

		Position(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public boolean equals(Position p) {
			return this.x == p.x && this.y == p.y;
		}
	}

	private ArrayList<Position> getNextPosition(int x, int y) {
		ArrayList<Position> positions = new ArrayList<>();
		positions.add(new Position(x + 1, y + 2));
		positions.add(new Position(x + 1, y - 2));
		positions.add(new Position(x - 1, y + 2));
		positions.add(new Position(x - 1, y - 2));
		positions.add(new Position(x + 2, y + 1));
		positions.add(new Position(x + 2, y - 1));
		positions.add(new Position(x - 2, y + 1));
		positions.add(new Position(x - 2, y - 1));
		return positions;
	}

	private int countMovesTo(Position position, int depth,
			HashMap<Position, Integer> cache) {
		int result = 0;
		if (cache.get(position) != null) {
			return cache.get(position);
		}
		if (position.x == 0 || position.y == 0) {
			return 0;
		} else if (depth > 1000) {
			return -2;
		} else {
			int minMoves = Integer.MAX_VALUE;
			ArrayList<Position> nextPositions = getNextPosition(position.x,
					position.y);
			for (Position p : nextPositions) {
				result = countMovesTo(p, depth + 1, cache);
				if (result < 0) {
					continue;
				}
				minMoves = Math.min(minMoves, result + 1);
				if (minMoves == Integer.MAX_VALUE) {
					result = -2;
				} else {
					result = minMoves;
				}
			}
		}
		cache.put(position, result);
		return result;
	}

	public int solution(int A, int B) {

		return countMovesTo(new Position(A, B), 10000,
				new HashMap<Position, Integer>());
	}

	public static void main(String[] args) {
		Three uc = new Three();

		System.out.println(uc.solution(1, 2));
	}

}
