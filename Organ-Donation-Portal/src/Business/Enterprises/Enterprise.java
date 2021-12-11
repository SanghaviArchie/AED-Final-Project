/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprises;

import Business.Organisation.Organisation;
import Business.Organisation.OrganisationDirectory;

/**
 *
 * @author DELL
 */
public abstract class Enterprise extends Organisation{
    private EntType entType;
    private OrganisationDirectory organisationDirectory;
    
    public OrganisationDirectory getOrganizationDirectory() {
        return organisationDirectory;
    }
    

    public enum EntType{
        Hospital("Hospital"), 
        NGO("NGO"),
        Transportation("Transportation"),
        Laboratory("Laboratory");
        
        private String val;
        
        private EntType(String val){
            this.val=val;
        }
        public String getVal() {
            return val;
        }
        @Override
        public String toString(){
            return val;
        }
    }
    
    public EntType getEntType() {
        return entType;
    }
    public void setEntType(EntType entType) {
        this.entType = entType;
    }
    
    public Enterprise(String name,EntType type){
        super(name);
        this.entType=type;
        organisationDirectory=new OrganisationDirectory();
    }    
}
