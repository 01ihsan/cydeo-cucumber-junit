Feature: Examples os Cucumber data table implementations

  Scenario: List of fruits I like
    Then user should see fruits I like
      | kiwi        |
      | cucumber    |
      | grape       |
      | pomegranate |
      | mango       |
      | watermelon  |
      | mandarin    |

  @wip
  Scenario: user should be able to see all 12 months in months dropdown
    Given User is on the dropdown page of the practice
    Then User should see below info in months dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |