public class Teacher {

    private String name;
    private String subject;
    private double salary;
    private String address;

    // default constructor
    public Teacher() {
    }


    public Teacher(String name, String subject, double salary, String address) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
        this.address = address;
    }


    public String getName() { return name; }
    public String getSubject() { return subject; }
    public double getSalary() { return salary; }
    public String getAddress() { return address; }


    public void setName(String name) { this.name = name; }
    public void setSubject(String subject) { this.subject = subject; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setAddress(String address) { this.address = address; }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        // teacher1 uses the parameterized constructor
        Teacher teacher1 = new Teacher("Ahmed Ali", "Mathematics", 1500.0, "Hargeisa");

       
        Teacher teacher2 = new Teacher();
        teacher2.setName("Fadumo Hassan");
        teacher2.setSubject("Physics");
        teacher2.setSalary(1800.0);
        teacher2.setAddress("Mogadishu");

        teacher1.displayInfo();
        System.out.println();
        teacher2.displayInfo();
    }
}