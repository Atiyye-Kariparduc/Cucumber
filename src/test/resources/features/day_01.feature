@google_search
Feature: google_search
  Background: user_goes_to_google
    Given user is on the google page

  Scenario Outline:TestCase01

    When user search for "<models>" on google
    Then verify the page title contains "<models>"
    And close the application

    Examples:test_data
    |models|
    |mercedes|
    |tesla   |

  Scenario Outline: TestCase02
    When user search for "<flowers>" on google
    Then verify the page title contains "<flowers>"
    And close the application

    Examples: test_data1
      |flowers|
    |rose|
    |daisy  |


