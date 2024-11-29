import java.util.Scanner;

public class hitungTotalHarga18 {
    
    static  Scanner sc = new Scanner(System.in);

    public static void Menu(String namaPelanggan, boolean isMember){ //param utk nama pelanggan dan member

        System.out.println("Selamat datang, " + namaPelanggan + "!");

        //cek member
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuks setiap pembelian!");
        }
        System.out.println("\n===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappucino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    //fungsi hitung harga dan diskon
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {

        int[] hargaMenu = {15000, 20000, 22000, 12000, 10000, 18000}; //harga per item

        int hargaTotal = hargaMenu[pilihanMenu-1] * banyakItem; //hitung harga total

        //hitung diskon
        if (kodePromo.equals("DISKON50")) {
            hargaTotal = hargaTotal / 2;
            System.out.println("Selamat, Anda mendapatkan diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100) ;
            System.out.println("Selamat, Anda mendapatkan diskon 30%!");
        } else {
            System.out.println("Kode promo tidak valid, tidak ada diskon yg diterapkan");
        }

        return hargaTotal;
    }

    //fungsi main
    public static void main(String[] args) {

        Menu("Nabila", true); //mengisi param nama pelanggan dan member

        //deklarasi total keseluruhan
        int totalKeseluruhan = 0;

        //loop untuk memilih menu
        while (true) {
            System.out.print("\nMasukkan nomor menu yg ingin anda pesan (0 utk exit) : ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break; // Keluar dari perulangan jika input 0
            }

            System.out.print("Masukkan jumlah item : ");
            int banyakItem = sc.nextInt();

            System.out.print("\nMasukkan kode promo (0 utk tidak ada kode) : ");
            String kodePromo = sc.next();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHarga;
        }
            System.out.println("\n===== TOTAL PESANAN =====");
            System.out.println("Total harga : Rp " + totalKeseluruhan);
        }
}
