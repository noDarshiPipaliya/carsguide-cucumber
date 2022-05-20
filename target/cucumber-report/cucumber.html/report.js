$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Search the buy car with model",
  "description": "",
  "id": "search-functionality;search-the-buy-car-with-model",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I mouse hover on “buy+sell” tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click ‘Search Cars’ link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I navigate to ‘new and used car search’ page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I select make “\u003cmake\u003e”",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select model “\u003cmodel\u003e”",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select location “\u003clocation\u003e”",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select price “\u003cprice\u003e”",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on Find My Next Car tab",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should see the make “\u003cmake\u003e” in results",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "search-functionality;search-the-buy-car-with-model;",
  "rows": [
    {
      "cells": [
        "make",
        "model",
        "location",
        "price"
      ],
      "line": 16,
      "id": "search-functionality;search-the-buy-car-with-model;;1"
    }
  ],
  "keyword": "Examples"
});
});