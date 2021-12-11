/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprises;

import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public class NGOEnterprise extends Enterprise{
    public enum Type{
        Admin("Admin Organization"), Volunteer("Volunteer Organization"), Transportation("Transportation Organization");
        private String type;

        public String getType() {
            return type;
        }
        private Type(String type) {
            this.type = type;
        }

    }
    
    public NGOEnterprise(String name){
        super(name,EntType.NGO);
    }
    
    @Override
    public ArrayList<Role> getRoleList() {
        return null;
    }
}
