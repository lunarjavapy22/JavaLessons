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
