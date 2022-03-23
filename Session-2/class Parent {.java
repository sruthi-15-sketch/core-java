class Parent {
    String firstname;
    String lastname;

    Parent() {
        this.lastname = "boddu";
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
        return String.format("Firstname: %s %nLastname: %s", this.firstname, this.lastname);
    }
}

class Main {
    public static void main(String args[]) {
        Parent p = new Parent();
        // new Parent();
        Child c = new Child();
        System.out.println(p.toString());
        System.out.println(c.toString());
    }
}
