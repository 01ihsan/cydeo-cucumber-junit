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