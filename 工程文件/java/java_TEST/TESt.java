package java_TEST;

public class TESt {
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
		System.out.printf("\n�뾶Ϊ3.1��Բ�����%.2f",area);
		area=Area(10);
		System.out.printf("\n�뾶Ϊ10��Բ�����%.2f",area);
		System.out.printf("\n�뾶Ϊ3.1��Բ�����%.2f",Girth(3.1));
		System.out.printf("\n�뾶Ϊ10��Բ�����%.2f",Girth(10));
	}

}
