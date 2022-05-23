package Praktikum;
public class Identitas {
    String nama = "Indah Lailatul";
    String gender = "Perempuan";
    int ID = 0053313100;
    
    public void intro (){
        System.out.println("=============");
        System.out.println("Berikut Indentitas Pegawai");
        System.out.println("=============");
    }
      public void nama (){
          System.out.println("Nama Pegawai \t : " +nama);
      }
      public void gender (){
          System.out.println("Jenis Kelamin \t : "+gender);
      }
      public void noID (){
          System.out.println("Nomor Pegawai \t : "+ID);
      }
}
