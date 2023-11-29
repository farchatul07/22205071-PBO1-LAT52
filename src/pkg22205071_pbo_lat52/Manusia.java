/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22205071_pbo_lat52;

/**
 *
 * @author user
 Nama              : Farchatul Hudayah
 Nim               : 22205071
 Prodi             : Teknik Informatika
 Kelas             : PBO1
 Deskripsi Program : untuk menampilkan hasil SIAPA KAMU dengan menampilkan teks "Saya manusia"
 */
class Manusia {
    
    protected String nama;
    protected int umur;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public void setUmur (int umur){
        this.umur =  umur;
    }
    
    public void siapaKamu(){
        System.out.println("Saya Manusia");
    }
}

class Dosen extends Manusia{
    private String nip;
    private String mataKuliah;
    
    public String getNip(){
        return nip;
    }
    
    public void setNip(String nip){
        this.nip = nip;
    }
    
    public String getMataKuliah(){
        return mataKuliah;
    }
    
    public void setMataKuliah(String mataKuliah){
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Saya Rizki Adam Kurniawan umur 27 tahun sedang"
                + " mengajar matakuliah PBO");
    }
    
    @Override
    public void siapaKamu(){
        System.out.println("Saya Dosen");
    }
}

class Mahasiswa extends Manusia{
    private String nim;
    private String kelas;
    
    public String getNim(){
        return nim;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public String getKelas(){
        return kelas;
    }
    
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya Nindi umur 17 tahun sedang belajar di kelas PBO2");
    }
    
    @Override
    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");
    }
    
}

class ManusiaTester{
    
    public static void main(String[] args) {
        Dosen d = new Dosen();
        System.out.println("NIP DOSEN : 41227829930");
        d.siapaKamu();
        d.mengajarApa();
        
        Mahasiswa m = new Mahasiswa();
        System.out.println("\nNIM MAHASISWA : 10110269");
        m.siapaKamu();
        m.kelasApa();
    }
    
}
