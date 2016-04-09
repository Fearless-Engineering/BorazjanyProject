//manages things such as login or log out.

//this is also a singleton.
class SessionManager
{
    Session currentSession;

    public int login(string username, string password)
    {
	if (!cpassword, !cusername)
	    return 3;
	if (!cusername, cpassword)
	    return 2;
	if (cusernme, !cpassword)
	    return 1;
	if (cusername, cpassword)
	    {
		//set currentUser
		return 0;//0 means password and username are valid.
	    }
    }

    //return 0 if logout wrked properly.
    public int logout();

    public UserData userData();
    {
	return currentUser;
    }
    //todo for you guys: write a class that encapsulates all important user information, minus
    //password. we don't need that floating around.
}
    
/*personally, i don't understand the conept of use case controllers.
  If every use case triggers the operation of a function, why make a shit ton of classes?
  why not use functions?

  For this reason, this entire project confuses me. Half of me wants to do what I think
  makes sense, the other wants to do what I feel involves making this program needlessly
  complex just to be absolutely sure I get the grade.

  And in all likelihood making this more complex just increases the likelihood it will fail.

  Java is garbage, and OOP is cancer.
*/
