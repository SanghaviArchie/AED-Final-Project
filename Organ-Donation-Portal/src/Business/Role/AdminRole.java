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

/**
 *
 * @author DELL
 */
public class AdminRole {
//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
//        return new AdminWorkAreaJPanel(userProcessContainer,network, enterprise);
//  
//    }
    
    @Override
    public String toString() {
        return Role.RoleType.Admin.getValue();
    }
}
