package com.bilgeadam.ornek;

import javafx.scene.chart.ScatterChart;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {
        try {


            // Scanner obejesiyle conosoleden veri okuyabiliyoruz..
            Scanner scanner = new Scanner(System.in);
            System.out.print("İsminizi giriniz:");
            String isim = scanner.nextLine();
            System.out.print("Yaşınızı girin:");
            int yas = scanner.nextInt();

            // int yas = (int)((double) scanner.nextLine());
            // int yas = (int)(Double.parseDouble(scanner.nextLine()));

            if (yas <= 35) {
                System.out.println(yas + "yaşında yolun 1.yarısındasın " + isim);
            } else {
                System.out.println(yas + "yaşında yolun 2.yarısındasın" + isim);
            }
        }
        catch (InputMismatchException e)
        {
            System.err.println("Hata : Yaş alanına sayı girmek zorundasın");
        }
        catch (Exception e)
        {
            //System.err.println("Hata oluştu:" + e.getMessage());
            e.printStackTrace();
        }
    }

}
