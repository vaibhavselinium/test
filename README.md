1. Open The Eclipse IDE
2. Create a java project with the name POM
3. Create 2 Packages Automation, pageobjects
4.In Automation Create the test for which page objects are created
   
i)I wanted to check the functionality of search on home page then firstly create a search.java in the pageobject package
after that create a testcase for searchtest.java in automation package. after that just go to the SearchTest.java and 
that file the desired output will be shown on your browser


ii)Suppose we have to check the functionality of surgery Enquiry From on home page
we will create a class which consist of objects of webelement that are used in code.The class we will create is surgery.java
and the testcase in automation is written in surgerytest.java

iii)Suppose we have to check Book appointemnet functionality 
we will create a class having objects of webelement called Book.java and using the Booktest.java we will run the testcase

iv) you can also create only one testcase to run all the pageobjects just you have to use TESTNG Jar files and then at the top 
of the method you have to give priority which test should be excuted first accordingly the testing is done.
