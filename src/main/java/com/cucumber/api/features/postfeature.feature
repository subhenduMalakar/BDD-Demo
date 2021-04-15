Feature: this is a feature to test bdd

  Background: Common background
    Given Site should be available

  Scenario: Play a video on the site
    When i clicked on the play button
    Then the video should start
    Then the video should "play"

  Scenario: Get the search result
    When i clicked on search button
    Then proper search result should display
      | 1 | 2 |
      | 3 | 4 |
      | 5 | 6 |

  Scenario Outline: scenario description
    Given a precondition has value "<param_1>"
    And something with "<param_2>"
    Then check "<param_3>" is the output

    Examples: 
      | param_1  | param_2  | param_3  |
      | value1_1 | value1_2 | value1_3 |
      | value2_1 | value2_2 | value2_3 |
      | value3_1 | value3_2 | value3_3 |
