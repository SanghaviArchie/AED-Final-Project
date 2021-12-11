/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Enterprises.Enterprise;
import Business.Organisation.Organisation;
import Business.Organisation.Doctor;
import javax.swing.JPanel;
import ui.DoctorRole.DoctorPanel;


/**
 *
 * @author DELL
 */
public class DoctorRole extends Role{
//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem business) {
//        return new DoctorPanel(userProcessContainer, account, (Doctor)organisation, network, enterprise);
//
//    }
    
     @Override
    public String toString() {
        return RoleType.Doctor.getType();
    }
}
