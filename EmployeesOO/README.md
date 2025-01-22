# CHALLENGE: Employees OO

You must create a program to read the data of a department, including its address and its employees. Then, you must display a payroll report on the screen, as shown in the examples below.

To solve this problem, you must implement the entities according to the design below. The `payroll()` method of the `Department` class is responsible for returning the total payroll amount for the department.

<p><a href="https://ibb.co/yN99t4x"><img src="https://i.ibb.co/WHhhZVR/image-2024-03-16-T23-01-18-258-Z.png" alt="image-2024-03-16-T23-01-18-258-Z" border="0" align="center"></a></p>

EXAMPLE:  
Department name: Sales  
Payment day: 10  
Email: sales@lojatop.com  
Phone: 99883355  
How many employees are in the department? 2  
Employee 1 data:  
Name: John Smith  
Salary: 8000.00  
Employee 2 data:  
Name: Mary Torres  
Salary: 10000.00  

PAYROLL REPORT:  
Department Sales = $18000.00  
Payment scheduled on day 10  
Employees:  
John Smith  
Mary Torres  
For inquiries, please contact: sales@lojatop.com  

IMPORTANT:  
Your main program must maintain a variable for an object of type `Department`. Create a static method `showReport` to receive this `Department` object as an argument and use it to display the entire report on the screen.

```java
package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Department;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Department dept = new ...
        ...
        showReport(dept);
        sc.close();
    }

    private static void showReport(Department dept) {
        // DISPLAY THE REPORT DATA ON THE SCREEN
    }
}
```

IMPORTANT:  
For the example given above, this is the object structure you must create in memory:

<p><a href="https://ibb.co/qkmn8kh"><img src="https://i.ibb.co/nzQ0yz4/image-2024-03-16-T23-16-37-218-Z.png" alt="image-2024-03-16-T23-16-37-218-Z" border="0" align="center"></a></p>