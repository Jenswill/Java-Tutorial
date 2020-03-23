// Tutorial in comments
/**
 *  The HelloWorld class 
 *  @author Jens Iversen
 * 
 */
public class HelloWorld {

	private String mName; //To store the name
	
	/**
	 * To set the name
	 *  @param name The name of the user in String
	 */
	public void setName(String name) {
		mName = name;
	}
	/**
	 * To retrieve the name
	 * @return The name of the user in String
	 */
	public String getName() {
	return mName;
	}
	/**
	 * To print greetings on the screen
	 */
	public void sendGreetings() {
		System.out.println(mName);
	}
}
