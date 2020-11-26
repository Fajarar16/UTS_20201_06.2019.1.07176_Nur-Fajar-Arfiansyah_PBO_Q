/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import model.pemesanan;
import aplikasi.pbo.kendaraan;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Habib
 */
public class AplikasiPBO {

   static ArrayList <kendaraan> kendaraan = new ArrayList();
   static pemesanan pesan = new pemesanan();
   static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int pilih;
         do{
             
             System.out.println("1. Daftar ");
             System.out.println("2. Ambil ");
             System.out.println("3. Lihat Antrian");
             System.out.println("4. Update Data ");
             System.out.println("5. Keluar ");
             System.out.print("pilih : ");
             pilih = input.nextInt();
             switch(pilih)
             {
                 case 1 : Daftar();
                 break;
                 case 2 : Ambil();
                 break;
                 case 3 : view();
                 break;
                 case 4 : updateData();
                 break;
             }
          
        }while(pilih<5);
      }
    
      static void Daftar(){
          String jenis;
        System.out.println("1. roda 2");
        System.out.println("2. roda 4");
        System.out.print("pilih : ");
        int indexjenis = input.nextInt();
        if(indexjenis==1){
           jenis="Roda 2";
        }else{
            jenis = "Roda 4";
        }
        System.out.print("masukkan nama : ");
        String nama = input.next();
        System.out.print("masukkan alamat : ");
        String alamat = input.next();
        System.out.print("masukkan nomor plat : ");
        String plat = input.next();
        System.out.print("masukkan merk kendaraan : ");
        String merk = input.next();
        System.out.print("masukkan warna : ");
        String warna = input.next();
        pesan.insert(new kendaraan(merk,plat,warna,nama,alamat,jenis));

    }   
    static  void Ambil(){
         
          System.out.print("masukkan nama : ");
          String nama =input.next();
          System.out.print("masukkan nomor plat : ");
          String platnomor = input.next();
          pesan.ambil(nama,platnomor);
      }
    
      
    static  void view(){
     
          pesan.view();
      
    }
      
      
     static void updateData(){
           
          System.out.println("======DATA=======");
            for(int i=0;i<kendaraan.size();i++){
                System.out.println(" nama        : " + kendaraan.get(i).getNama());
                System.out.println(" alamat      : " + kendaraan.get(i).getAlamat());
                System.out.println(" nomor plat  : " + kendaraan.get(i).getNomor_kendaraan());
                System.out.println(" merk        : " + kendaraan.get(i).getMerk());
                System.out.println(" warna       : " + kendaraan.get(i).getWarna());
                System.out.println("_____________________________");
            }
             System.out.print("masukkan data yang lama : ");
             String cari = input.next();
             pesan.update(cari);
           }
      }