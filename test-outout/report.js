$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#@Selenium"
    }
  ],
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login with valid credentials",
  "description": "",
  "id": "login;login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003cusername\u003e\" in the username field",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters \"\u003cpassword\u003e\" in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks in the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user accesses dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "welcome message is displayed",
  "keyword": "And "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "login;login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 14,
      "id": "login;login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "gdadald3@gmail.com",
        "123456"
      ],
      "line": 15,
      "id": "login;login-with-valid-credentials;;2"
    },
    {
      "cells": [
        "gdadald9@gmail.com",
        "123456"
      ],
      "line": 16,
      "id": "login;login-with-valid-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5690889894,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login with valid credentials",
  "description": "",
  "id": "login;login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters \"gdadald3@gmail.com\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters \"123456\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks in the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user accesses dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "welcome message is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefiniton.user_is_on_login_page()"
});
formatter.result({
  "duration": 79265432,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gdadald3@gmail.com",
      "offset": 13
    }
  ],
  "location": "LoginStepDefiniton.userEntersInTheUsernameField(String)"
});
formatter.result({
  "duration": 111734040,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 13
    }
  ],
  "location": "LoginStepDefiniton.userEntersInThePasswordField(String)"
});
formatter.result({
  "duration": 66547402,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefiniton.user_clicks_in_the_signin_button()"
});
formatter.result({
  "duration": 1176049480,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefiniton.user_accesses_dashboard()"
});
formatter.result({
  "duration": 4807306,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefiniton.welcome_message_is_displayed()"
});
formatter.result({
  "duration": 29650775,
  "status": "passed"
});
formatter.after({
  "duration": 82290872,
  "status": "passed"
});
formatter.before({
  "duration": 5260111319,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Login with valid credentials",
  "description": "",
  "id": "login;login-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters \"gdadald9@gmail.com\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters \"123456\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks in the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user accesses dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "welcome message is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefiniton.user_is_on_login_page()"
});
formatter.result({
  "duration": 5607441,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gdadald9@gmail.com",
      "offset": 13
    }
  ],
  "location": "LoginStepDefiniton.userEntersInTheUsernameField(String)"
});
formatter.result({
  "duration": 116418699,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 13
    }
  ],
  "location": "LoginStepDefiniton.userEntersInThePasswordField(String)"
});
formatter.result({
  "duration": 61340013,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefiniton.user_clicks_in_the_signin_button()"
});
formatter.result({
  "duration": 1090895601,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefiniton.user_accesses_dashboard()"
});
formatter.result({
  "duration": 5007574,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefiniton.welcome_message_is_displayed()"
});
formatter.result({
  "duration": 28410690,
  "status": "passed"
});
formatter.after({
  "duration": 84384089,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "Login with invalid credentials",
  "description": "",
  "id": "login;login-with-invalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 20,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user enters \"\u003cusername\u003e\" in the username field",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user enters \"\u003cpassword\u003e\" in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user clicks in the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "invalid password message is displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "login;login-with-invalid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 27,
      "id": "login;login-with-invalid-credentials;;1"
    },
    {
      "cells": [
        "gdadald3@gmail.com",
        "123455"
      ],
      "line": 28,
      "id": "login;login-with-invalid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5198590297,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Login with invalid credentials",
  "description": "",
  "id": "login;login-with-invalid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 20,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user enters \"gdadald3@gmail.com\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user enters \"123455\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user clicks in the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "invalid password message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefiniton.user_is_on_login_page()"
});
formatter.result({
  "duration": 7093499,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gdadald3@gmail.com",
      "offset": 13
    }
  ],
  "location": "LoginStepDefiniton.userEntersInTheUsernameField(String)"
});
formatter.result({
  "duration": 113864813,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123455",
      "offset": 13
    }
  ],
  "location": "LoginStepDefiniton.userEntersInThePasswordField(String)"
});
formatter.result({
  "duration": 60486001,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefiniton.user_clicks_in_the_signin_button()"
});
formatter.result({
  "duration": 808193411,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefiniton.invalid_password_message_is_displayed()"
});
formatter.result({
  "duration": 56572002,
  "status": "passed"
});
formatter.after({
  "duration": 83059392,
  "status": "passed"
});
});