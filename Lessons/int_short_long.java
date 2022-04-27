
package com.mycompany.hello;


public class Hello {

    public static void main(String[] args) {
        System.out.println("Welcome Mr. Selim");
        
        //Veri Tipleri Ve Dönüşümler
        //byte --> short --> int --> long
        System.out.println(Byte.MAX_VALUE + " " + Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE + " " + Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE + " " + Long.MIN_VALUE);
        
        //Bu şekilde küçükten büyüğe verilerin aldığı değerleri görebiliriz. Dönüşüm işlemlerinde de 
        //bu verilerin büyükten küçüğe dönüşümü daha kolaydır.
        //intten byte'a dönüşüm yapılırken kayıp yaşanabilir. Java bu noktada hata verecektir. 
        
        short i = 100;
        byte j = 2;
        int l = 20;
        
        long z  = i + j + l;
        System.out.println(z);
        
    }
}
