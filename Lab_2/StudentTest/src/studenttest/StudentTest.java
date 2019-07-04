/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenttest;

/**
 *
 * @author SAFE ZONE
 */
public class StudentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student student1 = new Student(12, "Minul", 3.75);
	Student student2 = new Student();
		
		student2.setId(13);
		student2.setName("Shobuj");
		student2.setCgpa(3.5);
		
		System.out.println("Id	| Name             | CGPA");
		System.out.println("------------------------------------------------------");
		System.out.println(student1.getId() + "	| " + student1.getName() + "            | " + student1.getCgpa());
		System.out.println(student2.getId() + "	| " + student2.getName() + "            | " + student2.getCgpa());
	}

}