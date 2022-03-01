package week4.Wednesday;

import java.util.*;

class PhoneNumber {
    String countryCode;
    String phNo;

    PhoneNumber(String countryCode, String phNo) {
        this.countryCode = countryCode;
        this.phNo = phNo;
    }

    @Override
    public String toString() {
        return countryCode + "-" + phNo;
    }
}

class IndianPhoneNumber extends PhoneNumber {
    IndianPhoneNumber(String phNo) {
        super("+91", phNo);
    }
}

class Inputs {
    String firstName;
    String lastName;
    String email;
    String password;
    IndianPhoneNumber[] phoneNumber;
    String dob;

    public Inputs(String firstName, String lastName, String email, String password, IndianPhoneNumber[] phoneNumber,
            String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
    }

    boolean isValidAlphabet(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!(Character.isLetter(s.charAt(i))))
                return false;
        }
        return true;
    }

    boolean isValidPhoneNumber(String ph) {
        int n = ph.length();
        if (n < 10)
            return false;
        for (int i = 0; i < n; i++) {
            if (!(ph.charAt(i) >= '0' && ph.charAt(i) <= '9'))
                return false;
        }
        return true;
    }

    boolean isValidEmail(String email) {
        int op = 0;
        int s = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == ' ')
                return false;
            if (email.charAt(i) == '@')
                s++;
            if (email.charAt(i) == '.')
                op++;
        }
        return (op > 0 && s > 0);
    }

    boolean isValidPassword(String pass) {

        if (!(pass.length() >= 8 && pass.length() <= 16)) {
            return false;
        }
        for (int i = 0; i < pass.length(); i++) {

            if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
                return true;
            }
        }

        return false;

    }

    boolean isValidDob(String Dob) {
        int date = Integer.parseInt(Dob.substring(0, 2));
        int month = Integer.parseInt(Dob.substring(3, 5));
        int year = Integer.parseInt(Dob.substring(6, 10));
        if (date > 0 && date < 31) {
            if (month > 0 && month < 13) {
                return (year > 1900 && year <= 2019);
            } else
                return false;
        }
        return false;

    }

    void validate() throws IllegalArgumentException {

        if (!(isValidAlphabet(this.firstName) && isValidAlphabet(this.lastName))) {
            throw new IllegalArgumentException("Please Enter only alphabetic characters in name.");
        }
        if (!isValidPassword(password)) {
            throw new IllegalArgumentException(
                    "The length of password should be between 8 to 16 charcaters and it must include atleast one digit");

        }
        if (!isValidDob(dob)) {
            throw new IllegalArgumentException("The date of birth is invalid.");
        }
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Email must contain @ and '.' Example: abc@gmail.com");
        }

        IndianPhoneNumber[] phone = this.phoneNumber;
        for (int i = 0; i < phone.length; i++) {
            if (!isValidPhoneNumber(phone[i].phNo))
                throw new IllegalArgumentException("Phone nnumber must contain only digits and should be of 10 digits");
        }

    }

    @Override
    public String toString() {
        return "Inputs [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", Date of Birth="
                + dob
                + "], password=" + password + ", phoneNumber=" + Arrays.toString(phoneNumber) + "]";
    }

}

public class Validate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your firstname: ");
        String firstName = sc.nextLine();
        System.out.println("Enter your lastname: ");
        String lastName = sc.nextLine();
        System.out.println("Enter the Date of Birth: ");
        String dob = sc.nextLine();
        System.out.println("Enter your email: ");
        String email = sc.nextLine();
        System.out.println("Enter your password: ");
        String password = sc.nextLine();

        System.out.println("Enter number of phonenumbers: ");
        int n = sc.nextInt();
        sc.nextLine();
        IndianPhoneNumber[] phoneNumbers = new IndianPhoneNumber[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + " Phone number");
            phoneNumbers[i] = new IndianPhoneNumber(sc.next());
        }

        Inputs obj = new Inputs(firstName, lastName, email, password, phoneNumbers, dob);
        try {
            obj.validate();
            System.out.println(obj.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

}
