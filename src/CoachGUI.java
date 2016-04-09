//My plan for this is to create a good specific class and then generalize later
//most members of CoachGUI, as well as coachGUI itself, might have  superclasses that I have yet
//to implement.

class CoachGUI extends JFrame 
{

    
    
    CoachMenuBar menuBar;
    JtabbedPane Tabbes;
    CalendarPane calendar;
    TeamPane team;
    
    public CoachGUI()
    {
	menuBar = new CoachMenu();
	Tabbes = new JTabbedPane();
	calendar = new CalendarPane();
	team = new TeamPane();
	add(menuBar);
	Tabbes.add("Calendar", calendar);
	Tabbes.add("My Team", team);
    }
}

    
