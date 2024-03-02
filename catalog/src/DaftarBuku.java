import java.util.ArrayList;
import java.util.List;

public class DaftarBuku {

    private List<Buku> daftarBuku;

    public DaftarBuku() {
        this.daftarBuku = new ArrayList<>();
    }

    public List<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    public void addBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanDaftarBuku() {
        System.out.println("Daftar Buku:");
        for (Buku buku : daftarBuku) {
            buku.tampilkanJudul();
            buku.tampilkanPenulis();
            buku.tampilkanISBN();
            buku.tampilkanDDS();
            buku.tampilkanSubjek();
            System.out.println();
        }
    }
}
