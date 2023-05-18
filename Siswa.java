import java.util.ArrayList;

public class Siswa implements User{
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> noHp = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    
    public Siswa(){
        this.namaSiswa.add("Nindy");
        this.alamat.add("Probolinggo");
        this.noHp.add("08123493540");
        this.status.add(true);
        
        this.namaSiswa.add("amalyani");
        this.alamat.add("Malang");
        this.noHp.add("08155678390");
        this.status.add(true);
    }
    
    public int getJmlSiswa(){
        return this.namaSiswa.size();
    }
    
    public void setStatus(boolean status){
        this.status.add(status);
    }
    
    public boolean getStatus(int idSiswa){
        return this.status.get(idSiswa);
    }
    
    public void editStatus(int idSiswa, boolean status){
        this.status.set(idSiswa, status);
    }

    @Override
    public void setNama(String namaSiswa) {
        this.namaSiswa.add(namaSiswa);
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
    public String getNama(int idSiswa) {
        return this.namaSiswa.get(idSiswa);
    }

    @Override
    public String getAlamat(int idSiswa) {
        return this.alamat.get(idSiswa);
    }

    @Override
    public String getNoHp(int idSiswa) {
        return this.noHp.get(idSiswa);
    }
}

