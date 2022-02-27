package com.example.lib;

public class Lessonif {
    public static void main(String[] args){
        int x = 20;
        int y = 25;
        int z = 40;
        if(x < y ){
            z++;
            System.out.println("Yazdıramam");
            System.out.println(z);
        }else if(z < y){
            System.out.println("Belki yazdırabilirim.");
            x++;
        }else{
            System.out.println("Yazdırabilirim");
        }

    }

}
