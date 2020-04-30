$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login with valid credentials",
  "description": "",
  "id": "login;login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"\u003cusername\u003e\" in the username field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003cpassword\u003e\" in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks in the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user accesses dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "welcome message is displayed",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "login;login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "login;login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "gdadald3@gmail.com",
        "123456"
      ],
      "line": 14,
      "id": "login;login-with-valid-credentials;;2"
    },
    {
      "cells": [
        "gdadald9@gmail.com",
        "123456"
      ],
      "line": 15,
      "id": "login;login-with-valid-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Login with valid credentials",
  "description": "",
  "id": "login;login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"gdadald3@gmail.com\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"123456\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks in the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user accesses dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "welcome message is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "gdadald3@gmail.com",
      "offset": 13
    }
  ],
  "location": "LoginPageSteps.userEntersInTheUsernameField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 13
    }
  ],
  "location": "LoginPageSteps.userEntersInThePasswordField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.user_clicks_in_the_signin_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.user_accesses_dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.welcome_message_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 15,
  "name": "Login with valid credentials",
  "description": "",
  "id": "login;login-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"gdadald9@gmail.com\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"123456\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks in the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user accesses dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "welcome message is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "gdadald9@gmail.com",
      "offset": 13
    }
  ],
  "location": "LoginPageSteps.userEntersInTheUsernameField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 13
    }
  ],
  "location": "LoginPageSteps.userEntersInThePasswordField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.user_clicks_in_the_signin_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.user_accesses_dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.welcome_message_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "Login with invalid credentials",
  "description": "",
  "id": "login;login-with-invalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user enters \"\u003cusername\u003e\" in the username field",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user enters \"\u003cpassword\u003e\" in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user clicks in the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "invalid password message is displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "login;login-with-invalid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 26,
      "id": "login;login-with-invalid-credentials;;1"
    },
    {
      "cells": [
        "gdadald3@gmail.com",
        "123455"
      ],
      "line": 27,
      "id": "login;login-with-invalid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 27,
  "name": "Login with invalid credentials",
  "description": "",
  "id": "login;login-with-invalid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user enters \"gdadald3@gmail.com\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user enters \"123455\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user clicks in the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "invalid password message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "gdadald3@gmail.com",
      "offset": 13
    }
  ],
  "location": "LoginPageSteps.userEntersInTheUsernameField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "123455",
      "offset": 13
    }
  ],
  "location": "LoginPageSteps.userEntersInThePasswordField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.user_clicks_in_the_signin_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.invalid_password_message_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 29,
  "name": "Navigate to create account page",
  "description": "",
  "id": "login;navigate-to-create-account-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "user enters a new email in the email address field",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user clicks in the create an account button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "dashboard page is loaded",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});