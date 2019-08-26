/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package enterpriseemailregistrationapp;

import java.util.Scanner;

/**
 *
 * @author akx
 */
public class EnterpriseEmailRegistrationApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a new user giving firstname, lastname and phone number in the instantiation
        String Fn,Ln,Pn;
        Scanner MainScannerObject = new Scanner(System.in);
        System.out.println("Please Type In your First Name : ");Fn = MainScannerObject.nextLine();
        System.out.println("Please Type In your Last Name : ");Ln = MainScannerObject.nextLine();
        System.out.println("Please Type In your Phone Number : ");Pn = MainScannerObject.nextLine();
        Email KiranEmailObject = new Email(Fn,Ln,Pn);
        KiranEmailObject.ShowAllInfo();
        KiranEmailObject.ChangeEmailId();
        
    }
    
}
