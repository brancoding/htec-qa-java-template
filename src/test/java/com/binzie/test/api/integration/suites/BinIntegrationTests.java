package com.binzie.test.api.integration.suites;

import com.binzie.test.api.calls.BinsAPI;
import com.binzie.test.api.integration.asserts.CommonAssert;
import com.binzie.test.api.common.init.TestBase;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static com.binzie.test.api.environment.ConfigSetup.getToken;

// example for integration test
public class BinIntegrationTests extends TestBase  {

    @Test(groups = {"integration"})
    @Description("Verify bin response structure")
    public static void verifyBinById() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(BinsAPI.validateBinById(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Verify comments response structure")
    public static void verifyAllBinsComments() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(BinsAPI.validateAllBinsComments(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Verify bins by profile id structure ")
    public static void verifyBinsByProfileId() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(BinsAPI.validateBinsByProfileId(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Verify search for bin structure")
    public static void verifySearchForBin() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(BinsAPI.validateSearchForBin(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Verify search bin in vault structure")
    public static void verifySearchVaultBin() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(BinsAPI.validateSearchVaultBin(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Verify vaulted bins structure")
    public static void verifyVaultBins() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(BinsAPI.validateVaultBin(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Verify public bin by id structure")
    public static void verifyBinByIdPublicEp() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(BinsAPI.validateBinByIdPublicEp(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Verify structure of carousel assets by type")
    public static void verifyCarouselAssetsByType() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(BinsAPI.validateCarouselAssetsByType(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Verify search for movie assets structure")
    public static void verifySearchForMovieAssets() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(BinsAPI.validateSearchForMovieAssets(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Verify search for show assets structure")
    public static void verifySearchForShowAssets() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(BinsAPI.validateSearchForShowAssets(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Verify structure of search for podcast episodes assets ")
    public static void verifySearchForPodcastEpisodeAssets() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(BinsAPI.validateSearchForPodcastEpisodeAssets(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Verify structure of search for podcast show assets ")
    public static void verifySearchForPodcastShowAssets() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(BinsAPI.validateSearchForPodcastShowAssets(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Verify structure of search for podcast assets")
    public static void verifySearchForPodcastAssets() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(BinsAPI.validateSearchForPodcastAssets(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Verify structure of search for album assets")
    public static void verifySearchForAlbumAssets() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(BinsAPI.validateSearchForAlbumAssets(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Verify structure of search for artist assets")
    public static void verifySearchForArtistAssets() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(BinsAPI.validateSearchForArtistAssets(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Verify structure for search for song assets")
    public static void verifySearchForSongAssets() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(BinsAPI.validateSearchForSongAssets(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Verify structure for search for music assets")
    public static void verifySearchForMusicAssets() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(BinsAPI.validateSearchForMusicAssets(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Verify structure for search of vaulted assets ")
    public static void verifyVaultAssets() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(BinsAPI.validateVaultAssets(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Verify feed community structure")
    public static void verifyFeedCommunity() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(BinsAPI.validateFeedCommunity(getToken()));
        logStep("PASS: Required fields are verified");
    }

    @Test(groups = {"integration"})
    @Description("Allure description for this test")
    public static void verifyFeedFollowing() {
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(BinsAPI.validateFeedFollowing(getToken()));
        logStep("PASS: Required fields are verified");
    }

}
