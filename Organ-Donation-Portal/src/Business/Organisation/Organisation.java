/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public abstract class Organisation {
    private String name;
    private int orgId;
    private static int cnt=0;
    
    public enum OrganisatioType{
        Admin("Admin Organization"), ColdStorage("ColdStorage Organization"),
        Doctor("Doctor Organization"), Donors("Donors Organization"),
        HospitalStaff("HospitalStaff Organization"),LabTechnician("LabTechnician Organization"),
        Pharmacy("Pharmacy Organization"), Receivers("Receivers Organization"),
        Transportation("Transportation Organization"), Volunteer("Volunteer Organization");
    
        private String type;
        private OrganisatioType(String type) {
            this.type = type;
        }
        public String getType() {
            return type;
        }
    }
    
    public Organisation(String name) {
        this.name = name; 
//        workQueue = new WorkQueue();
//        employeeDirectory = new EmployeeDirectory();
//        userAccountDirectory = new UserAccountDirectory();
        orgId = cnt;
        ++cnt;
    }
    
    public abstract ArrayList<Role> getRoleList();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }  
    
    @Override
    public String toString() {
        return name;
    }
}
