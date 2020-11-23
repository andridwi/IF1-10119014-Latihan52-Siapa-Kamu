/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan52.siapa.kamu;

/**
 *
 * @author Andri
 * Nama : Andri Dwi P
 * Kelas: IF-1
 * NIM  : 10119014
 */
public class IF110119014Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Dosen dosen;
        Mahasiswa mahasiswa;
        
        dosen = new Dosen();
        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println();
        mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10119014");
        System.out.println("NIM MAHASISWA : " + mahasiswa.getNim());
        mahasiswa.setNama("Andri Dwi P");
        mahasiswa.setUmur(20);
        mahasiswa.setKelas("PBO");
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
    
}
