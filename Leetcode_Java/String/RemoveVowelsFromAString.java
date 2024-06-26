package Leetcode_Java.String;

public class RemoveVowelsFromAString {

    public static void main(String[] args) {
        System.out.println(removeVowels("leetcodeisacommunityforcoders"));   //Output : ltcdscmmntyfrcdrs
    }

    public static String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}

/*
    Using switch case
    public static String removeVowels(String s) {
        //Base case
        if (s.length() == 0) return "";

        StringBuilder sb = new StringBuilder();
        for (Character c : s.toCharArray()) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }
 */
