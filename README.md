# SeatSaver AKA Party Planner
![Party Graphic](party.jpg "Party Planning" {width=200px})


> Seat saver is a variation of PartyPlanner - I had to move and create a new Repo due to some conflicting versions.

Mission:
  Your task is to design a software solution to place 10 people at each of 10 tables.
  It will require you to consider the following guidelines:
  
  1. No more than 10 people at a table
  2. No more than 100 people may attend the event
  3. No more than 2 people from any company may sit at the same table
  4. A file with 90 people will be provided, part of your task will be to use code to:
     * load the file (use buffer, scanner class or other methods
     * read in each line of text
     * parse out the string/text into the various elements or data types
  5. A second text/csv file exists -(companies.txt)- but you can manually build a list of comanies and their corresponding ID's.
  6. Then, Use a scanner class to permit users to manually (apply) /register to attend.
      * users requesting to attend should not break rules of 
        1. total attendance numbers (once total num=100, stop)
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
> Here's a link to the code above, with more explanations..   
>  https://stackabuse.com/reading-and-writing-csvs-in-java/ 
>  Notice that the while loop both reads in a new line - and at the same time checks to see if there is a next line to read
>  If there is a new line, 'row' is split using a delimiter ',' into elements of an array
>  from there - you could parse elements of that String array into the various parts of a Person object, hint parseInt might be helpful.

Other items to consider

* People as objects - create a People or Person class, with certain variables
* Add them to a list (say, an arraylist) of Person objects
* Wait to add ALL the people, both from the file load, and from the manual registration with a Scanner class
* If you placed people by company first - would you be able to check if that company has reached their 'max' of 20?
* Don't forget to save/store you work - 
* It would be nice to give the user the option to print out a list of each table, maybe even save to multipl files??

This is fun!
Recall that this is designed to be a chance to stretch your skills and see how you do with some unknowns.
I am interested to see your progress and evolution in this project--

> 50% of your grade will come from the eveolution of your project each day, with regular commits, plent of comments and a flow.
> A magical 180 or a remarkable explosion of code one day after 4 days of 20lines/day average would be cause for concern.
> Let's see how you approach, think and try to solve the problem.
> Show me your thinking!!
       
