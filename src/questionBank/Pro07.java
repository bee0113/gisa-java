package questionBank;

public class Pro07 {
	public static void main(String[] args) {
		System.out.print(Pro07.check(1));
	}

	static String check(int num) {
		return (num >= 0) ? "positive" : "negative";
	}
}