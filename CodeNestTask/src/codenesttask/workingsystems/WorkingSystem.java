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
public abstract class WorkingSystem implements Unit{

    public static final String DEFAULT_NAME = "DEFAULT";
    private String name;

    public WorkingSystem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract void pritInfo();
    
    /**
     *
     * @param weight
     * @return  Returns true if the instance class is Biological and the argument is Light or instance class is Mechanical and the argument is Heavy
     *          otherwise returns false
     */
    @Override
    public boolean isAbleToLift(Weight weight ) {
        return ( weight != null && ( ( this instanceof Biological && weight instanceof Light ) || ( this instanceof Mechanical && weight instanceof Heavy ) ) );
    }
    
}
