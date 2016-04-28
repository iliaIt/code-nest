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
public class Light extends Weight{
    
    public static final String DEFAULT_LIGHT_PURPOSE = "SUSPICIOUS";
    private String lightPurpose;
    
    public Light() {
        super( DEFAULT_ID, DEFAULT_NAME );
        this.lightPurpose = DEFAULT_LIGHT_PURPOSE ;
    }
    
    public Light( String name, String lightPurpose, int id ) {
        super(id, name);
        this.lightPurpose = lightPurpose;
    }

    public String getLightPurpose() {
        return lightPurpose;
    }

    public void setLightPurpose(String lightPurpose) {
        this.lightPurpose = lightPurpose;
    }

    @Override
    public void printWeightInfo() {
        System.out.println( "Light weight purpose: " + this.lightPurpose + " ID:" + getWeightId() );
    }

    @Override
    public String toString() {
        //Override the toString to have nice string representation of the object
        StringBuilder builder = new StringBuilder();
        builder.append(" ID: ");
        builder.append(getWeightId());
        builder.append(" Name: ");
        builder.append(getName());
        builder.append(" Light weight: ");
        builder.append(this.lightPurpose);
        builder.append("\n");
        return builder.toString();
    }
   
}
