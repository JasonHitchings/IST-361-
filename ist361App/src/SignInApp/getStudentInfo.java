/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SignInApp;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 *
 * @author Jason
 */
public class getStudentInfo {

public String[] info(){ 
    String sInfo[] = new String[3];
    int a=0;
    try{
        BufferedReader br = new BufferedReader(new FileReader("info.txt"));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();
            sInfo[a] = line;
            a++;
        }
        String everything = sb.toString();
    }
    catch(Exception e){
        
    } 
    return sInfo;
}
}
