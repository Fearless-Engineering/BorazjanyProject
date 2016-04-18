/*Manages the current user, and the overall GUI.*/
/*Also a singleton.*/
class GUISession extends JFrame
{
    private static GUISession currentSession = null;

    //this is not a regular "user." this contains current user data, not password.
    //It contains functions such as login, logout, and loads the appropriate user data.
    SessionUser sessionUser;

    /*list of operations avaliable to the user in the current session.
      I intend for it to be loaded with a bunch of functions specific to the user type.
      GUI will call functions, error message will be returned by operations if function is not avaliable to user.
      operator implements an interface called UserOps, that contains definitions for all possible
      functions any user can perform.
      Depending on the type of user, these functions are implemented differently. Functions that a user
      cannot use might return an error message, for example.
      When a user logs in, operator wil be given a value based upon
      This enables the GUI to access functions that the user can perform without being able to access
      the sessionUser itself, enabling us to keep SessionUser private and solely managed by GUISession.

      I don't actually know if you can "instantiate" an interface this way.
    */
    UserOps operations;

    //Coach, Manager, Player
    Int sessionType;
    
    private GUIsession()
    {
	super();
	UserOperations = new nullOperations();//User cannot properly perform any operations.
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setSize(1000,1000);
	displayloginscreen();
    }

    public GUIsession myGUIsession()
    {
	if(currentSession == null)
	    currentSession = new GUISession();
	return currentSession;
    }

    public Int login(string username, string password);
    {

	Int loginsig;
	
	loginsig = sessionUser.login(username, password);
	if(loginsig != 0)
	    return loginsig;//user put something in wrong, retry.
	
	if(sessionUser.userType == "Coach")
	    {
		sessionType = 0;
		beginCoachSession();
	    }
	if(sessionUser.userType == "Player")
	    {
		sessionType = 1;
		beginPlayerSession();
	    }
	if(sessionUser.userType == "Manager")
	    {
		sessionType = 2;
		beginManagerSesion();
	    }
    }

    public logout();
    {
	sessionUser.logout();
	displayloginscreen();
    }
    
    private void displayLoginScreen()
    {
	clearDisplay();
	add(new LoginGUI());
	operations = new nullOperations();
    }

    private void beginCoachSession()
    {
	clearDisplay();
	add(new CoachGUI());
	operations = sessionUser.operations();
    }
    
    private void beginPlayerSession();
    {
	clearDisplay();
	add(new PlayerGUI());
	operations = sessionUser.operations();
    }

    private void beginManagerSession()
    {
	clearDisplay();
	add(new ManagerGUI());
	operations = sessionUser.operations();
    }

    private void clearDisplay()
    {
	//ripped these off of some stackexchange question I found.
	removeAll();
	revalidate();
	repaint();
    }
	
}
