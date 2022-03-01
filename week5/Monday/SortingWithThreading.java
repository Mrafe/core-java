package week5.Monday;

import java.util.Arrays;

class Height {
    int feet;
    int inches;

    Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }
}

class Student {
    String name;
    int rollNo;
    int age;
    double marks;
    Height height;

    public Student(String name, int rollNo, int age, double marks, Height height) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.marks = marks;
        this.height = height;
    }

    public static int compareByAge(Student s1, Student s2) {
        if (s1.age > s2.age) {
            return 1;
        } else if (s1.age == s2.age) {
            return 0;
        } else {
            return -1;
        }
    }

    public static int compareByMarks(Student s1, Student s2) {
        if (s1.marks > s2.marks) {
            return 1;
        } else if (s1.marks == s2.marks) {
            return 0;
        } else {
            return -1;
        }
    }

    public static int compareByHeight(Student s1, Student s2) {
        if (s1.height.feet > s2.height.feet) {
            return 1;
        } else if (s1.height.feet == s2.height.feet) {
            if (s1.height.inches > s2.height.inches) {
                return 1;
            } else if (s1.height.inches == s2.height.inches) {
                return 0;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    synchronized Student[] sortByHeight(Student[] s) {
        Student[] clone = Arrays.copyOf(s, s.length);
        Student temp;
        for (int i = 0; i < s.length; i++) {
            for (int j = i; j < s.length - 1; j++) {
                if (compareByHeight(clone[j], clone[j + 1]) > 0) {
                    temp = clone[j];
                    clone[j] = clone[j + 1];
                    clone[j + 1] = temp;
                }
            }
        }
        return clone;
    }

    synchronized Student[] sortByAge(Student[] s) {
        Student temp;
        Student[] clone = Arrays.copyOf(s, s.length);
        for (int i = 0; i < s.length; i++) {
            for (int j = i; j < s.length - 1; j++) {
                if (compareByAge(clone[j], clone[j + 1]) > 0) {
                    temp = clone[j];
                    clone[j] = clone[j + 1];
                    clone[j + 1] = temp;
                }
            }
        }
        return clone;
    }

    synchronized Student[] sortByMarks(Student[] s) {
        Student temp;
        Student[] clone = Arrays.copyOf(s, s.length);
        for (int i = 0; i < s.length; i++) {
            for (int j = i; j < s.length - 1; j++) {
                if (compareByMarks(clone[j], clone[j + 1]) > 0) {
                    temp = clone[j];
                    clone[j] = clone[j + 1];
                    clone[j + 1] = temp;
                }
            }
        }
        return clone;
    }
}

class SortingWithThreading {
    public static void main(String[] args) {
        Student[] s = new Student[5];
        Height[] h = new Height[5];
        h[0] = new Height(4, 10);
        s[0] = new Student("Nezuko", 1, 13, 47, h[0]);
        h[1] = new Height(5, 1);
        s[1] = new Student("Akeno", 2, 15, 49, h[1]);
        h[2] = new Height(5, 5);
        s[2] = new Student("Rias", 3, 17, 50, h[2]);
        h[3] = new Height(5, 7);
        s[3] = new Student("Asuna", 4, 17, 45, h[3]);
        h[4] = new Height(5, 3);
        s[4] = new Student("Gremory", 5, 15, 44, h[4]);

        Student[] sorted = new Student[5];
        // Thread t1 = new Thread() {
        // sortedByMarks[1] = s.sortByMarks(s);
        // };

        // Thread t2 = new Thread(){

        // };

    }
}