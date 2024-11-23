import java.util.Scanner;
public class Percobaan604 {
    static int hitungLuas (int pjg, int lb) {
        int Luas =  pjg*lb;
        return Luas;
    }
    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t;
        System.out.print("Masukkan panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();

        System.out.println("Luas persegi panjang adalah " + hitungLuas(p, l));
        System.out.println("Volume balok adalah " + hitungVolume(p, l, t));
    }
}
