import java.util.Arrays;

public class Methods {

    public static void main(String[] args) {
        String value = "     Hello my name is Noorain shaikh     ";
        String value2 = "Hello my name is Noorain shaikh";

        System.out.println(value.toLowerCase());
        System.out.println(value.trim());
        System.out.println(value.strip());
        System.out.println(Arrays.toString(value2.toCharArray()));
    }
}
