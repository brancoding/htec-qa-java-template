package com.binzie.test.api.calls;

import com.binzie.test.api.common.GsonFunctions;
import com.binzie.test.api.common.ResponseValidation;
import com.binzie.test.api.common.RestAssuredFunctions;
import com.binzie.test.api.constants.StatusCodes;
import com.binzie.test.api.constants.endpoints.BinsApiEndpoints;
import com.binzie.test.api.data.model.bin.AssetToVault.addAssetToVault.request.AddAssetToVaultRequest;
import com.binzie.test.api.data.model.bin.AssetToVault.addAssetToVault.response.AddAssetToVaultResponse;
import com.binzie.test.api.data.model.bin.binToVault.add.AddBinToVaultRequest;
import com.binzie.test.api.data.model.bin.binToVault.add.AddBinToVaultResponse;
import com.binzie.test.api.data.model.bin.binToVault.remove.RemoveBinFromVaultResponse;
import com.binzie.test.api.data.model.bin.comment.AddCommentRequest;
import com.binzie.test.api.data.model.bin.comment.AddCommentResponse;
import com.binzie.test.api.data.model.bin.allBinsComments.AllBinsCommentsResponse;
import com.binzie.test.api.data.model.bin.binById.BinByIdResponse;
import com.binzie.test.api.data.model.bin.binByIdPublicEp.BinByIdPublicEpResponse;
import com.binzie.test.api.data.model.bin.binsByProfileId.BinsByProfileIdResponse;
import com.binzie.test.api.data.model.bin.carouselAssetsByType.CarouselAssetsByTypeResponse;
import com.binzie.test.api.data.model.bin.comment.delete.DeleteCommentResponse;
import com.binzie.test.api.data.model.bin.comment.like.LikeCommentRequest;
import com.binzie.test.api.data.model.bin.comment.like.LikeCommentResponse;
import com.binzie.test.api.data.model.bin.comment.unlike.UnlikeCommentRequest;
import com.binzie.test.api.data.model.bin.comment.unlike.UnlikeCommentResponse;
import com.binzie.test.api.data.model.bin.feedCommunity.FeedCommunityResponse;
import com.binzie.test.api.data.model.bin.feedFollowing.FeedFollowingResponse;
import com.binzie.test.api.data.model.bin.likeUnlikeBin.like.LikeABinRequest;
import com.binzie.test.api.data.model.bin.likeUnlikeBin.like.LikeABinResponse;
import com.binzie.test.api.data.model.bin.likeUnlikeBin.unlike.UnlikeABinRequest;
import com.binzie.test.api.data.model.bin.likeUnlikeBin.unlike.UnlikeABinResponse;
import com.binzie.test.api.data.model.bin.searchForAlbumAssets.SearchForAlbumAssetsResponse;
import com.binzie.test.api.data.model.bin.searchForArtistAssets.SearchForArtistAssetsResponse;
import com.binzie.test.api.data.model.bin.searchForBin.SearchForBinResponse;
import com.binzie.test.api.data.model.bin.searchForMovieAssets.SearchForMovieAssetsResponse;
import com.binzie.test.api.data.model.bin.searchForMusicAssets.SearchForMusicAssetsResponse;
import com.binzie.test.api.data.model.bin.searchForPodcastAssets.SearchForPodcastAssetsResponse;
import com.binzie.test.api.data.model.bin.searchForPodcastEpisodeAssets.SearchForPodcastEpisodeAssetsResponse;
import com.binzie.test.api.data.model.bin.searchForPodcastShowAssets.SearchForPodcastShowAssetsResponse;
import com.binzie.test.api.data.model.bin.searchForShowAssets.SearchForShowAssetsResponse;
import com.binzie.test.api.data.model.bin.searchForSongAssets.SearchForSongAssetsResponse;
import com.binzie.test.api.data.model.bin.searchVaultBins.SearchVaultBinResponse;
import com.binzie.test.api.data.model.bin.vaultAssets.VaultAssetsResponse;
import com.binzie.test.api.data.model.bin.vaultBins.VaultBinsResponse;
import io.restassured.response.Response;

//Methods that help parse json into model classes
public class BinsAPI {

