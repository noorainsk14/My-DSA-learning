
public class Main {
    public static void main(String[] args) {
int n =5;
        pattern28(n);
    }
    
    public static void pattern1(int n){
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for (int row = 1; row <= 2*n; row++) {
        int totalColumn = row > n ? 2 * n -row : row;
            for (int col = 1; col <= totalColumn; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern28(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;
            //for spaces
            int noOfspaces = n -totalColsInRow;
            for (int i = 0; i < noOfspaces; i++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

