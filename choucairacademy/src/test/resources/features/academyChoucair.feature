@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than brandon wants to learn automation at the academy Choucair
    | strUser     | strPassword   |
    | 1023018925  | Choucair2021* |
    When he search for the course on the choucair academy platform
    | strCourse                 |
    | Metodología Bancolombia   |
    Then he finds the course called
    | strCourse                 |
    | Metodología Bancolombia   |