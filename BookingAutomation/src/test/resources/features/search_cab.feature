#Author: sebas-garcia-123@hotmail.com

@tag
Feature: Reserve a cab from Booking.com

  As a Web User
  I want to reserve a cab on Booking.com web page
  To go to the airport

  @searchCabs
  Scenario: Reserve a cab
    Given that user wants to reserve a cab
    When user gets on the cabs page
    And user enters the service preferences
      | origin                | dropOff         |date           |pickUpHour|pickUpMin|passengers|
      | Loma de los bernal    | Olaya herrera   |25, marzo 2022 | 23       | 30      | 4        |
    Then user should see the searching for cabs loading screen