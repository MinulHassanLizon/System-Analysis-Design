/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeetest;

/**
 *
 * @author SAFE ZONE
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Employee employee1 = new Employee(1, "Lizon", 60000) ;
		
	Employee employee2 = new Employee();
        employee2.setId(2);
	employee2.setName("Shobuj");
	employee2.setSalary(30000.00);
		
	System.out.println("Id	| Name			| $alary");
	System.out.println("-----------------------------------------");
	System.out.println(employee1.getId() + "  | " + employee1.getName() + "               	| " + employee1.getSalary());
	System.out.println(employee2.getId() + "  | " + employee2.getName() + "			| " + employee2.getSalary());
	}

}