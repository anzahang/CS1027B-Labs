public class Player {
	/**
	 * Player class represents a player on a team
	 * @author Andrew Zhang
	 * @version Lab1 - 2023-01-15
	 */
   private String name;
   private String position;
   private int jerseyNum;
   /**
    * Constructor for Player class
    * @param theName - player's name
    * @param thePosition - player's position
    * @param theJersey - player's jersey number
    */
   
   public Player(String theName, String thePosition, int theJersey) {
      name = theName;
      position = thePosition;
      jerseyNum = theJersey;
   }
   /**
    * Method to get the plaer's name
    * @return the player's name
    */
   public String getName() {
	   //Get the player’s name
      return name;
   }
   /**
    * Method to get the player's position
    * @return the player's position
    */
   public String getPosition() {
      return position;
   }
   /**
    * Method to get the player's jersey number
    * @return the player's jersey number
    */
   public int getJerseyNum() {
      return jerseyNum;
   }
   /**
    * Method to set the player's name
    * @param newName - the new name for the player
    */
   public void setName(String newName) {
      name = newName;
   }
   /**
    * Method to set the player's position
    * @param newPosition - the new position for the player
    */
   public void setPosition(String newPosition) {
      position = newPosition;
   }
   /**
    * Method to set the player's jersey number
    * @param newJersey - the new jersey number for the player
    */
   public void setJerseyNum(int newJersey) {
      jerseyNum = newJersey;
   }
}
