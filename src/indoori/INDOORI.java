/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indoori;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Ikhsan Abdurachman
 */
public class INDOORI {
    public static Object nice;
    public static void main(String[] args) {
    do {
        Scanner input = new Scanner(System.in);
        System.out.println("==== WARUNK G'OOL INDOORI ====");
        System.out.println("=====   CASHIER PROGRAM  =====");
        System.out.println(" ");
        System.out.print("Masukan Jumlah Pesanan : ");
        int jumlah = input.nextInt();
        System.out.println(" ");
        
        String[] pesanan;
        pesanan = new String[jumlah];
        int[] harga;
        harga = new int[jumlah];
        for (int i = 0; i < pesanan.length; i++) {
            System.out.print("Pesanan : ");
            pesanan [i] = input.next();
            System.out.print("Harga : Rp.");
            harga [i] = input.nextInt();          
        }
        File filestruk = new File("D:\\Struk.txt");
        try {
            filestruk.createNewFile();
            System.out.println("Berhasil Membuat File");
        } catch (Exception e) {
            System.out.println("Gagal Membuat File"+e);
        }
        try {
            try (PrintWriter pw = new PrintWriter(filestruk)) {
                int total = 0;
                pw.write("==== WARUNK G'OOL INDOORI ====\n");
                pw.write("=====   Struk Pembelian  =====\n");
                for (int i = 0; i < pesanan.length; i++) {
                    pw.write(pesanan[i]+" \t : \t");
                    pw.write(harga[i]+"\n");
                }
                for (int i = 0; i < jumlah; i++) {
                    total = total+harga[i];
                }
                pw.write("==============================" + "\n");
                pw.write("Total Harga " + "\t"+": Rp."+total);
                pw.close();
                
                System.out.println("Berhasil Menginput Data!");
            }
        }catch (Exception e) {
            System.out.println("Gagal Menginput Data!"+e);
        }
        System.out.println("");
        try {
            FileReader awu = new FileReader(filestruk);
            BufferedReader awa = new BufferedReader(awu);
            String lihat;

            while((lihat=awa.readLine())!=null) {
                System.out.println(lihat);
            }
        }catch (Exception e) {
            System.out.println("Gagal Membaca File"+e);
        }
         System.out.println("Input Lagi ? [y/n]");
            nice = input.next();
        }
            while (nice.equals("y"));
            System.out.println("=====   PROGRAM SELESAI   =====");
            System.out.println("==== Developed by IHSBRAMN ====");
    }  
}
