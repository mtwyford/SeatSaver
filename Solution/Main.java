//Main.java - a new approach to the tester file, this file supports the Replit.com file structure where the main tester class is Main.java
//Don't forget to add you own name and date... 10% of your grade quickly disappears if it slips your mind!

import java.io.*; //add helper file for reading files
import java.util.ArrayList; //need this for 
public class Main {
  
  //psvmsa
  public static void main (String[] args) throws IOException {  //add 'throws IOException" to handle errors
    
    ArrayList<Person> party = new ArrayList<Person>(); //rather a string or an Integer, create a list of Person objects 
    //now let's connect to the file of 90 names - copy in the helper code - or use your own
    
    BufferedReader csvReader = new BufferedReader(new FileReader("names.csv"));  //make sure file is in same folder (or use folder path in name
      while ((row = csvReader.readLine()) != null) {
          String[] data = row.split(",");  //this parses out each line into an array of strings, separating out by commas
              //to test = print out one element in the array       
          // do something with the data
            //next - call a new person object constuctor, and pass to it ID, name, and companyID
            //finally - add that person to the array list ( party.add(p1); )
      }
    csvReader.close();
    
    //ok - so file reading is done...
    //next create prompts to allow the last 10 people register manually - but make sure rules still apply
        //no more than 10 people at a table, and no more than 2 people from any company at the same table
    //now - work on putting people at the tables....
        
    
    
   //Finally... add the following.. 
  // add 'menu' to walk users through process of loading file, (you could make the name of the file an argument passed in...
  // adding to an Arrayist of Person 'objects'
  //then asking users for registration info to add the remaining 10 people
  // then call the "seating' method (you decide naming rights
   
  //this should place people at tables (what data structure will you use?  more ArrayLists?
  //you can't simply create an array of array lists, but what about an 2D[ ]  of table objects??
  // Is that possible?
  
  
  
}
