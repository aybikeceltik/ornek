package com.bilgeadam.ornek;

public class HataYakalama {
    public static void main(String[] args) {

        try {
            int sayi1 = 7;
            int sayi2 = 0;
            double sonuc = sayi1 / sayi2;

            System.out.println("Sonuc:" + sonuc);
        }
        catch (ArithmeticException ae)
        {
            System.err.println("Hata: Sıfıra bölme hatası:");
        }

        catch (Exception e)
        {
            //System.out.println("Hata oluştu");
            System.err.println("Hata oluştu:" + e.getMessage());
        }
    }
}
