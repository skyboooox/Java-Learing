package 简易计算器;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan =new Scanner(System.in);
		double x,y;
		System.out.println("请输入第一个操作数：X=");
		x= scan.nextDouble();
		System.out.println("请输入第一个操作数：Y=");
		y= scan.nextDouble();
		System.out.println("运行结果如下：");
		System.out.println("x+y="+(x+y));
		scan.close();
	}

}
