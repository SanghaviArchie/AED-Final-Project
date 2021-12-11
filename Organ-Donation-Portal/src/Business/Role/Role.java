/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

/**
 *
 * @author DELL
 */
public class Role {
    public enum RoleType{
        Admin("Admin Role"),
        Doctor("Doctor Role"),
        Donor("Donor Role"),
        HospitalStaff("HospitalStaff Role"),
        LabTechnicain("Lab Technician Role"),
        Pharmacist("Pharmacist Role"),
        Receiver("Receiver Role"),
        SystemAdmin("SystemAdmin Role"),
        Transportor("Transportor Role");
        
        private String type;
        
        private RoleType(String type){
            this.type = type;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return type;
        }
    }
}
