/**
 * Created by pratap on 8/2/16.
 */
//import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
//import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class CheckInternetConnection {

    private Boolean flag;
    public boolean testInternetConnection(){


        try {
            try {
                URL url = new URL("http://www.google.com");
                System.out.println(url.getHost());
                HttpURLConnection con = (HttpURLConnection) url
                        .openConnection();
                con.connect();
                if (con.getResponseCode() == 200){
                    //JOptionPane.showConfirmDialog(null, "MEssage", "alert", JOptionPane.YES_OPTION);
                    // JOptionPane.showMessageDialog(null, "YOU HAVE A INTERNET CONNECTION!!\n"
                    //+ "YOU CAN PROCEED FOR INSTALLATION PROCESS");
                    System.out.println("Connection established!!");
                    flag=true;
                }
            } catch (Exception exception) {
                //System.out.println("No Connection");
                JOptionPane.showMessageDialog(null, "MAKE SURE!!\n YOUR PC IS CONNECTED TO INTERNET\n"
                        + "OTHERWISE!!!! EXIT FROM INSTALLATION WIZARD ", "ERROR", JOptionPane.ERROR_MESSAGE);
                flag=false;
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return flag;
    }
}
