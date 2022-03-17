// class to construct 'people' objects which will be added to an ArrayList

public class Person {
  
  //local variables
  int pID; //unique ID for each person
  String name; //name of each person
  int cID; //company ID - who people work for 
  int tableID; //not part of the constructor 
                // a possible approach is to put the people at tables with 
  
  //constructor takes three parameters to construct a 'person'
  public Person (int personID, String name, int companyID) {
      pID = personID;
      this.name = name; //this reference used when variable and argument/parameter are the same
      cID = companyID;  
  }
  
  //a to string method just in case
  public String toString() {
    return (name + " has an ID of " + pID + " and is from comany " + cID );
  }
  
  
}       
  
  
