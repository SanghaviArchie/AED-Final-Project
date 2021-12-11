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

import Business.Organisation.Doctor;
import Business.Organisation.Organisation;

import ui.DoctorRole.DoctorWorkAreaJPanel;


/**
 *
 * @author DELL
 */
public class DoctorRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem business) {
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (Doctor) organisation, network, enterprise);

    }
    
     @Override
    public String toString() {
        return Role.RoleType.Doctor.getValue();
    }
}
