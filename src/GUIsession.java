/*Active graphical frontend to session manager.*/
class GUIsession extends JFrama implements Changelistener
{
    public GUIsession()
    {
	super();
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setSize(1000,1000);
	add(LoginSession);
	
    }
    
}
