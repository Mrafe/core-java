package week2.Friday;

class Student {
    private int rollNo;
    private String Name;

    Student() {
        rollNo = 1;
        Name = "New Student";
    }

    Student(int rollNo, String Name) {
        this.rollNo = rollNo;
        this.Name = Name;
    }

    Student(int rollNo) {
        this.rollNo = rollNo;
    }

    Student(String Name) {
        this.Name = Name;
    }

    int getRollNo() {
        return rollNo;
    }

    String getName() {
        return Name;
    }

    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        Name = name;
    }

    void display() {
        System.out.println("The roll no of : " + Name + " is " + rollNo);
    }
}

class C204 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(2, "Kaneko");
        Student student3 = new Student(3);
        Student student4 = new Student("Nezuko");
        student3.setName("Asuna");
        student4.setRollNo(4);
        int roll1 = student1.getRollNo();
        String name2 = student2.getName();
        System.out.println("The roll number of student 1 is " + roll1);
        System.out.println("The Name of student 2 is " + name2);
        student3.display();
        student4.display();
    }
}