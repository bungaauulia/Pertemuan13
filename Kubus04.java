import java.util.Scanner;
public class Kubus04 {
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }
    public static int hitungLuasPermukaan (int sisi) {
        return 6 * sisi * sisi;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang sisi kubus: ");
        int sisiKubus = sc.nextInt();

        int volume = hitungVolume (sisiKubus);
        int luasPermukaan = hitungLuasPermukaan (sisiKubus);

        System.out.println("Panjang sisi kubus: " + sisiKubus);
        System.out.println("Volume kubus: " + volume);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
    }
}