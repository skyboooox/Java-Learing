import java.util.Random;

public class random_test {

	public static void main(String[] args) {
		// 创建随机数
		Random random = new Random();//创建随机数类
		for(int i=0;i<10;i++) {
			int rand = random.nextInt(100);//生成随机数,100内
			System.out.println(rand);
		}
	}

}
