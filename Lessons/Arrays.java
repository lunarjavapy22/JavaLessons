package com.example.lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LessonArray {
    public static void main(String[] args){
//Java programlama bir tür dizi tanımla şekli böyledir.
        String[] myString = new String[3];
        myString[0] = "Selim";
        myString[1] = "Mustafa";
        myString[2] = "Ozen";
        System.out.println(myString[1]);
        System.out.println(myString[2]);


//Bir şekli ise listelerdir.
        ArrayList<String> myMusics = new ArrayList<String>();
        myMusics.add("Seliimm");
        System.out.println(myMusics.get(0));
//Listeler diğer arraylere göre daha esnektir. Eklenebilir, değiştirilebilinir. Bir diğer liste türümüz
//ise Setlerdir. Setler ise daha kısıtlıdır.
        HashSet<String> myHash = new HashSet<String>();
        myHash.add("Jamess");
        myHash.add("Jamess");
        System.out.println(myHash.size());
//Sete eklediğimiz değişken olmasına rağmen 2'side aynı olduğu için sadece 1 değişken varmış gibi döndü.

//HashMapler Pythonda ki sözlükler gibidir. Aynısıdır desem yanlış olmaz.
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("Selim", 23);
        System.out.println(myMap);
//İnternetten veri çıkmekte sık sık kullanılır. Çok önemlidir. 'int' yazmak yerine Interger yazmamızın
//sebebi ise uzun mesele. Sonra anlatırım.
    }
}
