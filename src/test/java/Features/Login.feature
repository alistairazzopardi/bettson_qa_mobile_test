Feature: Login Page

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters username "standard_user" and password "secret_sauce"
    And the user clicks the login CTA
    Then the user is redirected to the products screen

  Scenario: Login with invalid credentials
    Given the user is on the login page
    When the user enters username "wrong_user" and password "wrong_pass"
    And the user clicks the login CTA
    Then an error message "Epic sadface: Username and password do not match any user in this service" should be displayed