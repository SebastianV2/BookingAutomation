#Author: sebas-garcia-123@hotmail.com
#Archivos .feature: Archivos de texto en los cuales se escriben los criterios de aceptación en formato Gherkin.

@tag
Feature: Login on Booking.com

  As a Web User
  I want to login into booking.com web page
  To see the logged user homepage

  @login
  Scenario: Login on Booking.com
    Given that user wants to sign in on Booking.com
    When user clicks on Login button
    And he enters the username and password
      | username                     | password     |
      | sebas-garcia-123@hotmail.com | 2856316sebaS |
    Then user should see the captcha message