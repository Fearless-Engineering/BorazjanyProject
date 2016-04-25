package digitalLeague;

class DataBase
{
    private static DataBase myInstance = null;

    private UserFile aUser;
    
    private DataBase()
    {
	aUser = new UserFile("Mr.Coachman", "1234", new Coach("Mr.Coachman"));
    }

    public static DataBase myDataBase()
    {
	if (myInstance == null)
	    {
		myInstance = new DataBase();
	    }
	return myInstance;
    }

    public LoginRet login(String usernam, String pass)
    {
	
	if(aUser.username.equals(usernam) & aUser.password.equals(pass))
	    {
		System.out.println("DataBase: Good job. Welcome home.");
		return new LoginRet(0, aUser.user.copyMe());
	    }
	else
	    {
		System.out.println("DataBase: nope, Try again");
		System.out.println("Correct response: " + aUser.username + ", " + aUser.password);
		System.out.println("Your Response: " + usernam + ", " + pass);
		System.out.println("Return: " + (aUser.username.equals(usernam)));
		return new LoginRet(1, null);
	    }
    }

}

class UserFile
{
    public String username;
    public String password;
    public User user;

    public UserFile(String usern, String pass, User luser)
    {
	username = usern;
	password = pass;
	user = luser;
    }
}

class LoginRet
{
    public Integer loginsig;
    public User user;

    public LoginRet(Integer retun, User loser)
    {
	loginsig = retun;
	user = loser;
    }
}
