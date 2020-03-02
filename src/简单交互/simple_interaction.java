package 简单交互;
import java.util.Scanner;
public class simple_interaction {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        Scanner scan = new Scanner(System.in);
        System. out.println("请输入您的姓名: ");
        String str = scan.next();
        System. out.println(str+ ",您好，欢迎学习Java! ");
        scan.close();}
	}
