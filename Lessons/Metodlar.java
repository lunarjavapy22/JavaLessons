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
