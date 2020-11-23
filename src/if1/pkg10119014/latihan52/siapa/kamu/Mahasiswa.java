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
class Mahasiswa extends Manusia{
        private String nim, kelas;
    
    public String getNim() {
        return this.nim;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public String getKelas() {
        return this.kelas;
    }
    
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa() {
        System.out.println("Saya " + getNama() + " umur " + getUmur() + " tahun sedang belajar di kelas " + getKelas());
    }
    
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
}
