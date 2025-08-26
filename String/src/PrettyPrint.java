public class PrettyPrint {

    public static void main(String[] args) {

        float a = 132.7547f;

        System.out.printf("formated number is %.2f %n ", a);
        //output
        //formated number is 132.75
        //System.out.println();
        System.out.printf("formated number is %.3f ",Math.PI);
        //formated number is 3.142
    }
}
//
//There are many format specifiers we can use. Here are some common ones:
//
//        %c - Character
//%d - Decimal number (base 10)
//%e - Exponential floating-point number
//%f - Floating-point number
//%i - Integer (base 10)
//%o - Octal number (base 8)
//%s - String
//%u - Unsigned decimal (integer) number
//%x - Hexadecimal number (base 16)
//%t - Date/time
//%n - Newline
