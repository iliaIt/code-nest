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
public class Mechanical extends WorkingSystem{
    
    private final String DEFAULT_METAL_IDENTIFIER_NUMBER = "S0000";
    private String metalIdentifierNumber;

    public Mechanical() {
        super(DEFAULT_NAME);
        this.metalIdentifierNumber = DEFAULT_METAL_IDENTIFIER_NUMBER;
    }
    
    public Mechanical(String name, String number) {
        super(name);
        this.metalIdentifierNumber = number;
    }

    public String getMetalIdentifierNumber() {
        return metalIdentifierNumber;
    }

    public void setMetalIdentifierNumber(String metalIdentifierNumber) {
        this.metalIdentifierNumber = metalIdentifierNumber;
    }

    @Override
    public void pritInfo() {
         System.out.println( "Mechanical system metal Id: " + this.metalIdentifierNumber + " Name:" + getName() );
    }
    
    @Override
    public String toString() {
        //Override the toString to have nice string representation of the object
        StringBuilder builder = new StringBuilder();
        builder.append(" Name: ");
        builder.append(getName());
        builder.append(" System metal Id: ");
        builder.append(this.metalIdentifierNumber);
        builder.append("\n");
        return builder.toString();
    }
}
