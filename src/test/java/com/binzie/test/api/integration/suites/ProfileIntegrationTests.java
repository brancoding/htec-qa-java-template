package com.binzie.test.api.integration.suites;


import com.binzie.test.api.calls.ProfileAPI;
import com.binzie.test.api.common.init.TestBase;
import com.binzie.test.api.integration.asserts.CommonAssert;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static com.binzie.test.api.environment.ConfigSetup.getToken;

// example for integration test
public class ProfileIntegrationTests extends TestBase {

    @Test(groups = {"integration"})
    @Description("Allure description for this test")
    public static void verifyAmIfollowing() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(ProfileAPI.validateAmIfollowing(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Allure description for this test")
    public static void verifyIsUserFollower() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(ProfileAPI.validateIsUserFollower(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Allure description for this test")
    public static void verifyMyFollowees() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(ProfileAPI.validateMyFollowees(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Allure description for this test")
    public static void verifyMyFollowers() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(ProfileAPI.validateMyFollowers(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Allure description for this test")
    public static void verifyProfileFollowees() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(ProfileAPI.validateProfileFollowees(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Allure description for this test")
    public static void verifyProfileFollowers() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(ProfileAPI.validateProfileFollowers(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Allure description for this test")
    public static void verifyProfileById() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(ProfileAPI.validateProfileById(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Allure description for this test")
    public static void verifySearchForProfiles() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(ProfileAPI.validateSearchForProfiles(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Allure description for this test")
    public static void verifyProfileByIdPublic() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(ProfileAPI.validateProfileByIdPublic(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Allure description for this test")
    public static void verifyUserAndRelatedProfiles() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(ProfileAPI.validateUserAndRelatedProfiles(getToken()));
        logStep("PASS: Required fields are verified");
    }
}
