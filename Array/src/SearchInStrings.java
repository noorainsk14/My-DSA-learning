public class SearchInStrings {
    public static void main(String[] args) {

        String str = "noorain";
        char target = 'a';
        System.out.println(linearSearch(str, target));
    }


    //search character in array
    static boolean linearSearch(String str, char target){
        if(str.length() == 0){
            return false;
        }



        for(int i=0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }

        }
        return false;
    }
}
