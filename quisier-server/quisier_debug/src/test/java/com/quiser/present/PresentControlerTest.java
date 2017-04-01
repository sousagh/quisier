package com.quiser.present;

import com.quiser.business.UserInfo;
import com.quiser.business.UserType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by yf_zh on 3/31/2017.
 */
public class PresentControlerTest {
    private WrapRP wrapRPTrue;
    private UserInfo userInfo;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void getResultTest() {
        wrapRPTrue = new WrapRP() {
            @Override
            public void save(UserInfo userinfo) {
                System.out.println("OK");
                return;
            }


            @Override
            public UserInfo findByEmail(String email) {
                return null;
            }
        };
        userInfo = new UserInfo("adb","cd","xxx@hotmail.com","234565", UserType.FACULTY);
        wrapRPTrue.save(userInfo);
        TrueResponse expected = new TrueResponse(true,userInfo);
        Response response = PresentControler.getResult(wrapRPTrue,userInfo);
        assertEquals(expected,response);
    }
}