package com.automationpractice.tests.login;

import org.testng.annotations.Test;

import static com.automationpractice.constants.UserCredentialsConstants.*;
import static org.testng.Assert.assertTrue;

public class NegativeLoginTest extends LoginPageSetup {

    @Test
    public void loginFailedInvalidEmailTest() {
        loginPage.doLogin(USERNAME_INVALID, PASSWORD_VALID);

        assertTrue(loginPage.errorAlert().contains("There is 1 error"));
        assertTrue(loginPage.authenticationFailedMsg().contains("Authentication failed."));
        assertTrue(loginPage.getLoginPageTitle().contains("Login - My Store"));
    }

    @Test
    public void loginFailedInvalidPasswordTest() {
        loginPage.doLogin(USERNAME_VALID, PASSWORD_INVALID);

        assertTrue(loginPage.errorAlert().contains("There is 1 error"));
        assertTrue(loginPage.authenticationFailedMsg().contains("Authentication failed."));
        assertTrue(loginPage.getLoginPageTitle().contains("Login - My Store"));
    }
}

