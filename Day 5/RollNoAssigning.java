
public class RollNoAssigning {
    static int count = 1;
    int rollNo;
    private String name;
    static final String UNIVERSITY = "Dr D Y Patil School of Engineering";
    private String hometown;

    public RollNoAssigning() {
        this.name = "New Student";
        rollNo = count;
        count++;
    }

    public RollNoAssigning(String name) {
        this();
        this.name = name;
    }

    public RollNoAssigning(String name, String hometown) {
        this();
        this.name = name;
        this.hometown = hometown;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getUNIVERSITY() {
        return UNIVERSITY;
    }

    void print() {
        System.out.println(name + " is from " + hometown);
        System.out.println(UNIVERSITY + " Roll number is " + rollNo);
    }
}

class C202 {
    public static void main(String[] args) {
        RollNoAssigning student1 = new RollNoAssigning();
        student1.print();
        RollNoAssigning student2 = new RollNoAssigning("Kaneko");
        student2.print();
        RollNoAssigning student3 = new RollNoAssigning("Asuna", "Tokyo");
        student3.print();
        student2.setHometown("Kyoto");
        student2.print();
    }
}