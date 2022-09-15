package exercise1;

import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class Driver {
    public static void main(String[] args) {
        // Create a singer object with defualt constructor (no parameters)
        Singers singer1 = new Singers();

        // Display the default values in a Swing message window
        String message = "Name: " + singer1.getName() + "\nid: " + singer1.getId() + "\naddress: " + singer1.getAddress() +
         "\nDate of Birth: " + singer1.getDob() + "\nalbumsPublished: " + singer1.getAlbumsPublished();
        JOptionPane.showMessageDialog(null, "New Singer has beeen created: \n" + message);
        
        // Ask the user to enter the values for each parameter of the singer object
        JPanel panel = new JPanel(new GridLayout(5, 1));

        JTextField id  = new JTextField(10);
        JTextField name = new JTextField(10);
        JTextField address = new JTextField(10);
        JTextField dob = new JTextField(10);
        JTextField albumsPublished = new JTextField(10);

        Object[] values = {
            "Enter ID:", id,
            "Enter Name:", name,
            "Enter Address:", address,
            "Enter Date of Birth (DD-MM-YYYY):", dob,
            "Enter Number of Albums Published:", albumsPublished,
        };

        panel.add(id);
        panel.add(name);
        panel.add(address);
        panel.add(dob);
        panel.add(albumsPublished);

        int selection = JOptionPane.showConfirmDialog(null, values, "Enter the values for the new singer", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (selection == JOptionPane.OK_OPTION){
            // set all the values for the singer1 object
            singer1.setId(id.getText());
            singer1.setName(name.getText());
            singer1.setAddress(address.getText());
            singer1.setDob(dob.getText());
            int numberAlbums = Integer.parseInt(albumsPublished.getText());
            singer1.setAlbumsPublished(numberAlbums);
        } else {
            JOptionPane.showMessageDialog(null, "Singer has not been updated");
            System.exit(0);
        }

        // Display the new values of the Singer Object
        message = "Name: " + singer1.getName() + "\nid: " + singer1.getId() + "\naddress: " + singer1.getAddress() +
         "\nDate of Birth: " + singer1.getDob() + "\nalbumsPublished: " + singer1.getAlbumsPublished();
        JOptionPane.showMessageDialog(null, "New Singer has beeen updated: \n" + message);
        
    }
    
}
