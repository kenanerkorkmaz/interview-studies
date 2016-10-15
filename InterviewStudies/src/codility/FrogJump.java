package codility;

public class FrogJump {
	public int solution(int X, int Y, int D) {
		return (int)Math.ceil((Y-X)/(D*1.0d));
	}
	public static void main(String[] args) {
		FrogJump a = new FrogJump();
		System.out.println(a.solution(3,14, 1));
	}
}
