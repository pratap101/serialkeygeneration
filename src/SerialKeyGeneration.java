/**
 * Created by pratap on 8/2/16.
 */
import java.io.IOException;

import javax.swing.JFrame;


public class SerialKeyGeneration {


    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Home h = new Home(24);
        //  h.x=10;
        //Home h1 = new Home(25);
        h.setVisible(true);
        h.setSize(600,400);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // h.setLayout(null);
        h.setLocation(410, 170);
        h.setResizable(false);

    }

}