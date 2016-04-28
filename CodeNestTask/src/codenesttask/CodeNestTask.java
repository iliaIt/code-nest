/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codenesttask;

import codenesttask.factories.*;
import codenesttask.workingsystems.*;
import codenesttask.weights.*;
import java.util.Scanner;

/**
 *
 * @author iko
 */
public class CodeNestTask {

    public static final String STOP = "stop";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Some info for the user
        System.out.println("For system write the key word: BIOLOGICAL or MECHANICAL!");
        System.out.println("For weight write the key word: LIGHT or HEAVY!");
        System.out.println("For leaving write the key word: STOP ( not matter that it is for system or weight )");

        String systemStr = "";
        String weightStr = "";
        
        while( !systemStr.equalsIgnoreCase(STOP) ){
            //Open input stream from the console
            Scanner input = new Scanner(System.in);
            
            System.out.print("Please choose System: ");
            systemStr = input.nextLine();
            
             if( systemStr.equalsIgnoreCase(STOP) ){
                break;
            }
            System.out.print("Please choose Weight: ");
            weightStr = input.nextLine();
            
            if( weightStr.equalsIgnoreCase(STOP) ){
                break;
            }
            //Use the factory to get our system object
            WorkingSystemFactory systemFactory = new WorkingSystemFactory();
            WorkingSystem system = systemFactory.getWorkingSystem(systemStr);
            //Use the factory to get our weight object
            WeightsFactory weightFactory = new WeightsFactory();
            Weight weight = weightFactory.getWeight(weightStr);
            
            if( system != null && weight != null ){
                //Get the relation result
                System.out.printf( "The System can lift : %s \n ", system.isAbleToLift(weight) );
                System.out.printf( "The Weight can be lifted : %s \n ", weight.isAbleToBeLiftedBy(system) );
                //Print some info
                System.out.printf( system.toString() );
                System.out.printf( weight.toString() );
                System.out.printf( "The operation \' lift \' is available : %s \n ", SystemWeightRelation.isCompatible(system, weight) );
            } else {
                System.out.println( "You have entered wrong key words! \n" );
            }
        }
        
    }
    
}
