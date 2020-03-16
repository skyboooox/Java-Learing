//package 口算题;
import java.util.Scanner;
public class arithmetic_problem {

	public static void main(String[] args) {
		System.out.println("游戏:口算题");
		Scanner scan =new Scanner(System.in);
		System.out.println("请输入名字");
		String name = scan.next();
		System.out.println(name+",您好,一起玩吧");
		
		System.out.println("请输入第一个数：");
		int num1 =scan.nextInt();
		System.out.println("请输入第二个数：");
		int num2 =scan.nextInt();
		System.out.println("请输入第三个数：");
		int num3 =scan.nextInt();
		System.out.println(" 请回答num1+num2=?");
		int ans1 =scan.nextInt();
			for(;ans1!=num1+num2;) {
				System.out.println("回答错误\n请重新回答num1+num2=?");
				ans1 =scan.nextInt();
			}
			System.out.printf("回答正确\n");

	}

}
