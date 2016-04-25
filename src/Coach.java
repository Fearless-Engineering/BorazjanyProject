package digitalLeague;

class Coach extends User
{
    public Coach(String myUserName)
    {
	userName = myUserName;
	userType = "Coach";
    }	

    public User copyMe()
    {
	return new Coach(userName);//return a new instance that is a duplicate of this one
	//where we're going, we don't need copy constructors.
    }

    public String userType()
    {
	return userType;
    }
}
    
