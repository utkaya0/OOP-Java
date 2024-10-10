import java.util.Scanner;

public class Employee {
    String name;
    int  socialSecurityNumber;
    float wage;
    int workingHours;

    void displayInfo(){
        System.out.println("Name: "+ name + "\nSocial Security Number: "+ socialSecurityNumber);
    }
    void displaySalary(){
        float salary = wage * workingHours;
        System.out.println("Salary: " + salary );
    }
    public static void main(String[] args){
        Employee emp1 = new Employee();
        emp1.name = "Utku";
        emp1.socialSecurityNumber = 1234;
        emp1.wage = 20.5f;
        emp1.workingHours = 40;
        emp1.displayInfo();
        emp1.displaySalary();

        Scanner input = new Scanner(System.in);
        Employee emp2 = new Employee();
        System.out.println("Enter Employee Name : ");
        emp2.name = input.nextLine();
        System.out.println("Enter Employee Number : ");
        emp2.socialSecurityNumber = input.nextInt();
        System.out.println("Enter Employee Wage : ");
        emp2.wage = input.nextFloat();
        System.out.println("Enter Employee Working Hours : ");
        emp2.workingHours = input.nextInt();

        emp2.displayInfo();
        emp2.displaySalary();

    }
}
