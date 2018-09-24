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
formatter.before({
  "duration": 8653115076,
  "status": "passed"
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
  "location": "LoginStepDefiniton.user_is_on_login_page()"
});
formatter.result({
  "duration": 103078112,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gdadald3@gmail.com",
      "offset": 13
    }
  ],
  "location": "LoginStepDefiniton.user_enters_username_in_the_username_field(String)"
});
formatter.result({
  "duration": 123026032,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 13
    }
  ],
  "location": "LoginStepDefiniton.user_enters_password_in_the_password_field(String)"
});
formatter.result({
  "duration": 69058022,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefiniton.user_clicks_in_the_signin_button()"
});
formatter.result({
  "duration": 1238726276,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefiniton.user_accesses_dashboard()"
});
formatter.result({
  "duration": 4046055,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefiniton.welcome_message_is_displayed()"
});
formatter.result({
  "duration": 28374832,
  "status": "passed"
});
formatter.after({
  "duration": 86700379,
  "status": "passed"
});
formatter.before({
  "duration": 7585119780,
  "status": "passed"
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
  "location": "LoginStepDefiniton.user_is_on_login_page()"
});
formatter.result({
  "duration": 7901827,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gdadald9@gmail.com",
      "offset": 13
    }
  ],
  "location": "LoginStepDefiniton.user_enters_username_in_the_username_field(String)"
});
formatter.result({
  "duration": 131681286,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 13
    }
  ],
  "location": "LoginStepDefiniton.user_enters_password_in_the_password_field(String)"
});
formatter.result({
  "duration": 75878606,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefiniton.user_clicks_in_the_signin_button()"
});
formatter.result({
  "duration": 1080205017,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefiniton.user_accesses_dashboard()"
});
formatter.result({
  "duration": 4531950,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefiniton.welcome_message_is_displayed()"
});
formatter.result({
  "duration": 30054540,
  "status": "passed"
});
formatter.after({
  "duration": 81426748,
  "status": "passed"
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
        "1234"
      ],
      "line": 27,
      "id": "login;login-with-invalid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7171198898,
  "status": "passed"
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
  "name": "user enters \"1234\" in the password field",
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
  "location": "LoginStepDefiniton.user_is_on_login_page()"
});
formatter.result({
  "duration": 4811993,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gdadald3@gmail.com",
      "offset": 13
    }
  ],
  "location": "LoginStepDefiniton.user_enters_username_in_the_username_field(String)"
});
formatter.result({
  "duration": 188717921,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 13
    }
  ],
  "location": "LoginStepDefiniton.user_enters_password_in_the_password_field(String)"
});
formatter.result({
  "duration": 60115460,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefiniton.user_clicks_in_the_signin_button()"
});
formatter.result({
  "duration": 756024558,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefiniton.invalid_password_message_is_displayed()"
});
formatter.result({
  "duration": 10753206006,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//li[contains(text(),\u0027Authentication failed.\u0027)]\"}\n  (Session info: chrome\u003d69.0.3497.100)\n  (Driver info: chromedriver\u003d2.41.578706 (5f725d1b4f0a4acbf5259df887244095596231db),platform\u003dMac OS X 10.13.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.13.0\u0027, revision: \u00272f0d292\u0027, time: \u00272018-06-25T15:24:21.231Z\u0027\nSystem info: host: \u0027Guilhermes-MacBook-Pro.local\u0027, ip: \u0027192.168.0.37\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_77\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.41.578706 (5f725d1b4f0a4a..., userDataDir: /var/folders/zg/9b3_1zn573j...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:65246}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 69.0.3497.100, webStorageEnabled: true}\nSession ID: ffd3496f905152b31d1a2470a51d560d\n*** Element info: {Using\u003dxpath, value\u003d//li[contains(text(),\u0027Authentication failed.\u0027)]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.lambda$new$1(EventFiringWebDriver.java:105)\n\tat com.sun.proxy.$Proxy18.findElement(Unknown Source)\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.findElement(EventFiringWebDriver.java:194)\n\tat com.automationpractice.pages.LoginPage.authenticationFailedMsg(LoginPage.java:96)\n\tat cucumber.runner.LoginStepDefiniton.invalid_password_message_is_displayed(LoginStepDefiniton.java:69)\n\tat ✽.Then invalid password message is displayed(Login.feature:23)\n",
  "status": "failed"
});
formatter.after({
  "duration": 87266191,
  "status": "passed"
});
});