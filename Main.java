import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenin tanımlanması.

        int n,i=1,j=1;

        //"n" Değerinin girilmesi.

        Scanner input = new Scanner(System.in);
        System.out.print("Sınır değerini giriniz: ");
        n=input.nextInt();

        //İkinin kuvvetlerinin bulunması ve ekrana yazdırılması.

        while (i <= n && j <= n) {
            System.out.println(i + "\t" + j);
            i *= 4;
            j *= 5;
        }
    }
}