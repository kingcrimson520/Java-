public class shuixianhua {
    public static void main(String[] args) {
        int l = 100;
        while (l < 1000) {
            int a = l / 100;
            int b = l / 10 - a * 10;
            int c = l - 100 * a - 10 * b;
            if (l == (a * a * a + b * b * b + c * c * c)) {
                System.out.println(l);
            }
            l++;
        }
    }
}
