package week4.Thursday;

import java.util.Scanner;

class StringOperations {
    boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll(" ", "").toLowerCase();
        str2 = str2.replaceAll(" ", "").toLowerCase();
        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 != len2)
            return false;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < len1; i++) {
            int char1 = str1.charAt(i);
            int char2 = str2.charAt(i);
            if (char1 != 32)
                sum1 += char1;
            if (char2 != 32)
                sum2 += char2;
        }
        return (sum1 == sum2);
    }
}

class Anagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        StringOperations obj = new StringOperations();
        if (obj.isAnagram(str1, str2))
            System.out.println("It is anagram");
        else
            System.out.println("Not an anagram");
        scanner.close();
    }
}
