package week4.Thursday;

import java.util.Scanner;

final class Immutable {
    final String name;
    final int rollNo;

    public Immutable(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return this.name;
    }

    public int getRollNo() {
        return this.rollNo;
    }
}

class ImmutableDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int rollNo = scanner.nextInt();
        Immutable obj = new Immutable(name, rollNo);
        System.out.println("The name is : " + obj.name + " rollNo is : " + obj.rollNo);
    }
}
