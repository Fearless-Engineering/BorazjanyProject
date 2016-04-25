package digitalLeague;

abstract class User 
{
    protected String userName;
    protected String name, address, phoneNumber, email;
    protected String userType;

    public abstract User copyMe();
    public abstract String userType();

}
