/**
 * Created by pratap on 8/2/16.
 */
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Home extends JFrame implements ActionListener {

    JButton b1,b2;
    /**
     *
     */
    final int x;
    private static final long serialVersionUID = 1L;
    public Home(int b) throws IOException{

        x=b;
        System.out.println(x);
        BufferedImage bf = ImageIO.read(new File("./images/main.jpg"));
        this.setContentPane(new BackImage(bf));
        setLayout(null);
        b1 = new JButton(" ");
        b2 = new JButton(" ");

        ImageIcon b1img=new ImageIcon("./images/b1.jpg");
        b1=new JButton(" " ,b1img);
        b1.setHorizontalTextPosition(SwingConstants.CENTER);

        ImageIcon b2img=new ImageIcon("./images/b2.jpg");
        b2=new JButton(" " ,b2img);
        b2.setHorizontalTextPosition(SwingConstants.CENTER);


        b1.setBounds(200, 130, 200, 40);
        b2.setBounds(200, 180, 200, 40);
        this.add(b1);
        this.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event){

        if(event.getSource()==b1){
            boolean b = new CheckInternetConnection().testInternetConnection();
            if(b==true){
                System.out.println("Check");
                boolean	check = new CheckOTK().checkOTK();
                if(check==true){
                    System.out.println("true");
                }
            }
        }

        if(event.getSource()==b2){
            System.exit(0);
            //new Exit();
        }



    }
    protected void processWindowEvent(WindowEvent e)
    {
        if (e.getID() == WindowEvent.WINDOW_CLOSING)
        {
            JDialog.setDefaultLookAndFeelDecorated(true);
            int exit = JOptionPane.showConfirmDialog(this, "ARE YOU SURE?\nDO YOU WANT TO QUIT INSTALLATION WIZARD");
            if (exit == JOptionPane.YES_OPTION)
            {
                System.exit(0);
            }

        }
        else
        {
            super.processWindowEvent(e);
        }
    }

    class BackImage extends JComponent
    {
        /**
         *
         */
        private static final long serialVersionUID = 1L;
        Image i;
        public BackImage(Image i)
        {
            this.i = i;

        }

        public void paintComponent(Graphics g)
        {
            g.drawImage(i, 0, 0, null);  // Drawing image using drawImage method
        }
    }
}