/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Business.Enterprises.Enterprise;
import Business.Organisation.Organisation;

/**
 *
 * @author DELL
 */
public abstract class Role {
    public enum RoleType{
        Admin("Admin Role"),
        Doctor("Doctor Role"),
        Volunteer("Volunteer Role"),
        Health("Health Role"),
        Education("Education Role"),
        Inventory("Inventory Role"),
        Pharmacy("Pharmacy Role"),
        Analyst("Analyst Role"),
        Transport("Transport Role");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
     public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organisation organisation, 
            Enterprise enterprise,
            Network network,
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
