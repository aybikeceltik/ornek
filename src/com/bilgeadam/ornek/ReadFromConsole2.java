package com.bilgeadam.ornek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromConsole2 {
    public static void main(String[] args) {

        int yas = 0;

            // Scanner obejesiyle conosoleden veri okuyabiliyoruz..
            Scanner scanner = new Scanner(System.in);
            System.out.print("İsminizi giriniz:");
            String isim = scanner.nextLine();
            System.out.print("Yaşınızı girin:");

            try {
                yas = scanner.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.err.println("Hata: Yas alanına girmek zorundasın:");
                System.exit((-10));
            }

            // int yas = (int)((double) scanner.nextLine());
            // int yas = (int)(Double.parseDouble(scanner.nextLine()));

            if (yas <= 35) {
                System.out.println(yas + "yaşında yolun 1.yarısındasın " + isim);
            } else {
                System.out.println(yas + "yaşında yolun 2.yarısındasın" + isim);
            }
        }

}
