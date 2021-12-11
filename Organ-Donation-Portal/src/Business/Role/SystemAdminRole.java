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
import ui.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import Business.Enterprises.Enterprise;
import Business.Organisation.Organisation;
/**
 *
 * @author DELL
 */
public class SystemAdminRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise,Network network, EcoSystem system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
    
}
