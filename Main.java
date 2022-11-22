/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phoneuser;

import java.util.Scanner;

/**
 *
 * @author LENOVO YOGA
 * Putri Aulia Hamzah
 * 21103074
 * S1SI-05-C
 */
public class Main {

    public static void main(String[] args) {
        Phone redmiNote8 = new Xiaomi();
        PhoneUser Dian = new PhoneUser(redmiNote8);

        Phone samsungA20s = new Samsung();
        PhoneUser Putri = new PhoneUser(samsungA20s);

        Phone OppoY21 = new Oppo();
        PhoneUser Popo = new PhoneUser(OppoY21);

        Phone Iphone14 = new IPhone();
        PhoneUser Zizi = new PhoneUser(Iphone14);

        Scanner input = new Scanner(System.in);
        int aksi, pilih;
        char ulang1, ulang2;

        System.out.println("=====OPERASI HP=====");

        do {
            System.out.println("Pilih Jenis HP ");
            System.out.println("[1] Xiaomi");
            System.out.println("[2] Samsung");
            System.out.println("[3] Oppo");
            System.out.println("[4] Iphone");
            System.out.print("Piih HP > ");
            pilih = input.nextInt();
            System.out.println();

            switch (pilih) {
                case 1:
                    do {
                        System.out.println("=== APLIKASI INTERFACE ===");
                        System.out.println("[1] Nyalakan HP");
                        System.out.println("[2] Matikan HP");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("------------------");
                        System.out.print("Pilih Aksi > ");
                        aksi = input.nextInt();
                        switch (aksi) {
                            case 1:
                                Dian.turnOnThePhone();
                                break;
                            case 2:
                                Dian.turnOffThePhone();
                                break;
                            case 3:
                                Dian.makePhoneLouder();
                                break;
                            case 4:
                                Dian.makePhoneSilent();
                                break;
                            default:
                                System.out.println("Menu tidak tersedia");
                        }
                        System.out.println();
                        System.out.println("Ingin memilih menu yang lain (y/t)?");
                        ulang2 = input.next().charAt(0);
                        System.out.println();
                    } while (ulang2 != 't');
                    break;

                case 2:
                    do {
                        System.out.println("=== APLIKASI INTERFACE ===");
                        System.out.println("[1] Nyalakan HP");
                        System.out.println("[2] Matikan HP");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("------------------");
                        System.out.print("Pilih Aksi > ");
                        aksi = input.nextInt();
                        switch (aksi) {
                            case 1:
                                Putri.turnOnThePhone();
                                break;
                            case 2:
                                Putri.turnOffThePhone();
                                break;
                            case 3:
                                Putri.makePhoneLouder();
                                break;
                            case 4:
                                Putri.makePhoneSilent();
                                break;
                            default:
                                System.out.println("Menu tidak tersedia");
                        }
                        System.out.println();
                        System.out.println("Ingin memilih menu yang lain (y/t)?");
                        ulang2 = input.next().charAt(0);
                        System.out.println();
                    } while (ulang2 != 't');
                    break;

                case 3:
                    do {
                        System.out.println("=== APLIKASI INTERFACE ===");
                        System.out.println("[1] Nyalakan HP");
                        System.out.println("[2] Matikan HP");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("------------------");
                        System.out.print("Pilih Aksi > ");
                        aksi = input.nextInt();
                        switch (aksi) {
                            case 1:
                                Popo.turnOnThePhone();
                                break;
                            case 2:
                                Popo.turnOffThePhone();
                                break;
                            case 3:
                                Popo.makePhoneLouder();
                                break;
                            case 4:
                                Popo.makePhoneSilent();
                                break;
                            default:
                                System.out.println("Menu tidak tersedia");
                        }
                        System.out.println();
                        System.out.println("Ingin memilih menu yang lain (y/t)?");
                        ulang2 = input.next().charAt(0);
                        System.out.println();
                    } while (ulang2 != 't');
                    break;

                case 4:
                    do {
                        System.out.println("=== APLIKASI INTERFACE ===");
                        System.out.println("[1] Nyalakan HP");
                        System.out.println("[2] Matikan HP");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("------------------");
                        System.out.print("Pilih Aksi > ");
                        aksi = input.nextInt();
                        switch (aksi) {
                            case 1:
                                Zizi.turnOnThePhone();
                                break;
                            case 2:
                                Zizi.turnOffThePhone();
                                break;
                            case 3:
                                Zizi.makePhoneLouder();
                                break;
                            case 4:
                                Zizi.makePhoneSilent();
                                break;
                            default:
                                System.out.println("Menu tidak tersedia");
                        }
                        System.out.println();
                        System.out.println("Ingin memilih menu yang lain (y/t)?");
                        ulang2 = input.next().charAt(0);
                        System.out.println();
                    } while (ulang2 != 't');
                    break;

            }
            System.out.println();
            System.out.println("Ingin memilih jenis HP yang lain (y/t)?");
            ulang1 = input.next().charAt(0);
            System.out.println();

        } while (ulang1 != 't');

        System.out.println("Terimakasih ");
    }
}
