/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.pbo;

/**
 *
 * @author Habib
 */
public class kendaraan extends customer {
   
    private String merk;
    private String nomor_kendaraan;
    private String warna;
    private String jenis;

    public kendaraan(String merk, String nomor_kendaraan, String warna, String nama, String alamat,String jenis) {
        super(nama, alamat);
        this.merk = merk;
        this.nomor_kendaraan = nomor_kendaraan;
        this.warna = warna;
        this.jenis=jenis;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setNomor_kendaraan(String nomor_kendaraan) {
        this.nomor_kendaraan = nomor_kendaraan;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    public String getMerk() {
        return merk;
    }

    public String getNomor_kendaraan() {
        return nomor_kendaraan;
    }

    public String getWarna() {
        return warna;
    }

    public String getJenis() {
        
        return jenis;
    }
   
}
