/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import Business.Organisation.Organisation;
import Business.Network.Network;
import Business.Role.Role;
import Business.Role.SystemAdminRole;

/**
 *
 * @author DELL
 */
public class EcoSystem extends Organisation{
    private static EcoSystem ecoSystem;
    private ArrayList<Network> networkList;
    public static EcoSystem getInstance(){
        if(ecoSystem==null){
            ecoSystem=new EcoSystem();
        }
        return ecoSystem;
    }
    public Network NewNetwork(){
        Network networks=new Network();
        networkList.add(networks);
        return networks;
    }
    
    @Override
    public ArrayList<Role> getRoleList() {
        ArrayList<Role> roleList=new ArrayList<Role>();
//        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
    }
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkforUniqueUser(String userName){
//        if(!this.getUserAccountDirectory().checkforUniqueUser(userName)){
//            return false;
//        }
//        for(Network network:networkList){
//            
//        }
        return true;
    }
}
