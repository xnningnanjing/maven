package com.pinnet.auto720.basepage;

import org.testng.annotations.Test;

/**
 * Created by nnj on 2017/8/19.
 */
public class TestLogin {
    @Test
    public void testCase1(){
        Login login = new Login();
        login.login();
    }
}
