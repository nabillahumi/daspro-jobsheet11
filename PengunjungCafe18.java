public class PengunjungCafe18 {
    
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("-" + namaPengunjung[i]);
        }
    }
}
