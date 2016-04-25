/*Use this class to manage startup options, and the like. This is the main class, and it starts
  everything else*/
/*this is so later there might be options to have different session types.
 */
package digitalLeague;

public class League
{
    public static void main(String[] args)
    {
	GUISession session = GUISession.myGUISession();
    }
}
