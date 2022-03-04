import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


Doğru Kod.
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int i;
        for(i=1; i <= 10; i++){
            System.out.println(N+ " x " + i +" = " + N*i);
            
        }
        bufferedReader.close();
    }
}
**************************************************************
Benim yaptığım yanlış kod.
  public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int i;
        for(i > 0; i == 10; i++){
            s = N *i
            system.out.println(s)
            
        }
        bufferedReader.close();
    }
}
Tamamı ile yanlış bir kodlama çünkü bizden 1 tek sayı dönemimizi istemiyor. Bizden istenen çıktı;
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
