/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkFlow.WorkFlow;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public abstract class Organisation {
    private String name;
    private WorkFlow WorkFlow;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        Admin("Admin Organization"), Doctor("Doctor Organization"), Lab("Lab Organization"),
        Health("Health Organization"), Volunteer("Volunteer Organization"), Education("Education Organization"),
        Inventory("Inventory Organization"), Pharmacy("Pharmacy Organization"), Transport("Transport Organization"), Analytics("Analytics Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
     public Organisation(String name) {
        this.name = name; 
        WorkFlow = new WorkFlow();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
     
     public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkFlow getWorkFlow() {
        return WorkFlow;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkFlow(WorkFlow WorkFlow) {
        this.WorkFlow = WorkFlow;
    }

    @Override
    public String toString() {
        return name;
    }
}

 
