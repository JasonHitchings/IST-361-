/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SignInApp;

import java.util.Objects;

/**
 *
 * @author Jason
 */

public class addClass {
    String class1;
    String class2;
    String class3;
    String engCode = "eng202s1";
    String mathCode = "math140s3";
    String istCode = "ist361s2";
    // gets the class numbers and adds a class.
    // since I don't have the ability to interface with a professor version of app
    // it will just compare them to a list of fake classes
    public void getClassNumbers(String c1, String c2, String c3){
        this.class1 = c1;
        this.class2 = c2;
        this.class3 = c3;
        compareClasses();
    }
    public void compareClasses(){
        if (Objects.equals(class1, engCode) || Objects.equals(class1,mathCode) || Objects.equals(class1,istCode)){
                  
        }
        if (Objects.equals(class2, engCode) || Objects.equals(class2,mathCode) || Objects.equals(class2,istCode)){
                  
        }
        if (Objects.equals(class3, engCode) || Objects.equals(class3,mathCode) || Objects.equals(class3,istCode)){
                  
        }    
    }
}
