import java.util.Scanner;
public class workers {
    int age;
    String name;
    String company;
    public workers(int age, String name, String company) {
        return;
    }
    public static void main(String[] args) {
        label0:for(int l = 0; l < 1; l--) {
            System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println(" INPUT WORKERNUMBER ");
        int num = sc.nextInt();
        for (int i = 0; i <= 20; i++) {
            if (i > num - 1){
                break label0;
            }
            System.out.println(" INPUT WORKERS INFORMATION " + " : woker" + (i + 1) );
            System.out.println(" AGE: ");
            int age = sc.nextInt();
            System.out.println(" NAME: ");
            String name = sc.next();
            System.out.println(" FACTOR: ");
            String company = sc.next();
            int[] ages = new int[num];
            String[] names = new String[num];
            String[] companys = new String[num];
            ages[i] = age;
            names[i] = name;
            companys[i] = company;
        }
        }
        System.out.println("DONE,INFORMATION INPUTING FINISHED SUCCESSFULLY");
        System.out.println();
        System.out.println();
        System.out.println();
    }
}