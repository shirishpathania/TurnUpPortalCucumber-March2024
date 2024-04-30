Feature: This is a sample test suite for TurnUp Portal

  It covers the below test scenarios
  1. Create TM Record
  2. Edit TM Record
  3. Delete TM Record

  Scenario: Verify user is able to create a TM Record
    Given user logs into turnup portal
    And user navigates to TM page
    When user creates a new TM record 'abc' 'xyz' '20'
    Then tm record should be created successfully

  Scenario Outline: B. Edit an existing Time and Material record
    When user creates a new TM record 'xyz' 'abc' '20'
    When I edit an existing Time Material record '<oldCode>' <oldTypeCode> <oldDescription> <oldPrice> <newCode> <newTypeCode> <newDescription> <newprice>
    Then the record should be updated <newCode>

    Examples:
      | oldCode | oldTypeCode | oldDescription | oldPrice | newCode | newTypeCode | newDescription | newprice |
      | PC    | 'T'         | 'Gaming PC'    | '500'    | 'Laptop'   | 'M'         | 'Gaming Laptop'    | '100'    |