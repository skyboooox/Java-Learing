import java.util.*;
public class rand  {

	public static void main(String[] args) {
		System.out.println("游戏:口算题");
		Scanner scan =new Scanner(System.in);
		System.out.println("请输入名字");
		String name = scan.next();
		System.out.println(name+",您好,一起玩吧");
		
		Random random = new Random();//创建随机数类
		int num1 = random.nextInt(100);//生成随机数	
		int num2 = random.nextInt(100);
		
		System.out.printf(" 请回答%d+%d=?\n",num1,num2);
		int ans1 =scan.nextInt();
			for(;ans1!=num1+num2;) {
				System.out.printf("回答错误\n请重新回答%d+%d=?\n",num1,num2);
				ans1 =scan.nextInt();
			}
			System.out.printf("回答正确\n");

	}

}
