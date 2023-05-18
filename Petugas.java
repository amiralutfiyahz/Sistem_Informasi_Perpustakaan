import java.util.ArrayList;

public class Petugas implements User {

    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> noHp = new ArrayList<String>();

    public Petugas() {
        this.namaPetugas.add("Amira");
        this.alamat.add("BandaAceh");
        this.noHp.add("081234567891");

        this.namaPetugas.add("Risma");
        this.alamat.add("Pidie");
        this.noHp.add("08987654321");
    }

    public int getJmlPetugas() {
        return this.namaPetugas.size();
    }

    @Override
    public void setNama(String namaPetugas) {
        this.namaPetugas.add(namaPetugas);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setNoHp(String noHp) {
        this.noHp.add(noHp);
    }

    @Override
    public String getNama(int idPetugas) {
        return this.namaPetugas.get(idPetugas);
    }

    @Override
    public String getAlamat(int idPetugas) {
        return this.alamat.get(idPetugas);
    }

    @Override
    public String getNoHp(int idPetugas) {
        return this.noHp.get(idPetugas);
    }
}  

