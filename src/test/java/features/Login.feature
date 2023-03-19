
Feature: Application Login




  Scenario: Home Page default login
    Given User is on NetBanking landing page
    When User login into application with username "abc" and password "1234"
    Then Home page is populated
    And Cards are displayed
    @RegTest @SmokeTest
    Scenario: Home Page default login
    Given User is on NetBanking landing page
    When User login into application with username "def" and password "4321"
    Then Home page is populated
    And Cards are displayed
    
    Scenario: Home Page default login
    Given User is on NetBanking landing page
    When User login into application with following details
    |jenny|abcd|jenny@gmail.com|australia|97808034883|
    |jenny1|abcd1|jenny1@gmail.com|australia1|97808034883|
    Then Home page is populated
    And Cards are displayed
    @RegTest
    Scenario Outline: Home Page default login
    Given User is on NetBanking landing page
    When User login into application with username <username> and password <password>
    Then Home page is populated
    And Cards are displayed
    
    Examples:
    |username|password|
    |user1   |pass1   |
    |user2   |pass2   |
    |user3   |pass3   |
 
