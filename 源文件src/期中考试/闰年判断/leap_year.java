public class leap_year {

	public static void main(String[] args) {
		int year = 2020;

		boolean b1 = year%4==0;

		boolean b2 = year%100!=0;

		boolean b3 = year%400==0;

		if(b1&&b2||b3){

		System.out.println("闰年");

		}else{

		System.out.println("不是闰年");

		}
	}

}
