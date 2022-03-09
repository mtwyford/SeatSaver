# SeatSaver

<<Seat saver is a variation of PartyPlanner - I had to move and create a new Repo due to some conflicting versions.>>

Mission:
  Your task is to design a software solution to place people at one of 0 tables.
  It will require you to consider the following guidelines:
  
  1. No more than 10 people at a table
  2. No more than 100 people may attend the event
  3. No more than 2 people from any company may sit at the same table
  4. A file with 90 people will be provided, part of your task will be to use code to:
      a. load the file (use buffer, scanner class or other methods
      b. read in each line of text
      c. parse out the string/text into the various elements or data types
  5. Use a scanner class to permit users to manually (apply) /register to attend.
      a. users requesting to attend should not break rules of 
          i. total attendance numbers
          ii. max num of people from each company at a table
  
Seat Saver  - another name for Party Planner is a project for students to break out and work on their own without alot of specific guidance.
  
  

  
  
  ```java 
  
  BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
while ((row = csvReader.readLine()) != null) {
    String[] data = row.split(",");
    // do something with the data
}
csvReader.close();
```  
  
  Another helpful ink..
  
  https://stackabuse.com/reading-and-writing-csvs-in-java/
