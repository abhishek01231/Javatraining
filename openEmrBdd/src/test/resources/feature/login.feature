Feature: Login
  As a user
  in order to main medical record
  i want to visit OpenEmr

  Scenario: Valid Credential
    Given I have browser with OpenEMR page
    When I enter username as 'admin'
    And I enter password as 'pass'
    And I select language as 'English (Indian)'
    And I click on login
    Then I should get access to portal with title as 'OpenEMR'
