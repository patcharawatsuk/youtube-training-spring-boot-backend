package com.iamnbty.training.backend.business;

import com.iamnbty.training.backend.exception.BaseException;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmailBusinessTest {

    @Autowired
    private EmailBusiness emailBusiness;

    @Order(1)
    @Test
    void sendActivateUserEmail() throws BaseException {
        emailBusiness.sendActivateUserEmail(TestData.mailTo, TestData.name, TestData.token);
    }


    interface TestData {
        String mailTo = "patcharawat.d@gmail.com";
        String name = "Patcharawat Sukruk";
        String token = "donutpassword123456789";
    }
}