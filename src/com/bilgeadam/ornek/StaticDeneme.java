package com.bilgeadam.ornek;

public class StaticDeneme {

    // Instance variable
    int sayi1;

    // Class variable - değişken static ise class variable'dır.
    static int sayi2;

    public static void main(String[] args) {

        // static olmayan değişkene, static metoddan erişilemez.
        // Erişmek istiyorsak, class'ın kendi objesini
        // oluşturarak erişeceğiz.

        // Local variable'ı biz initialize etmek zorundayız.
        // Yani ilk değer vermek zorundayız.
        int sayi3=0;

        StaticDeneme sd = new StaticDeneme();

        System.out.println("Sayı1:"+sd.sayi1);
        System.out.println("Sayı2:"+sayi2);
        System.out.println("Sayı3:"+sayi3);

    }

}
