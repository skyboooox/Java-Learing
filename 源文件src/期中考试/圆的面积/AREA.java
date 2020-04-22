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
