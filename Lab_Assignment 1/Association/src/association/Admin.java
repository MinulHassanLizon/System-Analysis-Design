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
public class Admin extends User{
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Admin(String name, String userid, String password) {
        super(userid, password);
        this.name = name;
    }

    public Admin(String name) {
        this.name = name;
    }

    public String admin(){
        String adminProp = "User Name : "+ this.getName() + " ,User Id : " + this.getUserid() + " ,Password : " +this.getPassword();
        return adminProp;
    }
    

    public Admin() {
        super();
    }
    
    
}