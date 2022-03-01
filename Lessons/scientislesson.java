//Bu ilk kod.
package com.example.metodlar;

public class Scientists {
    String name;
    String field;
    int ArticleCount;


}
//Bu ikinci kod.
package com.example.metodlar;

public class Scientists {
    String name;
    String field;
    int articleCount;

    public Scientists(String name, String field, int articleCount) {
        this.name = name;
        this.field = field;
        this.articleCount = articleCount;
        System.out.println("Problem done");
    }
//Son metadomuz bir constructerdır. Metodumuzun içindeki değişkenler ise birer instancedir. (Nesnedir.)
// Constructuerın olayı ise nesnelermize ne yaparbiliriz. Bu konuda yardım etmektir.
//this'in önündeki değişken isimleri sınıfımıza referans vermektedir. Eşittirin karşısında ki değişkenler
//ise metodumuzun değişkenlerine referans vermektedir. (metod değikeni isimleri sınıflarla aynı olmak zorunda değil.)
}
