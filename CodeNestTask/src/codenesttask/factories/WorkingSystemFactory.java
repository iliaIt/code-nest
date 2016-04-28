/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codenesttask.factories;

import codenesttask.workingsystems.*;

/**
 *
 * @author iko
 * Just a factory for WorkingSystem
 */
public class WorkingSystemFactory {
    
    public WorkingSystem getWorkingSystem(String system){
        
        if(system == null){
           return null; 
        }
        
        if( system.equalsIgnoreCase("BIOLOGICAL") ){
            return new Biological();
        } else if( system.equalsIgnoreCase("MECHANICAL") ){
            return new Mechanical();
        }
        
        return null;
    }
    
}
