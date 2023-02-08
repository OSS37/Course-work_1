public class Main {
    static Employee[] employeeBook = new Employee[10];
    public static void main(String[] args) {
        employeeBook[0] = new Employee("Иванова Любовь Владимировна", 1, 35_000);
        employeeBook[1] = new Employee("Петров Александр Федерович", 2, 43_000);
        employeeBook[2] = new Employee("Смирнов Павел Сергеевич", 3, 50_000);
        employeeBook[3] = new Employee("Потапова Мария Алексеевна", 4, 60_000);
        employeeBook[4] = new Employee("Зайцев Артем Павлович", 5, 80_000);
        employeeBook[5] = new Employee("Сидорова Алена Максимовна", 1, 38_000);
        employeeBook[6] = new Employee("Миронова Галина Олеговна", 2, 45_000);
        employeeBook[7] = new Employee("Лапшин Максим Иванович", 3, 60_000);
        employeeBook[8] = new Employee("Волкова Дарья Петровна", 4, 65_000);
        employeeBook[9] = new Employee("Ивакин Сергей Андреевич", 5, 90_000);

        // Вывод в консоль списка сотрудников
        ListAllEmployees(employeeBook);
    }

        //Метод для вывода списка сотрудников
    public static void ListAllEmployees(Employee[] employeeBook) {
        for (Employee employee : employeeBook) {
            System.out.println(employee.toString());
        }
    }
}


