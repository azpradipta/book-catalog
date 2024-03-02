import java.util.Scanner;

public class Katalog {

    private DaftarBuku daftarBuku;
    private Penulis penulis;

    public Katalog(DaftarBuku daftarBuku, Penulis penulis) {
        this.daftarBuku = daftarBuku;
        this.penulis = penulis;
    }

    public void tampilkanDaftarBuku() {
        daftarBuku.tampilkanDaftarBuku();
    }

    public void tampilkanPenulis() {
        penulis.tampilkanPenulis();
    }

    public void tampilkanNomorIdentifikasi() {
        penulis.tampilkanNomorIdentifikasi();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan penulis buku: ");
        String penulisBuku = scanner.nextLine();
        System.out.print("Masukkan ISBN buku: ");
        String isbnBuku = scanner.nextLine();
        System.out.print("Masukkan DDS buku: ");
        String ddsBuku = scanner.nextLine();
        System.out.print("Masukkan subjek buku: ");
        String subjekBuku = scanner.nextLine();

        Buku buku1 = new Buku(judul, penulisBuku, isbnBuku, ddsBuku, subjekBuku);

        DaftarBuku daftarBuku = new DaftarBuku();
        daftarBuku.addBuku(buku1);
        System.out.println("Daftar Buku setelah input pengguna:");
        daftarBuku.tampilkanDaftarBuku();

        System.out.print("Masukkan nama penulis: ");
        String namaPenulis = scanner.nextLine();

        Penulis penulis = new Penulis(namaPenulis);
        System.out.print("Masukkan ISBN buku karangan penulis: ");
        String isbnPenulis = scanner.nextLine();
        penulis.addBukuKarangan(isbnPenulis);

        System.out.println("Informasi Penulis setelah input pengguna:");
        penulis.tampilkanPenulis();
        penulis.tampilkanNomorIdentifikasi();

        scanner.close();
    }
}
