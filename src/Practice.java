import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
			Student 지민 =new Student();
			Scanner sc = new Scanner(System.in);
			
			System.out.print("학번:");
			지민.학번=nextLine();
			
			System.out.print("이름:");
			지민.이름=sc.nextLine();
			
			System.out.print("국어:");
			지민.국어= sc.nextlnt();
		
			System.out.print("영어:");
			지민.영어= sc.nextlnt();
			
			System.out.print("수학:");
			지민.수학= sc.nextlnt();
			int total=지민.국어+지민.영어+지민.수학;
			double avg= total/3.;
			System.out.printf("학번:%s, 지민.학번");
			System.out.printf("이름:%s",지민.이름)
			System.out.printf("국어:%d", 지민.국어)
			System.out.printf("영어:%d")
			System.out.printf("수학:%d")
			System.out.printf("총점:%d")
			System.out.printf("평균:%.2f")
	}
}
