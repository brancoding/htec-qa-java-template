package com.binzie.test.api.functional.suites;

import com.binzie.test.api.calls.ProfileAPI;
import com.binzie.test.api.common.init.TestBase;
import com.binzie.test.api.constants.DataProviderNames;
import com.binzie.test.api.data.model.profile.forgotPassword.ForgotPasswordRequest;
import com.binzie.test.api.data.model.profile.forgotPassword.ForgotPasswordResponse;
import com.binzie.test.api.data.provider.BinProvider;
import com.binzie.test.api.data.provider.ProfileProvider;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static com.binzie.test.api.environment.ConfigSetup.getToken;

public class ProfileFunctionalTests extends TestBase {

    @Test(groups = {"regression", "smoke"}, dataProvider = DataProviderNames.POST_EMAIL_FORGOT_PASSWORD, dataProviderClass = ProfileProvider.class)
    @Description("Code sends to email")
    public void forgotPassword(String email){
        ForgotPasswordRequest request = new ForgotPasswordRequest(email);
        logStep("INFO: Getting code");
        ForgotPasswordResponse forgotPasswordActual = ProfileAPI.forgotPassword(getToken(),request);
        logStep("PASS: Code has been sent");
    }
}
