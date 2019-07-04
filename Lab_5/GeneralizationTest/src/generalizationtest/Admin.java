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
public class Admin extends User {
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String ID) {
		this.name = ID;
	}
	
	@Override
	public String toString() {
		return "Admin [User ID = " + name + "]";
	}
}