public class fordongusu {
    public static void main(String[] args){
        int[] mn = {4,52,63,741};

        for (int i = 0; i < mn.length; i++) {
            int x = mn[i] / 3 *5;
            //System.out.println(x);
        }
        for (int number : mn){
            System.out.println(number / 2 * 5);
        }

    }
}

//Yeni Ders ve örnekler
package com.example.lib;

import java.util.ArrayList;

public class lessonfor {
    public static void main(String[] args){
        int[] myInt = {14,25,63,85,46,45,70};

//For döngüsü için parantez açıyoruz ve bu paranteze bazı arametreler vermeliyiz.
//Bu parametreler işlemin nasıl başlayacağı, nereye kadar devam edeceği ve nasıl devam edeceği şeklindedir.
        for(int i = 0; i < (myInt.length - 1); i++){
            int x = myInt[i] / 4 *10;
            System.out.println(x);
        }
//Ne yaptık? For döngüsü için sembolik bir değer (i) atadık. For döngüsünün nereye kadar sürekli devame deceğini
//söyledik. ve for döngüsünün nasıl devam edeceğini (i'nin nasıl artacağını) yazdık. Oluşturduğumuz blokta
//ise i' değişkenlerimizin arrayimiz içindeki değeri sembol etmesini sağlayıp bunların züerinden yapılcak işlemi
//kodladık.

        ArrayList<Integer> bushido = new ArrayList<Integer>();
        for(int i =0; i <= 10; i = i+2){
            bushido.add(i);

        }
        System.out.println(bushido.get(5));
    }
}
//For döngüsünü öğrendikten sonra Array liste for ile değer göndermeye çalışcam.
//ArrayList<Integer> myArray = new ArrayList<Integer>();
// myArray.add(10,20,40,44,55,88,13,46);