    //Method used to parse and validate response for Integration tests
    public static ResponseValidation validateBinById(String accessToken) {
        String jsonResponse = RestAssuredFunctions.get(accessToken, BinsApiEndpoints.GET_BIN_BY_ID).body().asString();
        System.out.println(jsonResponse);
        return GsonFunctions.verifyResponse(jsonResponse, BinByIdResponse.class);
    }

    public static ResponseValidation validateAllBinsComments (String accessToken) {
        String jsonResponse = RestAssuredFunctions.get(accessToken, BinsApiEndpoints.GET_ALL_BINS_COMMENTS).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, AllBinsCommentsResponse.class);
    }

    public static ResponseValidation validateBinsByProfileId (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, BinsApiEndpoints.GET_BINS_BY_PROFILE_ID).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, BinsByProfileIdResponse.class);
    }

    public static ResponseValidation validateSearchForBin (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, BinsApiEndpoints.GET_SEARCH_FOR_BINS).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, SearchForBinResponse.class);
    }

    public static ResponseValidation validateSearchVaultBin (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, BinsApiEndpoints.GET_SEARCH_VAULT_BINS).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, SearchVaultBinResponse.class);
    }

    public static ResponseValidation validateVaultBin (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, BinsApiEndpoints.GET_VAULT_BINS).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, VaultBinsResponse.class);
    }

    public static ResponseValidation validateBinByIdPublicEp (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, BinsApiEndpoints.GET_BIN_BY_ID_PUBLIC_EP).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, BinByIdPublicEpResponse.class);
    }

    public static ResponseValidation validateCarouselAssetsByType (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, BinsApiEndpoints.GET_CAROUSEL_ASSETS_BY_TYPE).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, CarouselAssetsByTypeResponse.class);
    }

    public static ResponseValidation validateSearchForMovieAssets (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, BinsApiEndpoints.GET_SEARCH_FOR_MOVIE_ASSETS).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, SearchForMovieAssetsResponse.class);
    }

    public static ResponseValidation validateSearchForShowAssets (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, BinsApiEndpoints.GET_SEARCH_FOR_SHOW_ASSETS).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, SearchForShowAssetsResponse.class);
    }

    public static ResponseValidation validateSearchForPodcastEpisodeAssets (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, BinsApiEndpoints.GET_SEARCH_FOR_PODCAST_EPISODE_ASSETS).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, SearchForPodcastEpisodeAssetsResponse.class);
    }

    public static ResponseValidation validateSearchForPodcastShowAssets (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, BinsApiEndpoints.GET_SEARCH_FOR_PODCAST_SHOW_ASSETS).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, SearchForPodcastShowAssetsResponse.class);
    }

    public static ResponseValidation validateSearchForPodcastAssets (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, BinsApiEndpoints.GET_SEARCH_FOR_PODCAST_ASSETS).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, SearchForPodcastAssetsResponse.class);
    }

    public static ResponseValidation validateSearchForAlbumAssets (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, BinsApiEndpoints.GET_SEARCH_ALBUM_ASSETS).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, SearchForAlbumAssetsResponse.class);
    }

    public static ResponseValidation validateSearchForArtistAssets (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, BinsApiEndpoints.GET_SEARCH_ARTIST_ASSETS).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, SearchForArtistAssetsResponse.class);
    }

    public static ResponseValidation validateSearchForSongAssets (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, BinsApiEndpoints.GET_SEARCH_SONG_ASSETS).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, SearchForSongAssetsResponse.class);
    }

    public static ResponseValidation validateSearchForMusicAssets (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, BinsApiEndpoints.GET_SEARCH_MUSIC_ASSETS).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, SearchForMusicAssetsResponse.class);
    }

    public static ResponseValidation validateVaultAssets (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, BinsApiEndpoints.GET_VAULT_ASSETS).body().asString();
        System.out.println(jsonResponse);
        return GsonFunctions.verifyResponse(jsonResponse, VaultAssetsResponse.class);
    }

    public static ResponseValidation validateFeedCommunity (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, BinsApiEndpoints.GET_COMMUNITY_FEED).body().asString();
        System.out.println(jsonResponse);
        return GsonFunctions.verifyResponse(jsonResponse, FeedCommunityResponse.class);
    }

    public static ResponseValidation validateFeedFollowing (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, BinsApiEndpoints.GET_FOLLOWING_FEED).body().asString();
        System.out.println(jsonResponse);
        return GsonFunctions.verifyResponse(jsonResponse, FeedFollowingResponse.class);
    }



    public static AddCommentResponse addComment(String accessToken, AddCommentRequest request) {
        Response response = RestAssuredFunctions.post(request, accessToken, BinsApiEndpoints.POST_COMMENT);
        StatusCodes.checkStatusAndReport("Add Comment", response);
        System.out.println(response.asString());
        String jsonResponse = response.body().asString();
        return GsonFunctions.parseSuccessResponseToModel(jsonResponse, AddCommentResponse.class);
    }

    public static ResponseValidation deleteComment(String accessToken, String commentId){
        Response response = RestAssuredFunctions.delete(accessToken, BinsApiEndpoints.DELETE_COMMENT(commentId));
        StatusCodes.checkStatusAndReport("Delete Comment", response);
        System.out.println(response.asString());
        String jsonResponse = response.body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, DeleteCommentResponse.class);
    }


    public static AddBinToVaultResponse addBinToVault(String accessToken, AddBinToVaultRequest request) {
        Response response = RestAssuredFunctions.post(request, accessToken, BinsApiEndpoints.POST_BIN_TO_VAULT);
        StatusCodes.checkStatusAndReport("Add bin to your vault", response);
        System.out.println(response.asString());
        String jsonResponse = response.body().asString();
        return GsonFunctions.parseSuccessResponseToModel(jsonResponse, AddBinToVaultResponse.class);
    }

    public static ResponseValidation removeBinFromVault(String accessToken){
        Response response = RestAssuredFunctions.delete(accessToken, BinsApiEndpoints.DELETE_BIN_FROM_VAULT);
        StatusCodes.checkStatusAndReport("Delete Bin from vault", response);
        System.out.println(response.asString());
        String jsonResponse = response.body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, RemoveBinFromVaultResponse.class);
    }


    public static LikeCommentResponse likeAComment(String accessToken, LikeCommentRequest request) {
        Response response = RestAssuredFunctions.post(request, accessToken, BinsApiEndpoints.POST_LIKE_ON_COMMENT);
        StatusCodes.checkStatusAndReport("Like a comment", response);
        System.out.println(response.asString());
        String jsonResponse = response.body().asString();
        return GsonFunctions.parseSuccessResponseToModel(jsonResponse, LikeCommentResponse.class);
    }

    public static UnlikeCommentResponse unlikeAComment(String accessToken, UnlikeCommentRequest request) {
        Response response = RestAssuredFunctions.post(request, accessToken, BinsApiEndpoints.POST_UNLIKE_ON_COMMENT);
        StatusCodes.checkStatusAndReport("Unlike a comment", response);
        System.out.println(response.asString());
        String jsonResponse = response.body().asString();
        return GsonFunctions.parseSuccessResponseToModel(jsonResponse, UnlikeCommentResponse.class);
    }

    public static LikeABinResponse likeABin(String accessToken, LikeABinRequest request) {
        Response response = RestAssuredFunctions.post(request, accessToken, BinsApiEndpoints.POST_LIKE_ON_BIN);
        StatusCodes.checkStatusAndReport("Like a bin", response);
        System.out.println(response.asString());
        String jsonResponse = response.body().asString();
        return GsonFunctions.parseSuccessResponseToModel(jsonResponse, LikeABinResponse.class);
    }

    public static UnlikeABinResponse unlikeABin(String accessToken, UnlikeABinRequest request) {
        Response response = RestAssuredFunctions.post(request, accessToken, BinsApiEndpoints.POST_UNLIKE_ON_BIN);
        StatusCodes.checkStatusAndReport("Unlike a bin", response);
        System.out.println(response.asString());
        String jsonResponse = response.body().asString();
        return GsonFunctions.parseSuccessResponseToModel(jsonResponse, UnlikeABinResponse.class);
    }







}

