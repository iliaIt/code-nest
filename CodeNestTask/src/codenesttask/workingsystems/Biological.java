/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codenesttask.workingsystems;

/**
 *
 * @author iko
 */
public class Biological extends WorkingSystem{
    
    private final String DEFAULT_BLOOD_GROUP = "+A";
    private String bloodGroup;

    public Biological() {
        super(DEFAULT_NAME);
        this.bloodGroup = DEFAULT_BLOOD_GROUP;
    }
    
    public Biological(String bloodGroup, String name) {
        super(name);
        this.bloodGroup = bloodGroup;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Override
    public void pritInfo() {
        System.out.println( "Biological system blood: " + this.bloodGroup + " Name:" + getName() );
    }
    
    @Override
    public String toString() {
        //Override the toString to have nice string representation of the object
        StringBuilder builder = new StringBuilder();
        builder.append(" Name: ");
        builder.append(getName());
        builder.append(" System blood: ");
        builder.append(this.bloodGroup);
        builder.append("\n");
        return builder.toString();
    }
}
