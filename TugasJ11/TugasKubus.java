import java.util.Scanner;

public class TugasKubus {
    
     // Fungsi untuk menghitung volume kubus
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi; //Volume = sisi
    }
    // Fungsi untuk menghitung luas permukaan kubus
    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi; //Luas Permukaan = 6 * sisi
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sisi = 6; // Misalnya sisi kubus adalah 6cm

        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("Volume Kubus dengan sisi : " + sisi + " cm " + volume + " cm³ ");
        System.out.println("Luas Permukaan Kubus dengan sisi : " + sisi + " cm " + luasPermukaan + " cm² ");
    }
}
