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
public class HospitalEnterprise extends Enterprise{
    public enum Type{
        Admin("Admin Organisation"),Doctor("Doctor Organization"), Pharmacy("Pharmacy Organization"),
       ColdStorage("ColdStorage Organisation"), Donors("Donors Organisation"), HospitalStaff("Hospital Staff Organisation"),
        Receivers("Receivers Organisation");
        private String type;

        public String getType() {
            return type;
        }
        private Type(String type) {
            this.type = type;
        }

    }
    
    public HospitalEnterprise(String name){
        super(name,EntType.Hospital);
    }
    
    @Override
    public ArrayList<Role> getRoleList() {
        return null;
    }    
}
