import java.util.ArrayList;
public class Buku {

    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public Buku() {
        this.namaBuku.add("Desain Grafis");
        this.stok.add(25);
        this.harga.add(5000);

        this.namaBuku.add("Database");
        this.stok.add(10);
        this.harga.add(3000);

        this.namaBuku.add("Pemograman");
        this.stok.add(35);
        this.harga.add(6000);
    }

    public int getJmlBuku() {
        return this.namaBuku.size();
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku.add(namaBuku);
    }

    public void setStok(int stok) {
        this.stok.add(stok);
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public String getNamaBuku(int idBuku) {
        return this.namaBuku.get(idBuku);
    }

    public int getStok(int idBuku) {
        return this.stok.get(idBuku);
    }

    public void editStok(int idBuku, int stok) {
        this.stok.set(idBuku, stok);
    }

    public int getHarga(int idBuku) {
        return this.harga.get(idBuku);
    }

}