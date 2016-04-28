/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codenesttask.workingsystems;

import codenesttask.weights.*;

/**
 *
 * @author iko
 */
public interface Unit {
//This implementation is for a test, the method can be abstract      
    default boolean isAbleToLift( Weight weight ){
        System.out.println("this is the default implementation... It's returning false every time ...");
        return false;
    }
    
}
