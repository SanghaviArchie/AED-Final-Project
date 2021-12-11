/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Organisation.Organisation.OrganisatioType;
import Business.Enterprises.HospitalEnterprise;
import Business.Enterprises.LaboratoryEnterprise;
import Business.Enterprises.NGOEnterprise;
import Business.Enterprises.TranspotationEnterprise;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class OrganisationDirectory {
    
    private ArrayList<Organisation> orgList; 

    public ArrayList<Organisation> getOrgList() {
        return orgList;
    }

//    public void setOrgList(ArrayList<Organisation> orgList) {
//        this.orgList = orgList;
//    }

    public Organisation createNewHospitalOrg(HospitalEnterprise.Type type){
        Organisation org = null;
        if (type.getType().equals(OrganisatioType.Doctor.getType())){
            org = new Doctor();
            orgList.add(org);
        }
        else if (type.getType().equals(OrganisatioType.Pharmacy.getType())){
            
            org = new Pharmacy();
//            System.out.println("pharmacy "+organization.getOrganizationID());
            orgList.add(org);
        }
        else if (type.getType().equals(OrganisatioType.ColdStorage.getType())){   
            org = new ColdStorage();
            orgList.add(org);
        }
        else if (type.getType().equals(OrganisatioType.Donors.getType())){   
            org = new Donors();
            orgList.add(org);
        }
        else if (type.getType().equals(OrganisatioType.HospitalStaff.getType())){   
            org = new HospitalStaff();
            orgList.add(org);
        }
        else if (type.getType().equals(OrganisatioType.Receivers.getType())){   
            org = new Receivers();
            orgList.add(org);
        }
        
        return org;
    }
    
    public Organisation createNewNGOOrg(NGOEnterprise.Type type){
        Organisation org = null;
        if (type.getType().equals(OrganisatioType.Volunteer.getType())){
            org = new Volunteer();
            orgList.add(org);
        }
        else if (type.getType().equals(OrganisatioType.Transportation.getType())){
            org = new Transportation();
            orgList.add(org);
        }
        else if (type.getType().equals(OrganisatioType.Admin.getType())){
            org = new Admin();
            orgList.add(org);
        }
        return org;
    }
    
    public Organisation createNewLabOrg(LaboratoryEnterprise.Type type){
        Organisation org = null;
        if(type.getType().equals(OrganisatioType.LabTechnician.getType())){
            org = new LabTechnician();
            orgList.add(org);
        }
        else if(type.getType().equals(OrganisatioType.Transportation.getType())){
            org = new Transportation();
            orgList.add(org);
        }
        else if(type.getType().equals(OrganisatioType.Admin.getType())){
            org = new Admin();
            orgList.add(org);
        }
        return org;
    }
    
    public Organisation createNewTransportationOrg(TranspotationEnterprise.Type type){
        Organisation org = null;
        if(type.getType().equals(OrganisatioType.Admin.getType())){
            org = new Admin();
            orgList.add(org);
        }
        else if(type.getType().equals(OrganisatioType.Transportation.getType())){
            org = new Transportation();
            orgList.add(org);
        }
        return org;
    }
}
