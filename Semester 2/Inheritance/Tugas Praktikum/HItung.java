package Praktikum;
public class Hitung {
    public static void main (String [] args){
        Identitas pegawai = new Identitas ();
        pegawai.intro ();
        
        Gaji karyawan = new Gaji();
        karyawan.nama ();
        karyawan.gender ();
        karyawan.jabatan();
        karyawan.gaji();
        karyawan.bonus();
    }
    }
