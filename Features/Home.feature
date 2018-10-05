Feature: This feature file is designed to validate Home page functionalities in below listed scenarios


@Regressiontest
Scenario: This scenario is designed to validate all the display conditions
    Given launch browser and open application
    When an application is opened verify again home page is displayed
    Then Enter "Username" and "Password"
    |admin|admin| 
    |admin|admin| 
    |admin|admin| 
    |admin|admin| 
    |admin|admin| 
    |admin|admin| 
   
@SomeTest
Scenario: This scenario is designed to Add Staff
    Given launch FF browser and open application
    When an application is opened navigate to admin page by giving "Username" and "Password"
   	|admin|admin|   
    Then Enter credentials for adding staff
    |bhanu|f|04/14/1994|married|developer|12/04/2015|P.N|9696969696|abdefg@gmail.com|12345|
    |bhanu1|f|04/14/1994|unmarried|developer|12/04/2016|P.N|9797979797|abcde@gmail.com|1234|
    |bhanu2|m|04/14/1995|married|revenue|12/05/2014|P.N|9595959595|abcdf@gmail.com|1245|