package com.binzie.test.api.data.provider;

import com.binzie.test.api.constants.DataProviderNames;
import org.testng.annotations.DataProvider;

public class ProfileProvider {

    @DataProvider(name = DataProviderNames.POST_EMAIL_FORGOT_PASSWORD)
    public static Object[][] postEmailForgotPassword() {
        return new Object[][]{
                {
                        "nevena.tatalovic@htecgroup.com"
                }
        };
    }
}
