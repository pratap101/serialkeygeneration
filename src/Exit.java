/**
 * Created by pratap on 8/2/16.
 */
import javax.swing.JOptionPane;
import javax.swing.JDialog;


public class Exit{

    Object option[]={"EXIT INSTALLATION","CONTINUE INSTALLATION "};
    Exit(){
        JDialog.setDefaultLookAndFeelDecorated(true);
        int response = JOptionPane.showOptionDialog(null, "ARE YOU SURE \n DO YOU WANT TO QUIT THE INSTALLATION WIZARD ?", "ALERT",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,null,option,option[1]);
        if (response == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }

    }
}
