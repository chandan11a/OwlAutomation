@tag
Feature: The test case verifies that a user can login with a valid account

  Scenario Outline: Login successfully
  
  	Given The Login page is loaded successfully
    When I login the system with valid "<Data>" username and "<password>" password
  
    Examples: 
      | Data |  password | 
      | 1 | Test|
      | 2 | Test|
