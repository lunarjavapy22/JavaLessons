package com.example.lib;

public class LessenOper {
    public static void main(String[] args){
        System.out.println("Operatörler Dersine hoşgeldiniz.");
        int x = 10;
        int y = 20;
        x = x+5;
        System.out.println(x);
// Bu x'i arttırma yöntemdir. Bir şeklide;
        x++;
        System.out.println(x);
        y--;
        System.out.println(y);
        System.out.println(x>y);
        //&& (ve = and) operatörü
        int z = 17;
        System.out.println(x<y && z<y);
        //Girdiğim her 2 tarafında doğru olması koşulunda True dönecektir. Biri false ise false dönecektir.
        // Or yada veya ||
        System.out.println(x<y || y<z);
        //bir tarafın doğru olması True dönmesi için yeterli.

    }

}
