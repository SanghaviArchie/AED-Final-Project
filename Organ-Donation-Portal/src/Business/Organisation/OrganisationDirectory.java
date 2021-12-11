/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Enterprises.HospitalEnterprise;
import Business.Organisation.Organisation.Type;
import java.util.ArrayList;

import Business.Enterprises.NGOEnterprise;
import Business.Enterprises.LaboratoryEnterprise;
import Business.Enterprises.TranspotationEnterprise;



/**
 *
 * @author DELL
 */
public class OrganisationDirectory {
    private ArrayList<Organisation> organizationList;

    public OrganisationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organisation> getOrganizationList() {
        return organizationList;
    }
    
    public Organisation createHospitalOrganization(HospitalEnterprise.Type type){
        Organisation organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new Doctor();
            organizationList.add(organization);
        }
//        else if (type.getValue().equals(Type.Pharmacy.getValue())){
//            
//            organization = new PharmacyOrganization();
//            System.out.println("pharmacy "+organization.getOrganizationID());
//            organizationList.add(organization);
//        }
        return organization;
    }
   
//    public Organisation createNGOOrganization(NGOEnterprise.Type type){
//       Organisation organization = null;
//        if (type.getValue().equals(Type.Health.getValue())){
//           organization = new HealthOrganization();
//           organizationList.add(organization);
//       }
//        else if (type.getValue().equals(Type.Education.getValue())){
//            organization = new EducationOrganization();
//           organizationList.add(organization);
//       }
//        else if (type.getValue().equals(Type.Volunteer.getValue())){
//            organization = new VolunteerOrganization();
//            organizationList.add(organization);
//        }
//        else if (type.getValue().equals(Type.Inventory.getValue())){
//           organization = new InventoryOrganization();
//           organizationList.add(organization);
//       }
//        return organization;
//   }
    
//    public Organization createGovernmentOrganization(GovernmentEnterprise.Type type){
//        Organization organization = null;
//        if(type.getValue().equals(Type.Analytics.getValue())){
//            organization = new AnalyticsOrganization();
//            organizationList.add(organization);
//        }
//        return organization;
//    }
//    
//    public Organization createLogisticOrganization(LogisticEnterprise.Type type){
//        Organization organization = null;
//        if(type.getValue().equals(Type.Transport.getValue())){
//            organization = new TransportOrganization();
//            organizationList.add(organization);
//        }
//        return organization;
//    }
   
}
