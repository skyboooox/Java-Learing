# 第一题
````
public class my_name {

	public static void main(String[] args) {
        for(int i=0;i<100;i++)
        System.out.println("zcj924@gmail.com");
	}

} 
````
<img src="自己名字\1.png" >

# 第二题
````
public class hymn {

	public static void main(String[] args) {
        System.out.println("捧起一把泥土，我说，这是我的祖国； ");
        System.out.println("掬起一朵浪花，我说，这是我的祖国 ");
        System.out.println("翻开发黄的《四库全书》，我说，这是我的祖国； ");
        System.out.println("翻开发黄的《四库全书》，我说，这是我的祖国； ");
}

}
````
<img src="祖国赞美诗(迷)\批注 2020-04-20 111837.png" >

# 第三题
````public class Pattern {
	public static void main(String[] args) {
        for(float y = (float) 1.5;y>-1.5;y -=0.1)
        {
               for(float x= (float) -1.5;x<1.5;x+= 0.05)
               {
                     float a = x*x+y*y-1;
                     if((a*a*a-x*x*y*y*y)<=0.0)
                     {
                            
                            
                            System.out.print("*");
                     
                     }
                     else
                            System.out.print(" ");
               }
               System.out.print("\n");
        }
       }}
````
<img src="桃子图案\批注 2020-04-20 111511.png" >

# 第四题

````
public class AREA {	
	static double Area(double r) {
		double area;
		area =3.14 *r*r;
		return area;
	}
	static double Girth(double r) {
		return 2*3.14*r;
	}
	public static void main(String[] args) {
		double radius, area;
		radius	=3.14;
		area=Area(radius);
		System.out.printf("\n半径为3.1的圆的面积%.2f",area);
		area=Area(10);
		System.out.printf("\n半径为10的圆的面积%.2f",area);
		System.out.printf("\n半径为3.1的圆的面积%.2f",Girth(3.1));
		System.out.printf("\n半径为10的圆的面积%.2f",Girth(10));
	}

}
````
````
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
````
````
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
````


# 第五题
````
public class leap_year_1 {

	public static void main(String[] args) {
		 System.out.println("游戏：你问我答");
		Scanner scan =new Scanner(System.in);
		System.out.println("请输入您的姓名：");
		String name =scan.next();
		System.out.println(name+"一起玩吧！");
		System.out.println("请输入年份：");
		int year1 = scan.nextInt();
		System.out.println("今年是闰年吗？（Y or NO）");
		String answer =scan.next();
		System.out.println("今年是："+year1+"\n闰年："+answer);
		System.out.println("电脑判断！（Y or NO）");
		String answer1 =scan.next();
		System.out.println("请输入你出生的年份：");
		int year2 = scan.nextInt();
		if((year2%4==0 && year2%100!=0)||(year2%400==0)) 
		{
			System.out.println(year2+"年是一个闰年！");
			}		
		else
		{
			System.out.println(year2+"年不是闰年！");
		}
    }
}
````
<img src="闰年判断\批注 2020-04-20 111410.png" >

# 第六题
1. 学习中，要养成良好的习惯（写括号时要成对，字母大小写要区分，单词拼写要准确）。

2. 在学习的过程中，最好不是仅仅停留在java表层，不是抄书上的例子运行出结果就可以。要注意，即便对一个简单的例子也要有耐心去琢磨、调试、改动。

3. 在学习的过程中一定要动手做、试着写代码，而不是抱一本书看看就行。很多东西和体会必须自己动手才能真正属于自己。

4. 在 Java 的学习过程中，可能会遇到形形色色的问题不容易解决，应多去专业论坛了解相关的知识，书本上的知识有限。要会从网上搜索有用的信息 加以整理，促进学习的深入和知识水平的提高
