import javax.swing.*;
import java.awt.event.*;
import java.net.*;
public class IP extends JFrame implements ActionListener{

JFrame jf = new JFrame("IP Locator");
	JTextField jtf = new JTextField();

IP()
{

	
	//add(jf);
	jf.setSize(400,400);
	jf.setLayout(null);    
        jf.setVisible(true);  
//Creation of a simple panel with frame name as IP Locator

	JLabel jl = new JLabel("Enter the URL");
	jl.setBounds(100,100,80,100);
	jf.add(jl);
//Write Enter the URL 
	jf.add(jtf);
 	jtf.setBounds(200,130, 150,30); 
//Setting the Text Field to Enter the URL
	JButton b = new JButton("Find IP");
	jf.add(b);
	b.setBounds(200,180,80,40);
//Setting up the find IP Button
	b.addActionListener(this);
//Describes the action when the button is clicked
}

public void actionPerformed(ActionEvent e)
{
	String url=jtf.getText();
//Gets text from JTextField and stores it in url
try {  
	System.out.println("Protocol: "+url.getProtocol());  
        InetAddress ia=InetAddress.getByName(url);  
//It will get inet address and store it in an object ia
        String ip=ia.getHostAddress();  
//In the string ip it will store Host ip address in string format
        JOptionPane.showMessageDialog(this,ip);  
    } catch (UnknownHostException e1) {  
        JOptionPane.showMessageDialog(this,e1.toString());  
	} 

}
public static void main(String args[])
{
	new IP();
}
}