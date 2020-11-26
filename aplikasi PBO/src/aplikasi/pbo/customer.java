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
public abstract class customer {
    protected String nama,alamat;

    public customer(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
    
}
