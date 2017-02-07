package SignInApp;

import java.io.IOException;

/**
 *
 * @author Jason
 */
public class main {
     public static void main(String args[]) throws IOException {
         String file_name = "User Info";
         CreateAccountPanel panel = new CreateAccountPanel();
         panel.setVisible(true);
         //CreateAccountPanel data = new CreateAccountPanel( file_name);
         //data.writeToFile();
     }
}
