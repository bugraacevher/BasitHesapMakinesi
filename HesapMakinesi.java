package Giris;
import java.net.SocketOption;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {

        int n1,n2,select;
        Scanner input = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz : ");
        n1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        n2 = input.nextInt();

        System.out.print("1-toplama\n2-cikarma\n3-carpma\n4-bolme\n");
        System.out.print("Seciminiz : ");
        select = input.nextInt();

        if (select == 1) {
            System.out.println("Toplam : "+(n1+n2));
        } else if (select == 2 ) {
            System.out.println("Cikarma : "+(n1-n2));
        } else if (select == 3) {
            System.out.println("Carpma : "+(n1*n2));
        } else if (select == 4) {
            System.out.println("Bolme : "+(n1/n2));
        }else {
            System.out.println("Lutfen 1 ile 4 arasinda bir deger giriniz!!");
        }
    }


}
