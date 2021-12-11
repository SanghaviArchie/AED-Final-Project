/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkFlow.WorkFlow;
import Business.WorkFlow.WorkFlowRequest;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ruchachauthai
 */
public class UserAccount {
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkFlow WorkFlow;
    
//    private List<Medicine> medicineHistory;
//    private List<Medicine> medicineList;
    
    

    public UserAccount() {
        WorkFlow = new WorkFlow();
//        medicineList = new ArrayList<Medicine>();
//        medicineHistory = new ArrayList<Medicine>();
    }
//
//    public List<Medicine> getMedicineHistory() {
//        return medicineHistory;
//    }
//
//    public void setMedicineHistory(List<Medicine> medicineHistory) {
//        this.medicineHistory = medicineHistory;
//    }
//
//    public List<Medicine> getMedicineList() {
//        return medicineList;
//    }
//
//    public void setMedicineList(List<Medicine> medicineList) {
//        this.medicineList = medicineList;
//    }
//    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }
    
//    public Volunteer getVolunteer() {
//        return (Volunteer) employee;
//    }

    public WorkFlow getWorkFlow() {
        return WorkFlow;
    }
    
   

    
    public boolean checkDuplicates(WorkFlowRequest r){
        for(WorkFlowRequest comp : WorkFlow.getWorkFlowRequestList()){
            if(comp == r){
                return true;
            }  
        }
        
        return false;
    }

    
    
    @Override
    public String toString() {
        return employee.getName();
    }
}
