/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkFlow;

import java.util.ArrayList;

/**
 *
 * @author ruchachauthai
 */
public class WorkFlow {
    
     private ArrayList<WorkFlowRequest> WorkFlowRequestList;

    public WorkFlow() {
        WorkFlowRequestList = new ArrayList();
    }

    public ArrayList<WorkFlowRequest> getWorkFlowRequestList() {
        return WorkFlowRequestList;
    }
    
    public void deleteWorkRequest(WorkFlowRequest WorkFlowRequest){
        WorkFlowRequestList.remove(WorkFlowRequest);
    }
}
