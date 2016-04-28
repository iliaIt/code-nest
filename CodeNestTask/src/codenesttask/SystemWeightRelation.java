/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codenesttask;

import codenesttask.weights.*;
import codenesttask.workingsystems.*;

/**
 *
 * @author iko
 * It's just a test method for other logic of the relations between Systems and Weights
 */
public class SystemWeightRelation {
    
    public static boolean isCompatible( WorkingSystem system, Weight weight ) {
        return ( system !=null && weight != null && ( ( system instanceof Biological && weight instanceof Light ) || ( system instanceof Mechanical && weight instanceof Heavy ) ) );
    }
    
}
