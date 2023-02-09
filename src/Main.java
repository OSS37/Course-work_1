public class Main {
    static Employee[] employeeBook = new Employee[10];
    public static void main(String[] args) {
        employeeBook[0] = new Employee("Иванова Любовь Владимировна", 1, 35_000);
        employeeBook[1] = new Employee("Петров Александр Федерович", 2, 43_000);
        employeeBook[2] = new Employee("Смирнов Павел Сергеевич", 3, 50_000);
        employeeBook[3] = new Employee("Потапова Мария Алексеевна", 4, 60_000);
        employeeBook[4] = new Employee("Зайцев Артем Павлович", 5, 80_000);
        employeeBook[5] = new Employee("Сидорова Алена Максимовна", 1, 120_000);
        employeeBook[6] = new Employee("Миронова Галина Олеговна", 2, 45_000);
        employeeBook[7] = new Employee("Лапшин Максим Иванович", 3, 80_000);
        employeeBook[8] = new Employee("Волкова Дарья Петровна", 4, 65_000);
        employeeBook[9] = new Employee("Ивакин Сергей Андреевич", 5, 90_000);

        // Вывод в консоль списка сотрудников
        ListAllEmployees(employeeBook);

        System.out.println();

        System.out.println("Cумма всех затрат на зарплату: " + sumSalary(employeeBook));
        System.out.println("Минимальная зарплата: " + (employeeBook[minSalary(employeeBook)]));
        System.out.println("Максимальная зарплата: " + (employeeBook[maxSalary(employeeBook)]));


    }

        //Метод для вывода списка сотрудников
    public static void ListAllEmployees(Employee[] employeeBook) {
        for (Employee employee : employeeBook) {
            System.out.println(employee.toString());
        }
    }
    //Метод для подсчета зарплаты всех сотрудников
    public static double sumSalary(Employee[] employeeBook) {
        double sum = 0;
        for (Employee employee : employeeBook) {
            sum += employee.getSalary();
        }
        return sum;
    }

    //Метод для поиска сотрудника с минимальной зарплатой
    public static int minSalary(Employee[] employeeBook){
        double min = employeeBook[0].getSalary();
        int num = 0;
        for (int i = 0; i < employeeBook.length; i++){
            if (employeeBook[i] != null && employeeBook[i].getSalary() <= min) {
                min = employeeBook[i].getSalary();
                num=i;
            }
            }
        return (num);
        }

    //Метод для поиска сотрудника с максимальной зарплатой
    public static int maxSalary(Employee[] employeeBook){
        double max = employeeBook[0].getSalary();
        int num2 = 0;
        for (int i2 = 0; i2 < employeeBook.length; i2++){
            if (employeeBook[i2] != null && employeeBook[i2].getSalary() >= max) {
                max = employeeBook[i2].getSalary();
                num2=i2;
            }
        }
        return (num2);
    }

    }






