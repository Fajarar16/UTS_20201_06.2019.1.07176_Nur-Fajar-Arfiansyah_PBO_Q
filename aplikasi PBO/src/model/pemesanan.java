/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import aplikasi.pbo.kendaraan;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Habib
 */
public class pemesanan implements NewInterface{
    private String jenisKendaraan;
    Scanner input = new Scanner(System.in);
    private ArrayList<kendaraan> kendaraan;
     
    public pemesanan(){
         kendaraan = new ArrayList<kendaraan>();
     }
    public void insert(kendaraan pesan){
        kendaraan.add(pesan);
    }
   
    
    @Override
    public void ambil(String nama, String platnomor){
             if(kendaraan.isEmpty()){
            System.out.println("Anda Belum Terdaftar, Silahkan daftar Dahulu \n");
                 
           }else{    
                   for(int i=0;i<kendaraan.size();i++)
                   {
                       if(kendaraan.get(i).getNama().equals(nama) && kendaraan.get(i).getNomor_kendaraan().equals(platnomor))
                        {
                            System.out.println(" DATA BERHASIL DIAMBIL");
                            kendaraan.remove(i);
                        }
             } 
       }
    }
    
   
    @Override
    public void update(String update){
        if(kendaraan.isEmpty()){
            System.out.println("\tData Kosong");
            System.out.println("Masukkan data terlebih dahulu");
           }else{
             for(int i=0;i<kendaraan.size();i++){
                 if(update.equals(kendaraan.get(i).getNama())){
                     System.out.print("masukkan data baru : ");
                    String baru = input.next();
                    kendaraan.get(i).setNama(baru);
                    break;
                 }else if(update.equals(kendaraan.get(i).getAlamat())){
                     System.out.print("masukkan data baru : ");
                    String baru = input.next();
                    kendaraan.get(i).setAlamat(baru);
                    break;
                 }else if(update.equals(kendaraan.get(i).getMerk())){
                    System.out.print("masukkan data baru : ");
                    String baru = input.next();
                    kendaraan.get(i).setMerk(baru);
                    
                    break;
                }else if(update.equals(kendaraan.get(i).getNomor_kendaraan())){ 
                    System.out.print("masukkan data baru : ");
                    String baru = input.next();
                    kendaraan.get(i).setNomor_kendaraan(baru);
                   
                    break;
                }else  if(update.equals(kendaraan.get(i).getWarna())){
                    System.out.print("masukkan data baru : ");
                    String baru = input.next();
                    kendaraan.get(i).setWarna(baru);
                   
                    break;
                }
             }
        }
    }
    
    @Override
    public void view(){
              if(kendaraan.isEmpty()){
            System.out.println(" TIDAK ADA ANTRIAN ");
        }else{
        System.out.println("====== ANTRIAN =======");
        for(int i=0;i<kendaraan.size();i++){
                System.out.println(" nama       : "+kendaraan.get(i).getNama());
                System.out.println(" alamat     : "+kendaraan.get(i).getAlamat());
                System.out.println(" nomor plat : " + kendaraan.get(i).getNomor_kendaraan());
                System.out.println(" merk       : " + kendaraan.get(i).getMerk());
                System.out.println(" warna      : " + kendaraan.get(i).getWarna());
                System.out.println("_____________________________");
            }
        }
    }
}