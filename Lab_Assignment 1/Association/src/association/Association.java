/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package association;

/**
 *
 * @author SAFE ZONE
 */
public class Association {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Customer cust1 = new Customer("Minul", "171442506", "12308");
           Address addr1 = new Address(10, 8, "Purbachal Road", "10/2", "Badda", "Dhaka");
           
           System.out.println(cust1.customer() + " " + addr1.address());
           
           
           Admin admin1 = new Admin("Administrator", "admin", "Admin@123");
           Address addr2 = new Address(4, 2, "Purbachal Road", "12/2", "Dhaka", "Dhaka");
           
           
           System.out.println(admin1.admin() + " " + addr2.address());
           
           
        }
    
    
}