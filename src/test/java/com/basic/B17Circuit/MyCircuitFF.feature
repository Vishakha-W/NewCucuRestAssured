Feature:I want to check circuit file

  @tag1
  Scenario: Circuit Website
    Given user start the rest assured test
    When user hit the get request
    And user checks the count or size
    Then user checks at path "MRDATA.CircuitTable.Circuits.circuitID[0]"

 