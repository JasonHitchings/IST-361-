/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SignInApp;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Jason
 */
public class storeStudentInfo {
    String firstName;
    String lastName;
    String prefferedName;
    public void getStudentName(String first, String last, String preffered) throws IOException{
        this.firstName = first;
        this.lastName = last;
        this.prefferedName = preffered;
        writeToFile();
    }
   
    public void writeToFile() throws IOException {
        //String first = getFirst(firstName);
        //String last = getLast();
        //String preffered = getPreffered();
        //  FileWriter write = new FileWriter( path , append_to_file);
        File textfile = new File("info.txt");
        try {
            PrintWriter print_line = new PrintWriter(textfile);
            print_line.print(firstName);
            print_line.println();
            print_line.print(lastName);
            print_line.println();
            print_line.print(prefferedName);
            print_line.close();
        } catch (Exception e) {
            System.out.println("please don't leave any field blank");
            System.out.println("if you go by your first name just");
            System.out.println("re-enter first name in field");

        }
    }

}
