package string.assignment_problems;

class CompanyEmployee {
    String empName;
    double salary;

    static String companyName =
            "Bright Horizon Technologies";

    static int employeeCount = 0;

    CompanyEmployee(String empName, double salary) {

        this.empName = empName;
        this.salary = salary;

        employeeCount++;
    }

    static void printCompanyInfo() {

        System.out.println(companyName);
        System.out.println(
                "Employees on record: " + employeeCount
        );
    }
}

public class EmployeeCompanyMain {
    public static void main(String[] args) {

        CompanyEmployee e1 =
                new CompanyEmployee("Ravi", 40000);

        CompanyEmployee e2 =
                new CompanyEmployee("Priya", 45000);

        CompanyEmployee e3 =
                new CompanyEmployee("Arun", 50000);

        CompanyEmployee.printCompanyInfo();
    }
}