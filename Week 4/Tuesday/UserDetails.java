
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

class PersonDetails {
    String firstName;
    String lastName;
    String email;
    String password;
    IndianPhoneNumber[] phoneNumbers;

    public PersonDetails(String firstName, String lastName, String email, String password,
            IndianPhoneNumber[] phoneNumbers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumbers = phoneNumbers;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public IndianPhoneNumber[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(IndianPhoneNumber[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "PersonDetails [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
                + password + ", phoneNumbers= ]";
    }

}

class Validation {
    Validation() {
    }

    static boolean checkAlphabet(String s) {
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if ((c < 65 && c > 90) || (c < 97 && c > 122))
                return false;
        }
        return true;
    }

    static boolean isValidPhoneNumber(String phone) {
        if (phone.length() != 10)
            return false;
        for (int i = 0; i < phone.length(); i++) {
            if (!(Character.isDigit(phone.charAt(i))))
                return false;
        }
        return true;
    }

    static boolean isValidEmail(String email) {
        int dot = 0;
        int at = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == ' ')
                return false;
            if (email.charAt(i) == '@')
                at++;
            if (email.charAt(i) == '.')
                dot++;
        }
        return (dot > 0 && at > 0);
    }

    static boolean isValidPassword(String password) {
        if (password.length() < 8 || password.length() > 16)
            return false;
        int digits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i)))
                digits++;
        }
        return digits > 0;

    }

    static void validate(PersonDetails p) throws IllegalArgumentException {
        if (!checkAlphabet(p.getFirstName()))
            throw new IllegalArgumentException("First name can only contain alphabets.");
        if (!checkAlphabet(p.getLastName()))
            throw new IllegalArgumentException("Last name can only have alphabets.");
        if (!isValidEmail(p.getEmail()))
            throw new IllegalArgumentException(
                    "Email should contain an (.) and an (@) and should not have any spaces in between");
        if (!isValidPassword(p.getPassword()))
            throw new IllegalArgumentException(
                    "Password should be between 8 an 16 characters and should contain atleast one digit");

        IndianPhoneNumber[] phoneNumbers = p.getPhoneNumbers();
        for (int i = 0; i < phoneNumbers.length; i++) {
            if (!isValidPhoneNumber(phoneNumbers[i].phNo))
                throw new IllegalArgumentException("Phone numbers should be 10 digits");
        }

    }

}

class UserDetails {
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.next();
        System.out.println("Enter Last name: ");
        String lastName = scanner.next();
        System.out.println("Enter email : ");
        String email = scanner.next();
        System.out.println("Enter Password : ");
        String password = scanner.next();
        System.out.println("Enter total phone numbers");
        int n = scanner.nextInt();
        scanner.nextLine();
        IndianPhoneNumber[] phoneNumbers = new IndianPhoneNumber[n];
        System.out.println("Enter " + n + " phone numbers");
        for (int i = 0; i < n; i++) {
            phoneNumbers[i] = new IndianPhoneNumber(scanner.next());
        }
        PersonDetails person = new PersonDetails(firstName, lastName, email, password, phoneNumbers);

        try {
            Validation.validate(person);
            String fullName = person.getFullName();
            System.out.println("Full name: " + fullName);
            System.out.println(person);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();

    }
}
