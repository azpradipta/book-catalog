public class Buku {

    private String judul;
    private String penulis;
    private String isbn;
    private String dds;
    private String subjek;

    public Buku(String judul, String penulis, String isbn, String dds, String subjek) {
        this.judul = judul;
        this.penulis = penulis;
        this.isbn = isbn;
        this.dds = dds;
        this.subjek = subjek;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getDds() {
        return dds;
    }

    public String getSubjek() {
        return subjek;
    }

    public void tampilkanJudul() {
        System.out.println("Judul: " + judul);
    }

    public void tampilkanPenulis() {
        System.out.println("Penulis: " + penulis);
    }

    public void tampilkanISBN() {
        System.out.println("ISBN: " + isbn);
    }

    public void tampilkanDDS() {
        System.out.println("DDS: " + dds);
    }

    public void tampilkanSubjek() {
        System.out.println("Subjek: " + subjek);
    }
}
