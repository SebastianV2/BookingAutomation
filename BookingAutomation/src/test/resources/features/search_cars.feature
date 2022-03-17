#Author: sebas-garcia-123@hotmail.com

@tag
Feature: Search a car to rent on Booking.com

  As a Web User
  I want to search a car to rent Booking.com web page
  To go home

  @searchCars
  Scenario: Search a car to rent
    Given that user wants to rent a car
    When user gets on the cars page
    And user enters the data for the service
      |Aeropuerto de medellin |
    Then user should see the bot alert message