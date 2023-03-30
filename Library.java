import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building{

  private Hashtable<String,
  Boolean> collection = new Hashtable<String,Boolean>();
  
  /** library class:
   * @param name
   * @param address
   * @param nFloors
  */

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
    
      //System.out.println("You have built a library: 📖");
    }
  /** add book:
   * @param title
   * @return
   */
    public void addTitle(String title){
      this.collection.put(title, true);


    }


    /** remove book:
     * @param title
     * @return
     */
    public String removeTitle(String title){
      this.collection.remove(title);
      return title;
      
    } // return the title that we removed

    /**check out book:
     * @param title
     */
    public void checkOut(String title){
      this.collection.replace(title, true, false);

    }
    
  /**return book:
   * @param title
   */
    public void returnBook(String title){
      this.collection.replace(title, false, true);
      
    }


    /** check if title appears as a key in the collection:
     * @param title
     * @return
     */
    public boolean containsTitle (String title){// returns true if the title appears as a key in the Libary's collection, false otherwise
      return this.collection.containsKey(title);
    }

    /**returns true if the title is currently available, false otherwise
     * @param title
     * @return
     */
    public boolean isAvailable(String title){
      return this.collection.get(title);

    }
    /**prints out the entire collection in an easy-to-read way (including checkout status)

     */
     public void printCollection(){


    }



    public static void main(String[] args) {
      Library neilson = new Library("neilson", "7 Neilson Drive",4);
      neilson.addTitle("The Lorax by Dr. Seuss");
      neilson.addTitle("Mexican Gothic");
      neilson.checkOut("Mexican Gothic");
      neilson.returnBook("Mexican Gothic");




    }
  
  }