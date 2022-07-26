import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자:");
		String munja = sc.nextLine(); // "A"
		char ch = munja.charAt(0); // 'A'
		System.out.printf("문자 %c의 코드값은 %d입니다", ch, (int) (ch));

	}
}
