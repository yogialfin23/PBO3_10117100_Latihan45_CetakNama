package com.company;
/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Printer prt = new Printer();
        Scanner scn = new Scanner(System.in);

        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.printf("Masukkan nama anda : ");
        prt.setNama(scn.nextLine());
        System.out.printf("Mau Cetak nama anda berapa kali ? : ");
        prt.setJmlCetak(scn.nextInt());
        prt.cetak(prt.getNama());
        System.out.println("Hasil Cetak : ");
        prt.cetak(prt.getJmlCetak(),prt.getNama());
    }
}
