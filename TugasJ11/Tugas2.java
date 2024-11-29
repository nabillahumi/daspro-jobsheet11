import  java.util.Scanner;

public class Tugas2 {

    static  Scanner sc = new Scanner(System.in);

    public static void inputDataPenjualan(int[][] penjualan, String[] menu) {
        System.out.println("Masukkan data penjualan : ");

        for (int i = 0; i < menu.length; i++) { //loop utk menu
            System.out.println((i+1) + "." + menu[i] + " : "); //panggil nama menu

            for (int j = 0; j < 7; j++) { //loop utk hari
                System.out.print("Hari ke-" + (j+1) + " : ");
                penjualan[i][j] = sc.nextInt();
            }

            System.out.println();
        }
    }

    // Fungsi untuk menampilkan seluruh data penjualan
    public static void tampilkanMenu(int[][] penjualan, String[] menu) {
        System.out.println("\nSeluruh Data Penjualan:");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan menu dengan penjualan tertinggi
    public static void menuPenjualanTertinggi(int[][] penjualan, String[] menu) {
        int maxPenjualan = 0;
        String menuTertinggi = "";
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTertinggi = menu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi: " + menuTertinggi );
        System.out.println("dengan total penjualan : " + maxPenjualan);
    }

    // Fungsi untuk menampilkan rata-rata penjualan
    public static void rataRataPenjualan(int[][] penjualan, String[] menu) {
        System.out.println("\nRata-rata Penjualan:");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / penjualan[i].length;
            System.out.println(menu[i] + ": " + rataRata);
        }
    }
    public static void main(String[] args) {
        

        // Data penjualan Ibu Mariana
        System.out.println("\n=== Data Penjualan Ibu Mariana ===");
        int[][] penjualan = new int[5][7];
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

        inputDataPenjualan(penjualan, menu);

        // Fungsi untuk menampilkan menu
        tampilkanMenu(penjualan, menu);

        // Menampilkan menu dengan penjualan tertinggi
        menuPenjualanTertinggi(penjualan, menu);

        // Menampilkan rata-rata penjualan
        rataRataPenjualan(penjualan, menu);
    }
}
