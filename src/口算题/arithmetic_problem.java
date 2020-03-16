package 口算题;
import java.util.Scanner;
public class arithmetic_problem {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
		System.out.printf("请回答:%d+%d=%d\n",num1,num2,num2+num3);
		System.out.println(" 请回答num1+num2+num3=?");
		System.out.printf("请回答:%d+%d+%d=%d\n",num1,num2,num3,num1+num2+num3);		
		System.out.println(" 请回答num1+num2-num3=?");
		System.out.printf("请回答:%d+%d-%d=%d\n",num1,num2,num3,num1+num2-num3);
	}

}
