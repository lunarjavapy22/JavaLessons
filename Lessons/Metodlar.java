//Bu ilk kod.
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(math(a:5, b:8));
    }

    public int math(int a, int b){
        //Metodlar projemizde ki kod parçacıklarıdır.
        //Kodlarız ve görevini yapması için çağırırız.
        //
        return a + b;
    }

}
//Bu 2. kod.

package com.example.metodlar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on resume");
    }
    //Farkı ise 2. kodda kendi oluşturduğum sınıfa özellikler atadım. Bu sınıfta ise kendi oluşturduğum sınıftan atadağım özelliklere göre değişkenler atadım.
    public void whoscientist(){
        Scientists newton = new Scientists();
        newton.ArticleCount = 10;
        newton.field = "Astropysics";
        newton.name = "newton";
        System.out.println(newton.ArticleCount);
    }


}
