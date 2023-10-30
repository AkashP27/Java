package searching.linear;

import java.util.Arrays;

public class Strings {

    static boolean linearSearch(String str, char target) {
        if(str.length() == 0)
            return false;

        for (int i=0; i< str.length(); i++) {
            if(str.charAt(i) == target)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String name = "Akash";
        char target = 'S';
        System.out.println(linearSearch(name, target));

//        System.out.println(Arrays.toString(name.toCharArray()));
    }
}
