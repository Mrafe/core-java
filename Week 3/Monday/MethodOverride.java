package Day6;

class Parent {
    String firstname;
    String lastname;

    Parent() {
        this.lastname = "Uzumaki";
    }

    Parent(String firstname) {
        this();
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return String.format("Firstname: %s %nLastname: %s", this.firstname, this.lastname);
    }
}

class Child extends Parent {
    Child() {
        super();
    }

    Child(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        System.out.println("CHILD OBJECT::");
        return super.toString();
    }
}

class Family {
    public static void main(String[] args) {
        Parent parent = new Parent("Naruto");
        Child child = new Child("Boruto");
        System.out.println(parent);
        System.out.println(child);
    }
}

// b.getClass().getSuperclass()
// .getMethod("method", new Class[]{} )
// .invoke(b.getClass().getSuperclass().newInstance() ,new Object[]{}) ;;
