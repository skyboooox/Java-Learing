public class 打印字母表 {
    public static void main(String[] args) {
        char c = 'A';
        for (int i = 0; i < 26; i++) {
            System.out.print(c+" ");//字符串连接用 +
            c++;//会自动转换数据类型
            
        }
    }
}
