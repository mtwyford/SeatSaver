# SeatSaver AKA Party Planner

<<Seat saver is a variation of PartyPlanner - I had to move and create a new Repo due to some conflicting versions.>>

Mission:
  Your task is to design a software solution to place people at one of 0 tables.
  It will require you to consider the following guidelines:
  
  1. No more than 10 people at a table
  2. No more than 100 people may attend the event
  3. No more than 2 people from any company may sit at the same table
  4. A file with 90 people will be provided, part of your task will be to use code to:
     * load the file (use buffer, scanner class or other methods
     * read in each line of text
     * parse out the string/text into the various elements or data types
  5. Use a scanner class to permit users to manually (apply) /register to attend.
      * users requesting to attend should not break rules of 
        1. total attendance numbers
        2. max num of people from each company at a table
  

  # Getting Started
  
  There are several ways to approach this problem.  Consider how you will design an algorithm to:
  * think about how to create 'tables' and check for:
    * number of people at the table?
    * number of people from each company at the table
    * total number of people at the banquet
  * (how you will) read and/or parse the data
  * organize the data into - for example people objects
  * print table 'rosters' (list of each person at the different tables)
  
  ### Let's look at an example of loading data...
  
  ```java 
  
  BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
while ((row = csvReader.readLine()) != null) {
    String[] data = row.split(",");
    // do something with the data
}
csvReader.close();
```  
< Here's a link to the code above, with more explanations..   
  https://stackabuse.com/reading-and-writing-csvs-in-java/ >
       

       
       
