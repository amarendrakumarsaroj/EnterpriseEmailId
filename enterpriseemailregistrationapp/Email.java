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
public class Email {
    
    private String FirstName;
    private String LastName;
    private String PhoneNumber;
    private String DefaultCompanyName = "nrb.org.np";
    private String DepartmentName;
    private String EmailId;
    private String PassWord;
    private String EmployeeCode;
    int DefaultPasswordLength = 8;
    
    private String AlternateEmailId;
   
    
    
    public Email(String Fn, String Ln, String PhoneNumber){
    
        // set the firstname, lastname and phone number
        this.FirstName = Fn;
        this.LastName = Ln;
        this.PhoneNumber = PhoneNumber;
        
        //get the employee code and DepartmentName
        int TempInputObject;
        String TempVariableDepartment;
        System.out.println("\n Enter the Department Code \n"
                + "Enter 1 for NRB - INFORMATION TECHNOLOGY DEPARTMENT \n"
                + "Enter 2 for NRB - HUMAN RESOURCE DEPARTMENT. \n"
                + "Enter 3 for NRB - DEVELOPMENT BANK SUPERVISION DEPARTMENT.");
        Scanner InputObject = new Scanner(System.in);
        TempInputObject = InputObject.nextInt();
        TempVariableDepartment = GetTheDepartment(TempInputObject);
        this.DepartmentName = TempVariableDepartment;
        System.out.println("\n Enter the EmployeeCode : ");
        Scanner EmployeeCodeScanner = new Scanner(System.in);
        this.EmployeeCode = EmployeeCodeScanner.nextLine();

        //set the eployee email id and password
        this.EmailId = SetEmailId();
        this.PassWord = SetPassWord(this.DefaultPasswordLength);
        
        
                
    }
    
    
    private String GetTheDepartment(int DepartmentID){
        
        if(DepartmentID == 1 ){return "nrbitd"; }
        else if(DepartmentID == 2){return "nrbhrd";}
        else if(DepartmentID == 3){return "nrbdbsd";}
        else{return "Enter the ID as specified in the list above.";}
    }
    
    private String SetEmailId(){
        
        
        return (this.FirstName.toLowerCase()+"."+this.LastName.toLowerCase()+ "@" +this.DepartmentName+"."+this.DefaultCompanyName);
    }
    
    private String SetPassWord(int PassWordLength){
        String PassWordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ~!@#$%^&*()_+|=-0987654321";
        char [] TempPassWord = new char[PassWordLength];
        
        for(int i = 0;i<PassWordLength;i++){
            int rand = (int)(Math.random()*PassWordSet.length());
            TempPassWord [i] = PassWordSet.charAt(rand);
        }
        return new String (TempPassWord);
    }
    
   public void ChangeEmailId(){
   
       System.out.println("Do you Want to use another email id ? (y/n) ");
       Scanner TempAltEmail = new Scanner(System.in);
       if(TempAltEmail.nextLine().toLowerCase()=="y"){
           System.out.println("Enter your preferred email-id : ");
           this.AlternateEmailId = TempAltEmail.nextLine();
           ShowAllInfo();
       }
       
       
   } 
   
    // show the info all data
   public void ShowAllInfo(){
        System.out.println("\n THE FOLLOWING ARE THE DETAILS OF THE USER CREATED\n"
                + "Hello, Mr./Mrs."+this.FirstName+" "+this.LastName+"\n"
                + "Your Employee Code is : "+this.EmployeeCode+"\n"
                + "Your Contact Number is : "+this.PhoneNumber+"\n"
                + "Your E-mail id is : "+this.EmailId+"\n"
                + "Your Password is : "+this.PassWord+"\n"
                + "Your Department is : "+this.DepartmentName);
   }
}
