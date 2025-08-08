Feature: Hello endpoints
  Scenario: Get hello
    When the client calls "/hello"
    Then the client receives status code of 200
    And the client receives body "Hello World"

  Scenario Outline: Get greet name
    When the client calls "/greet/<name>"
    Then the client receives status code of 200
    And the client receives body "Hello <name>"

    Examples:
      | name |
      | John |
      | Jane |

  Scenario: Get status
    When the client calls "/status"
    Then the client receives status code of 200
    And the client receives body "OK"
