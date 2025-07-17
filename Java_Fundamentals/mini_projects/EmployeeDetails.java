import java.util.*;
public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Employee ID: ");
        int inputEmpId = sc.nextInt();
        sc.close();

        int[] empId = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan ", "Suman", "Tanmay"};
        String[] joiningDate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000", "12/06/2006"};
        char[] designationCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
        String[] dept = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        int[] basicSalaries = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hraValues = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] incomeTaxes = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

        boolean isEmployeeFound = false;

        for (int i = 0; i < empId.length; i++) 
        {
            if (empId[i] == inputEmpId) 
            {
                isEmployeeFound = true;

                String designation = "";
                int da = 0;

                switch (designationCode[i]) 
                {
                    case 'e':
                        designation = "Engineer";
                        da = 20000;
                        break;
                    case 'c':
                        designation = "Consultant";
                        da = 32000;
                        break;
                    case 'k':
                        designation = "Clerk";
                        da = 12000;
                        break;
                    case 'r':
                        designation = "Receptionist";
                        da = 15000;
                        break;
                    case 'm':
                        designation = "Manager";
                        da = 40000;
                        break;
                    default:
                        designation = "Invalid Code";
                        da = 0;
                }

                int totalSalary = basicSalaries[i] + hraValues[i] + da - incomeTaxes[i];

                System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
                System.out.println(empId[i] + "\t" + empName[i] + "\t\t" + dept[i] + "\t\t" + designation + "\t\t" + totalSalary);
                break;
            }
        }

        if (!isEmployeeFound) {
            System.out.println("There is no employee with Employee ID: " + inputEmpId);
        }
    }
}
