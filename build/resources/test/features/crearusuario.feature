#Autor: Manuel Bolaño

@stories
Feature: create user
  I want to automate the creation of a user on the automationtesting platform


  @Scenario
  Scenario: create user on the platform
    Given Manuel wants to access the platform
    When entering the requested data
      | firstname     | lastname | address                | email                    |  phone        | country  | year| month| day|  pass           |rpass|
      | Manuel           | Bolano    | Cerete-cordoba   | manuelbgalindo@gmail.com   | 3135349723    | japan    | 1999| april|  13|Manuelandres1@|Manuelandres1@|
    Then  the creation is completed by filling in the data and pressing the button submit
    |button|
    |submit|

