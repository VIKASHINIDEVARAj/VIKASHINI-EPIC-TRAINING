package OOPs;//package OOPs.Inheritance;
//
//abstract class Employee {
//
//    // Create variables
//    int employeeId;
//    String employeeName;
//    double basicSalary;
//
//    // Create constructor
//    Employee(int employeeId, String employeeName, double basicSalary)
//    {
//        __________________________________________
//                __________________________________________
//        __________________________________________
//    }
//
//    // Create method to display employee details
//    void displayEmployee()
//    {
//        System.out.println("Employee ID   : " + __________________);
//        System.out.println("Employee Name : " + __________________);
//        System.out.println("Basic Salary  : " + __________________);
//    }
//
//    // Create an abstract method for salary calculation
//    // Each employee type should calculate salary differently
//    abstract double ____________________________;
//}
//
//
//// Employee with fixed salary + bonus
//class PermanentEmployee extends Employee {
//
//    double bonus;
//
//    PermanentEmployee(int employeeId, String employeeName,
//                      double basicSalary, double bonus)
//    {
//
//        __________________________________________
//                __________________________________________
//    }
//
//    // Override the abstract method
//    @Override
//    double ____________________________() {
//
//        __________________________________________
//    }
//}
//
//
//// Employee whose salary depends on hours worked
//class ContractEmployee extends Employee {
//
//    int hoursWorked;
//    double hourlyRate;
//
//    ContractEmployee(int employeeId, String employeeName,
//                     double basicSalary, int hoursWorked,
//                     double hourlyRate) {
//
//        __________________________________________
//                __________________________________________
//        __________________________________________
//    }
//
//    // Override the abstract method
//    @Override
//    double ____________________________() {
//
//        __________________________________________
//    }
//}
//
//
//public class Abstraction2 {
//
//    public static void main(String[] args) {
//
//        // Create Permanent Employee
//        PermanentEmployee p =
//                new PermanentEmployee(101, "Arun", 30000, 5000);
//
//        // Create Contract Employee
//        ContractEmployee c =
//                new ContractEmployee(102, "Rahul", 0, 160, 250);
//
//
//        // Display employee details
//        p.____________________________;
//        System.out.println("Total Salary : " +
//                ______________________________);
//
//        System.out.println();
//
//        c.____________________________;
//        System.out.println("Total Salary : " +
//                ______________________________);
//    }
//}
//
