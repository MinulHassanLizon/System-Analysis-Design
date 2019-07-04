/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generalizationtest;

/**
 *
 * @author SAFE ZONE
 */
public class GeneralizationTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Admin a = new Admin();
		a.name = "Minul";
		
		System.out.println(a);
		
		Customer c = new Customer("Hasan", "Dhaka");
		System.out.println(c);
	}
}