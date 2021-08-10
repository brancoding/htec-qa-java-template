package com.binzie.test.api.functional.suites;

import com.binzie.test.api.calls.BinsAPI;
import com.binzie.test.api.common.init.TestBase;
import com.binzie.test.api.constants.DataProviderNames;
import com.binzie.test.api.data.model.bin.AssetToVault.addAssetToVault.request.AddAssetToVaultRequest;
import com.binzie.test.api.data.model.bin.AssetToVault.addAssetToVault.request.AssetImagesInfo;
import com.binzie.test.api.data.model.bin.AssetToVault.addAssetToVault.response.AddAssetToVaultResponse;
import com.binzie.test.api.data.model.bin.binToVault.add.AddBinToVaultRequest;
import com.binzie.test.api.data.model.bin.binToVault.add.AddBinToVaultResponse;
import com.binzie.test.api.data.model.bin.comment.AddCommentRequest;
import com.binzie.test.api.data.model.bin.comment.AddCommentResponse;
import com.binzie.test.api.data.model.bin.comment.like.LikeCommentRequest;
import com.binzie.test.api.data.model.bin.comment.like.LikeCommentResponse;
import com.binzie.test.api.data.model.bin.comment.unlike.UnlikeCommentRequest;
import com.binzie.test.api.data.model.bin.comment.unlike.UnlikeCommentResponse;
import com.binzie.test.api.data.model.bin.likeUnlikeBin.like.LikeABinRequest;
import com.binzie.test.api.data.model.bin.likeUnlikeBin.like.LikeABinResponse;
import com.binzie.test.api.data.model.bin.likeUnlikeBin.unlike.UnlikeABinRequest;
import com.binzie.test.api.data.model.bin.likeUnlikeBin.unlike.UnlikeABinResponse;
import com.binzie.test.api.data.provider.BinProvider;
import com.binzie.test.api.integration.asserts.CommonAssert;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static com.binzie.test.api.environment.ConfigSetup.getToken;


public class FunctionalTests extends TestBase{
    private String commentId;

    @Test(groups = {"regression", "smoke"}, dataProvider = DataProviderNames.POST_COMMENT, dataProviderClass = BinProvider.class, priority = 1)
    @Description("Adding a comment to the bin")
    public void addComment(String text){
        AddCommentRequest request = new AddCommentRequest(text);
        logStep("INFO: Adding a comment");
        AddCommentResponse addCommentActual = BinsAPI.addComment(getToken(), request);
        commentId = addCommentActual.getData().getComment().getId();
        logStep("PASS: Comment is created");
    }

    @Test(groups = {"regression", "smoke"}, priority = 2)
    @Description("Delete a comment")
    public void deleteCommentById(){
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(BinsAPI.deleteComment(getToken(), commentId));
        logStep("Pass: Required fields are verified");
    }

    @Test(groups = {"regression", "smoke"}, dataProvider = DataProviderNames.POST_BIN_TO_VAULT, dataProviderClass = BinProvider.class, priority = 1)
    @Description("Adding a bin to the vault")
    public void addBinToVault(){
        AddBinToVaultRequest addBinRequest = new AddBinToVaultRequest();
        logStep("INFO: Adding a bin in your vault");
        AddBinToVaultResponse addBinToVaultActual = BinsAPI.addBinToVault(getToken(), addBinRequest);
        logStep("PASS: Bin has been added to your vault");
    }


    @Test(groups = {"regression", "smoke"}, priority = 2)
    @Description("Remove a bin from your vault")
    public void deleteBinFromVault(){
        logStep("INFO: Verify required fields");
        new CommonAssert().assertResponseStructure(BinsAPI.removeBinFromVault(getToken()));
        logStep("Pass: Required fields are verified");
    }


    @Test(groups = {"regression", "smoke"}, dataProvider = DataProviderNames.POST_LIKE_ON_COMMENT, dataProviderClass = BinProvider.class, priority = 1)
    @Description("Like a comment")
    public void likeAComment(){
        LikeCommentRequest likeCommentRequest = new LikeCommentRequest();
        logStep("INFO: Liking a comment");
        LikeCommentResponse likeCommentActual = BinsAPI.likeAComment(getToken(), likeCommentRequest);
        logStep("PASS: Comment has been liked");
    }

    @Test(groups = {"regression", "smoke"}, dataProvider = DataProviderNames.POST_UNLIKE_ON_COMMENT, dataProviderClass = BinProvider.class, priority = 2)
    @Description("Unlike a comment")
    public void unlikeAComment(){
        UnlikeCommentRequest unlikeCommentRequest = new UnlikeCommentRequest();
        logStep("INFO: Unliking a comment");
        UnlikeCommentResponse unlikeCommentActual = BinsAPI.unlikeAComment(getToken(), unlikeCommentRequest);
        logStep("PASS: Comment has been unliked");
    }


    @Test(groups = {"regression", "smoke"}, dataProvider = DataProviderNames.POST_LIKE_ON_BIN, dataProviderClass = BinProvider.class, priority = 1)
    @Description("Like a bin")
    public void likeABin(){
        LikeABinRequest likeABinRequest = new LikeABinRequest();
        logStep("INFO: Liking a bin");
        LikeABinResponse likeBinActual = BinsAPI.likeABin(getToken(), likeABinRequest);
        logStep("PASS: Bin has been liked");
    }

    @Test(groups = {"regression", "smoke"}, dataProvider = DataProviderNames.POST_UNLIKE_ON_BIN, dataProviderClass = BinProvider.class, priority = 2)
    @Description("Unlike a bin")
    public void unlikeABin(){
        UnlikeABinRequest unlikeABinRequest = new UnlikeABinRequest();
        logStep("INFO: Unliking a bin");
        UnlikeABinResponse unlikeABinActual = BinsAPI.unlikeABin(getToken(), unlikeABinRequest);
        logStep("PASS: Bin has been unliked");
    }






}
