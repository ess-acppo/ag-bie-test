@All @Smoke
Feature: Visit page and do Smoke tests

  @Overview
  Scenario: Visit Page and see Overview tab
    Given Go to URL
    When I do search
    And select a record
    Then should be able to visit Overview tab

  @Names
  Scenario: Visit Page and see Names tab
    Given Go to URL
    When I do search
    And select a record
    Then should be able to visit Names tab

  @Classification
  Scenario: Visit Page and see Classification tab
    Given Go to URL
    When I do search
    And select a record
    Then should be able to visit Classification tab

  @Literarture
  Scenario: Visit Page and see Literarture tab
    Given Go to URL
    When I do search
    And select a record
    Then should be able to visit Literarture tab

  @Sequences
  Scenario: Visit Page and see Sequences tab
    Given Go to URL
    When I do search
    And select a record
    Then should be able to visit Sequences tab

  @RefineSpecies
  Scenario: Visit Page Search and Refine Results on Species Name
    Given Go to URL
    When I do search
    Then Refine search on Species

  @RefineCommonName
  Scenario: Visit Page Search and Refine Results on Common Name
    Given Go to URL
    When I do search
    Then Refine search on Common Name

  @TaxanomicStatusAccepted
  Scenario: Visit Page and search TaxanomicStatusAccepted
    Given Go to URL
    When I do search
    Then Refine search on TaxonStatus Accepted

  @TaxanomicStatusSynonym
  Scenario: Visit Page and Search TaxanomicStatusSynonym
    Given Go to URL
    When I do search
    Then Refine search on TaxonStatus Synonym
