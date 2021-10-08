$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyTest.feature");
formatter.feature({
  "line": 1,
  "name": "Reset functionality on login page of Application",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 22,
  "name": "Check if String is Palindrome",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;check-if-string-is-palindrome",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 21,
      "name": "@UpdateProfile"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I entered word \u003cwordToTest\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I test it for Palindrome",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "the output should be \u003coutput\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;check-if-string-is-palindrome;",
  "rows": [
    {
      "cells": [
        "wordToTest",
        "output"
      ],
      "line": 27,
      "id": "reset-functionality-on-login-page-of-application;check-if-string-is-palindrome;;1"
    },
    {
      "cells": [
        "\"Refer\"",
        "\"true\""
      ],
      "line": 28,
      "id": "reset-functionality-on-login-page-of-application;check-if-string-is-palindrome;;2"
    },
    {
      "cells": [
        "\"Coin\"",
        "\"false\""
      ],
      "line": 29,
      "id": "reset-functionality-on-login-page-of-application;check-if-string-is-palindrome;;3"
    },
    {
      "cells": [
        "\"Space\"",
        "\"false\""
      ],
      "line": 30,
      "id": "reset-functionality-on-login-page-of-application;check-if-string-is-palindrome;;4"
    },
    {
      "cells": [
        "\"racecar\"",
        "\"true\""
      ],
      "line": 31,
      "id": "reset-functionality-on-login-page-of-application;check-if-string-is-palindrome;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 28,
  "name": "Check if String is Palindrome",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;check-if-string-is-palindrome;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 21,
      "name": "@UpdateProfile"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I entered word \"Refer\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I test it for Palindrome",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "the output should be \"true\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Refer",
      "offset": 16
    }
  ],
  "location": "Steps.i_entered_word(String)"
});
formatter.result({
  "duration": 125321100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_test_it_for_Palindrome()"
});
formatter.result({
  "duration": 51600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 22
    }
  ],
  "location": "Steps.the_output_should_be(String)"
});
formatter.result({
  "duration": 77100,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Check if String is Palindrome",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;check-if-string-is-palindrome;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 21,
      "name": "@UpdateProfile"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I entered word \"Coin\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I test it for Palindrome",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "the output should be \"false\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Coin",
      "offset": 16
    }
  ],
  "location": "Steps.i_entered_word(String)"
});
formatter.result({
  "duration": 96500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_test_it_for_Palindrome()"
});
formatter.result({
  "duration": 47100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "false",
      "offset": 22
    }
  ],
  "location": "Steps.the_output_should_be(String)"
});
formatter.result({
  "duration": 88100,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Check if String is Palindrome",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;check-if-string-is-palindrome;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 21,
      "name": "@UpdateProfile"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I entered word \"Space\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I test it for Palindrome",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "the output should be \"false\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Space",
      "offset": 16
    }
  ],
  "location": "Steps.i_entered_word(String)"
});
formatter.result({
  "duration": 159800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_test_it_for_Palindrome()"
});
formatter.result({
  "duration": 72200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "false",
      "offset": 22
    }
  ],
  "location": "Steps.the_output_should_be(String)"
});
formatter.result({
  "duration": 118200,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Check if String is Palindrome",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;check-if-string-is-palindrome;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 21,
      "name": "@UpdateProfile"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I entered word \"racecar\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I test it for Palindrome",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "the output should be \"true\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "racecar",
      "offset": 16
    }
  ],
  "location": "Steps.i_entered_word(String)"
});
formatter.result({
  "duration": 113700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_test_it_for_Palindrome()"
});
formatter.result({
  "duration": 52900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 22
    }
  ],
  "location": "Steps.the_output_should_be(String)"
});
formatter.result({
  "duration": 77500,
  "status": "passed"
});
});