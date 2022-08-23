import java.util.Arrays;
import java.util.Scanner;
public class bijiaodaxiao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers are there");
        int i = sc.nextInt();
        int[] numbers = new int[i];
        for (int h = 0; h < i; h++) {
            System.out.println(" INPUT NUMBER ");
            int num = sc.nextInt();
            numbers[h] = num;
        }
        System.out.println(" NUMBER INPUTING FINISHED SUCCESSFULLY ");
        for (int g = 1; g < numbers.length; g++) {
            for (int j = 0; j <= numbers.length - 1 - g; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int chag;
                    chag = numbers[ j ];
                    numbers[ j ] = numbers[ j + 1 ];
                    numbers[ j + 1 ] = chag;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
