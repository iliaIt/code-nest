/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codenesttask.weights;

import codenesttask.workingsystems.*;

/**
 *
 * @author iko
 */
public abstract class Weight implements Load{
    
    public static final int DEFAULT_ID = 0;
    public static final String DEFAULT_NAME = "DEFAULT";
    
    private int weightId;
    private String name;

    public Weight( int id, String name) {
            //!!! Never, never, nEver, neVer,nevEr, neveR use the hashCode like unique ID, that is not it's purpuse !!!
            //This code is instead to generate random number
            this.weightId = (id != DEFAULT_ID) ? id : this.hashCode() ;
            this.name = name;
        
    }

    public int getWeightId() {
        return weightId;
    }

    public void setWeightId(int weightId) {
        this.weightId = weightId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract void printWeightInfo();
    
    /**
     *
     * @param system
     * @return Returns true if the instance class is Light and the argument is Biological or instance class is Heavy and the argument is Mechanical
     *          otherwise returns false
     */
    @Override
    public boolean isAbleToBeLiftedBy(WorkingSystem system){
//        if( system != null && ( ( this instanceof Light && system instanceof Biological ) || ( this instanceof Heavy && system instanceof Mechanical ) ) ){
//            return true;
//        }
//Just JAVA convention ...
        return ( system != null && ( ( this instanceof Light && system instanceof Biological ) || ( this instanceof Heavy && system instanceof Mechanical ) ) );
    
    }
   
}
