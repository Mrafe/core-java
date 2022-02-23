package Day6;

class Person {
    private String name;

    public Person() {
        this.name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void print() {
        System.out.println("The name is " + name);
    }

}

class Employee extends Person {
    double salary;
    int year;
    private String UAN;

    public Employee() {
        this.salary = 0;
        this.year = -1;
        this.UAN = "";
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getUAN() {
        return UAN;
    }

    public void setUAN(String uAN) {
        UAN = uAN;
    }

    void print() {
        super.print();
        System.out.println("The salary is " + salary);
        System.out.println("The Year of joining is " + year);
        System.out.println("The UAN is " + UAN);
    }
}

class Driver {
    public static void main(String[] args) {
        Employee obj1 = new Employee();
        Employee obj2 = new Employee();
        Person obj3 = new Person();
        obj1.setName("Nezuko");
        obj1.setSalary(40000);
        obj1.setUAN("432564A");
        obj1.setYear(2019);
        obj2.setName("Orihime");
        obj2.setSalary(37000);
        obj2.setUAN("432558C");
        obj2.setYear(2021);
        obj3.setName("Kannao");
        obj1.print();
        obj2.print();
        obj3.print();
        if (obj3.equals(obj2) || obj3.equals(obj1))
            System.out.println("Person and obj object are equal");
        else
            System.out.println("The person and obj objects are not equal");
        if (obj1.equals(obj2))
            System.out.println("Obj1 and obj2 are equal");
        else
            System.out.println("Both the objects are not equal");
    }
}
