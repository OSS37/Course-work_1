public class Employee {
    private String FIO;
    private int departament;
    private double salary;
    private static int total;
    private int id;

    public Employee (String FIO, int departament, double salary) {
        this.FIO = FIO;
        this.departament = departament;
        this.salary = salary;
        id = ++ total;
    }

    public String getFIO() {
        return this.FIO;
    }
    public int getDepartament() {
        return this.departament;
    }
    public double getSalary() {
        return this.salary;
    }
    public double getId() {
        return this.id;
    }
    public void setDepartament(int departament) {
                this.departament = departament;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО работника: " + getFIO() + ", отдел: " + getDepartament() +", з/п: " + getSalary() + ", id:  " + getId();
    }
}
