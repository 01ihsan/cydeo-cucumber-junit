Feature: Wikipedia search functionality and verification

  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title

  Scenario: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header

  @wip
  Scenario Outline: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header

    Examples:search values we are working are listed below.
      | searchValue  | expectedTitle | expectedMainHeader |
      | Steve Jobs   | Steve Jobs    | Steve Jobs         |
      | Bob Marley   | Bob Marley    | Bob Marley         |
      | Chuck Norris | Chuck Norris  | Chuck Norris       |
      | Marie Curie  | Marie Curie   | Marie Curie        |
      | Lady Gaga    | Lady Gaga     | Lady Gaga          |