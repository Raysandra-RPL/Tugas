import java.util.Scanner;

public class persegi {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
    proses masuk = new proses();

    System.out.println("masukan sisi persegi anda: "); masuk.setSisi(input.nextInt());
    System.out.println("hasil dari volume yang di dapatkan adalah:" + masuk.getVolume());

    input.close();
 }    
}
