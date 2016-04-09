class LoginSession extends JPanel implements ActionListener
{
    Jbutton confirm;
    SessionManger session;
    JTextField username;
    JPasswordField password;

    public LoginSession();
    {
	session = new SessionManager();
	add(username); //username field
	add(password); //password field
	add(confirm); //confirm button
    }

    void actionPerformed(ActionEvent e)
    {
	if (e.getSource() == confirm)
	    {
		session.login(username.getText(), password.getText());
	    }
    }
	
