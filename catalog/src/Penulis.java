import java.util.ArrayList;
import java.util.List;

public class Penulis {

    private String nama;
    private List<String> bukuKarangan;

    public Penulis(String nama) {
        this.nama = nama;
        this.bukuKarangan = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public List<String> getBukuKarangan() {
        return bukuKarangan;
    }

    public void addBukuKarangan(String buku) {
        bukuKarangan.add(buku);
    }

    public void tampilkanPenulis() {
        System.out.println("Nama: " + nama);
    }

    public void tampilkanNomorIdentifikasi() {
        if (!bukuKarangan.isEmpty()) {
            String firstBookISBN = bukuKarangan.get(0);
            System.out.println("Nomor Identifikasi (ISBN): " + firstBookISBN);
        } else {
            System.out.println("Penulis belum memiliki buku karangan.");
        }
    }
}
