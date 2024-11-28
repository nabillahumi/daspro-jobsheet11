import java.util.Scanner;

public class hitungTotalHarga18 {
    
    static  Scanner sc = new Scanner(System.in);

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        //Menerapkan diskon berdasarkan kode promo
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal *= 0.5;
            System.out.println("Selamat! Anda mendapatkan diskon 50%" );
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            hargaTotal *= 0.7;
            System.out.println("Selamat! Anda mendapatkan diskon 30% ");
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo tidak valid. Tidak ada diskon yang diterapkan.");
        }
        return hargaTotal;
    }

    public static void main(String[] args) {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan");

        //Input pilihan menu dan jenis item
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan : ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan : ");
        int banyakItem = sc.nextInt();
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();
            
        //Menghitung total harga
        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            
        //Menampilkan total harga
        System.out.println("Total harga untuk pesanan Anda : Rp" + totalHarga);
    }
}
