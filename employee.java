class Employee {
    int id;
    String name;
    static String companyName;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    static void changeCompanyName(String newName) {
        companyName = newName;
    }
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Company: " + companyName);
    }
    public static void main(String[] args) {
        Employee.changeCompanyName("TechCorp");
        Employee emp1 = new Employee(101, "Alice");
        emp1.display();
        Employee emp2 = new Employee(102, "Bob");
        emp2.display();
        Employee.changeCompanyName("InnoSoft");
        System.out.println("After changing company name:");
        emp1.display();
        emp2.display();
    }
}