package digitalLeague;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginGUI extends JPanel implements ActionListener
{
    JButton confirm;
    GUISession session;
    JTextField username;
    JPasswordField password;

    public LoginGUI()
    {
	super();
	session = GUISession.myGUISession();
	username = new JTextField();
	password = new JPasswordField();
	confirm = new JButton();
	confirm.addActionListener(this);
	setLayout(new GridLayout(3,1));
	add(username); //username field
	add(password); //password field
	add(confirm); //confirm button
    }

    public void actionPerformed(ActionEvent e)
    {
	if (e.getSource() == confirm)
	    {
		System.out.println("LoginGUI: I see you've pressed the button. :)");
		System.out.println("LoginGUI: Credentials: Username: "+ username.getText() + " Password: "+password.getText());
		session.myGUISession().login(username.getText(), password.getText());
	    }
    }
}
