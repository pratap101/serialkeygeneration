/**
 * Created by pratap on 8/2/16.
 */
import javax.swing.JOptionPane;


public class CheckOTK {
    boolean count;
    private String str = "XY12Q-PAT4A-GHD89";
    //final int x=0;
    public boolean checkOTK(){
        //x=10;
        String obj = JOptionPane.showInputDialog(null, "Please Enter OTK(XXXXX-XXXXX-XXXXX)");
        //if(Integer.parseInt(obj)==JOptionPane.OK_CANCEL_OPTION){
        if(obj.isEmpty()){
            JOptionPane.showMessageDialog(null, "Fields are empty", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else{
            if(obj.equals(str)){
                System.out.println("OK");
                count=true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid OTK", "ERROR", JOptionPane.ERROR_MESSAGE);
                count=false;
            }
        }

        return count;
    }
}
