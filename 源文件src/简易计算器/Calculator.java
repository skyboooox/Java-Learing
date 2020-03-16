import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		//初始化
		Scanner scan =new Scanner(System.in);
		double x,y;//定义变量
		//扫描输入
		System.out.println("请输入第一个操作数：X=");
		x= scan.nextDouble();
		System.out.println("请输入第一个操作数：Y=");
		y= scan.nextDouble();
		//运算输出
		System.out.println("运行结果如下：");
		System.out.println("x+y="+(x+y));
		System.out.println("x-y="+(x-y));
		System.out.println("x*y="+(x*y));
		System.out.println("x/y="+(x/y));
		scan.close();
	}

}
