/*Active graphical frontend to session manager.*/
class GUIsession extends JFrame implements Changelistener
{
    //this is not a regular "user." this contains current user data, not password.
    //It contains functions such as login, logout, and loads the appropriate user data.
    SessionUser sessionUser;

    //Coach, Manager, Player
    Int sessionType;
    
    public GUIsession()
    {
	super();
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setSize(1000,1000);
	displayloginscreen();
    }

    public login(string username, string password);
    {

	sessionUser.login(username, password);
	//Coach session
	if(sessionUser.userType == "Coach")
	    {
		sessionType = 0;
		beginCoachSession();
	    }
	if(sessionUser.userType == "Player")
	    {
		sessionType = 0;
		beginCoachSession();
    }
    public logout();
    {
	sessionUser.logout();
	loginscreen();
}
