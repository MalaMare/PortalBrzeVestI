/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signatures;

import framework.Configuration;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pages.DashboardPage;
import pages.LoginPage;
import pages.SignaturesPage;


public class TestSignatures {
    
    private static LoginPage loginPage;
    private static DashboardPage dashboardPage;
    private static SignaturesPage signaturesPage;
    
    
    @BeforeClass
    public static void setUpClass() throws IOException {
        Configuration.init();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login();
    }
    
    @AfterClass
    public static void tearDownClass() throws InterruptedException {
        Thread.sleep(3000);
        loginPage.quitDriver();
    }
    
    @Before
    public void setUp() {
        signaturesPage = dashboardPage.goToSignatures();
    }
    
    @After
    public void tearDown() {
    }


     @Test
     public void hello() {
     
     }


}
