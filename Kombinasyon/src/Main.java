import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n,r,faktoriyel_n=1,faktoriyel_r=1;
        int faktoriyel = 1;
        double kombinasyon;

        System.out.print("Sayi giriniz : ");
        n = scan.nextInt();

        for(int i = n; i > 0; i--) {
            faktoriyel_n *= i;
        }

        System.out.print("Sayi giriniz : ");
        r = scan.nextInt();
        for(int j = r; j > 0; j--) {
            faktoriyel_r *= j;
        }

        for(int m=n-r; m>0; m--) {
            faktoriyel *= m;
        }

        kombinasyon = faktoriyel_n / (faktoriyel_r * faktoriyel);
        System.out.println("KOMBINASYON : "+kombinasyon);

    }
}