package week4.Thursday;

import java.util.Scanner;

class StringOperations2 {
    String sort(String str) {
        int len = str.length() - 1;
        for (int i = 0; i <= len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (str.charAt(i) > str.charAt(j)) {
                    char temp = str.charAt(j);
                    str = str.replace(str.charAt(i), str.charAt(j));
                    str = str.replace(str.charAt(j), temp);
                }
            }
        }
        return str;
    }

    String merge(String str1, String str2) {
        int c = 0;
        int k = 0;
        String str3 = "";
        for (int i = 0; i < str1.length() + str2.length(); i++) {
            if (c == str1.length() - 1 || k == str2.length() - 1)
                break;
            if (str1.charAt(c) <= str2.charAt(k)) {
                str3 += str1.charAt(c);
                c++;
            } else {
                str3 += str2.charAt(k);
                k++;
            }
        }
        if (c < str1.length() - 1) {
            for (int i = c; i < str1.length(); i++) {
                str3 += str1.charAt(c);
                c++;
            }
        } else {
            for (int i = k; i < str2.length(); i++) {
                str3 += str2.charAt(k);
                k++;
            }
        }
        return str3;
    }
}

class MergeStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        StringOperations2 obj = new StringOperations2();
        s1 = obj.sort(s1);
        s2 = obj.sort(s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(obj.merge(s1, s2));
    }
}
