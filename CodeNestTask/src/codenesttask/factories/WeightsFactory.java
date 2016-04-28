/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codenesttask.factories;

import codenesttask.weights.*;

/**
 *
 * @author iko
 * Just a factory for Weights
 */
public class WeightsFactory {
    
    public Weight getWeight( String weight ){
        
        if( weight == null ){
            return null;
        }
        
        if( weight.equalsIgnoreCase("LIGHT") ){
            return new Light();
        }else if( weight.equalsIgnoreCase("HEAVY") ){
            return new Heavy();
        }
        
        return null;
    }
}
