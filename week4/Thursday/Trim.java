package week4.Thursday;

import java.util.Scanner;

class StringTrim {
    String rev(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }

    String trim(String s) {

        while (s.codePointAt(0) == ' ') {
            s = s.replaceFirst(" ", "");
        }
        s = rev(s);
        while (s.codePointAt(0) == ' ') {
            s = s.replaceFirst(" ", "");
        }
        s = rev(s);
        return s;
    }
}

class Trim {

    public static void main(String[] args) {
        StringTrim obj = new StringTrim();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Size before trim: " + s.length());
        s = obj.trim(s);
        System.out.println("Size after trim: " + s.length());
    }

}
