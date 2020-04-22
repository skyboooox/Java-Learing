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
