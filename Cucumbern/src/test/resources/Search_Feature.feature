

Feature: Amazon search

Background:
Given print something


@kk
  Scenario: Seaching bat on amazon.
    Given I can see search field on home page of amazon

    When searched "bat" in search result.

    Then all bat results seen on page

@login 
  Scenario: login to facebook
  Given Opened facebook page
  When Entered username as "vinaypanmand" Password as "12345"
  And hits login button
  Then login should be unsuccessful.

@mm
Scenario Outline:
Given <num1> number one and <num2> number two
When  add <num1> and <num2>
Then <total> is diplayed

Examples:
|num1 | num2 | total|
|2|3|5|
|10|10|20|
