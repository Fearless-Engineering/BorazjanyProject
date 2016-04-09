//My plan for this is to create a good specific class and then generalize later
//most members of CoachGUI, as well as coachGUI itself has superclasses that I have yet
//to implement.

class CoachGUI extends JFrame implements ActionListener
{
    JMenuBar menuBar;;
    JMenuItem Logout;

    JMenu File;
    JMenuItem save;
    JMenuItem load;
    JMenuItem newItem; 
    
    
    JtabbedPane Tabbes;
    CalendarPane calendar;
    TeamPane team;
    
    public CoachGUI()
    {
	createMenuBar();
    }

    void createMenuBar()
    {
	menuBar = new JMenuBar();
	File = new JMenu 
}

    
