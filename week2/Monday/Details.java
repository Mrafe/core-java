package week2.Monday;

public class Details {
    static void print(String s1, String s2, String s3) {
        System.out.println("Name :\t" + s1 + "\nCity :\t" + s2 + "\nHobby :\t" + s3);
    }

    public static void main(String[] args) {
        String name = "Mohammad Rafe";
        String city = "Pune";
        String hobby = "Gaming";
        print(name, city, hobby);
    }

}
