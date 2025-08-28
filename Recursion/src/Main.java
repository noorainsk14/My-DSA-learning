
public class Main {
    public static void main(String[] args) {
        int n = 1;
        print( n );
    }

    static void print(int n){

        //base condition to stop function call
        if( n == 6 ){
            return;
        }
        System.out.println(n);

        //function calling itself is called a recursion
        print(n+1);
    }
}