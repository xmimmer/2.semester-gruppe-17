/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Presentation.LoginController;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author PCUser
 */
public class UsernameAndPassword {
    
        private static Scanner x;
        
        public static void main(String[] args) {

            
            String userAndPassFileName = "userAndPass.txt";

        File file = new File(userAndPassFileName);
        PrintWriter pw = null;
        String[] userAndPass = {"Bob69,","123\n","drake,", "45454545\n", "Bob69,", "124\n", "Allen2112,","EDFG\n"};

        try {
            FileWriter fw = new FileWriter(userAndPassFileName, false);
            pw = new PrintWriter(fw);

            for (int i = 0; i < userAndPass.length; i++) {
                fw.append(userAndPass[i]);

            }
            System.out.println("File created succesfully.");
            fw.close();

        } catch (IOException ex) {
            System.out.println("Input/Output exception caught.");
        }
            
            
            LoginController findLoginInfo = new LoginController ();
            
            String username = findLoginInfo.getUsername();
            String password = findLoginInfo.getPassword();
            String filepath = "userAndPass.txt";
            
            verifiedLogin(username,password,filepath);
            
        }  
            
              
        
        public static void verifiedLogin (String username, String password, String filepath){
            
             found = false;
            String tempUsername = "";
            String tempPassword = "";
            
           
            
            try{
                x = new Scanner (new File (filepath));
                x.useDelimiter("[,\n]");
                
                while(x.hasNext() && !found){
                    tempUsername = x.next();
                    tempPassword = x.next();
                    
                    if ( tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim())){
                        found = true;
                    }
                    
                }
                x.close();
                System.out.println(found);
                
            }
            catch(Exception e){
                System.out.println("Error");
            }
               
            }
         public static boolean found;
}
   
        

