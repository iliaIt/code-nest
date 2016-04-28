/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codenesttask.weights;

/**
 *
 * @author iko
 */
public class Heavy extends Weight{
    
    public static final String DEFAULT_PURPOSE = "DEFAULT";
    
    private String heavyPurpose;
    
    public Heavy() {
        super( DEFAULT_ID, DEFAULT_NAME );
        this.heavyPurpose = DEFAULT_PURPOSE ;
    }
    
    public Heavy( String name, String heavyPurpose, int id ) {
        super(id, name);
        this.heavyPurpose = heavyPurpose;
    }

    public String getHeavyPurpose() {
        return heavyPurpose;
    }

    public void setHeavyPurpose(String heavyPurpose) {
        this.heavyPurpose = heavyPurpose;
    }
    
    @Override
    public void printWeightInfo() {
        System.out.println( "Heavy weight purpose: " + this.heavyPurpose + " ID:" + getWeightId() );
    }

    @Override
    public String toString() {
        //Override the toString to have nice string representation of the object
        StringBuilder builder = new StringBuilder();
        builder.append(" ID: ");
        builder.append(getWeightId());
        builder.append(" Name: ");
        builder.append(getName());
        builder.append(" Heavy weight purpose: ");
        builder.append(this.heavyPurpose);
        builder.append("\n");
        return builder.toString();
    }
    
}
