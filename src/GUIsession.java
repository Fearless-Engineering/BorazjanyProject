
package digitalLeague;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*Manages the current user, and the overall GUI.*/
/*Also a singleton.*/
class GUISession extends JFrame
{
    private static GUISession currentSession = null;

    //Instead of the interface/user paradigm, i've decided to go with a single abstract class "User".
    //It defines the generic data fields for all user types and also defines all possible functions for all users.
    //Makes it a bit more simple, and closer to what we were doing originally. accomplishes the same basic thing.
    //I still like the interface/user paradigm, though.
    User user;

    Integer sessionType;
    
    private GUISession()
    {
	super();
	System.out.println("heyo! making a session");
	//UserOperations = new nullOperations();//User cannot properly perform any operations.
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setSize(1000,1000);
	currentSession = this;
	System.out.println(System.identityHashCode(this));
	System.out.println(System.identityHashCode(currentSession));
	displayLoginScreen();
    }

    public static GUISession myGUISession()
    {
	if(currentSession == null)
	    new GUISession();
	return currentSession;
    }

    public Integer login(String username, String password)
    {

	LoginRet retVal;//class containing an integer loginsig and the user.
	DataBase dataBass = DataBase.myDataBase();

	retVal = dataBass.login(username, password);
	if(retVal.loginsig != 0)//you could just check to see if retVal.user is null, but there might be other error conditions that you could implement
	    {
		return retVal.loginsig;//user put something in wrong, retry.
	    }

	user = retVal.user;//yes it's public. wanna fight about it?

	if(user.userType().equals("Coach"))
	    {
		sessionType = 0;
		beginCoachSession();
	    }
	if(user.userType().equals("Player"))
	    {
		sessionType = 1;
		beginPlayerSession();
	    }
	if(user.userType().equals("Manager"))
	    {
		sessionType = 2;
		beginManagerSession();
	    }
	return 0;
    }

    public void logout()
    {
	clearDisplay();
	user = null;
	displayLoginScreen();
    }
    
    private void displayLoginScreen()
    { 
	//clearDisplay();
	System.out.println("Sup! Me again, adding a loginGUI.");
	add(new LoginGUI());
	user = null;
    }

    private void beginCoachSession()
    {
	clearDisplay();
	add(new CoachGUI());
    }
    
    private void beginPlayerSession()
    {
	//clearDisplay();
	//add(new PlayerGUI());
    }

    private void beginManagerSession()
    {
	//clearDisplay();
	//add(new ManagerGUI());
    }

    private void clearDisplay()
    {
	//ripped these off of some stackexchange question I found.
	removeAll();
	revalidate();
	repaint();
    }
	
}
