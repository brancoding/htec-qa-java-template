package com.binzie.test.api.calls;

import com.binzie.test.api.common.GsonFunctions;
import com.binzie.test.api.common.ResponseValidation;
import com.binzie.test.api.common.RestAssuredFunctions;
import com.binzie.test.api.constants.StatusCodes;
import com.binzie.test.api.constants.endpoints.BinsApiEndpoints;
import com.binzie.test.api.constants.endpoints.ProfileApiEndpoints;
import com.binzie.test.api.data.model.bin.comment.AddCommentRequest;
import com.binzie.test.api.data.model.bin.comment.AddCommentResponse;
import com.binzie.test.api.data.model.profile.UserAndRelatedProfiles.UserAndRelatedProfilesResponse;
import com.binzie.test.api.data.model.profile.amIfollowing.AmIfollowingResponse;
import com.binzie.test.api.data.model.profile.forgotPassword.ForgotPasswordRequest;
import com.binzie.test.api.data.model.profile.forgotPassword.ForgotPasswordResponse;
import com.binzie.test.api.data.model.profile.isUserFollower.IsUserFollowerResponse;
import com.binzie.test.api.data.model.profile.myFollowees.MyFolloweesResponse;
import com.binzie.test.api.data.model.profile.myFollowers.MyFollowersResponse;
import com.binzie.test.api.data.model.profile.profileById.ProfileByIdResponse;
import com.binzie.test.api.data.model.profile.profileByIdPublic.ProfileByIdPublicResponse;
import com.binzie.test.api.data.model.profile.profilesFollowees.ProfileFolloweesResponse;
import com.binzie.test.api.data.model.profile.profilesFollowers.ProfileFollowersResponse;
import com.binzie.test.api.data.model.profile.searchForProfiles.SearchForProfilesResponse;
import io.restassured.response.Response;

//Methods that help parse json into model classes
public class ProfileAPI {

    public static ResponseValidation validateAmIfollowing (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, ProfileApiEndpoints.GET_AM_I_FOLLOWING).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, AmIfollowingResponse.class);
    }

    public static ResponseValidation validateIsUserFollower (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, ProfileApiEndpoints.GET_IS_USER_FOLLOWER).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, IsUserFollowerResponse.class);
    }

    public static ResponseValidation validateMyFollowees (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, ProfileApiEndpoints.GET_LIST_OF_MY_FOLLOWEES).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, MyFolloweesResponse.class);
    }

    public static ResponseValidation validateMyFollowers (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, ProfileApiEndpoints.GET_LIST_OF_MY_FOLLOWERS).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, MyFollowersResponse.class);
    }

    public static ResponseValidation validateProfileFollowees (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, ProfileApiEndpoints.GET_LIST_OF_PROFILES_FOLLOWEES).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, ProfileFolloweesResponse.class);
    }

    public static ResponseValidation validateProfileFollowers (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, ProfileApiEndpoints.GET_LIST_OF_PROFILES_FOLLOWERS).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, ProfileFollowersResponse.class);
    }

    public static ResponseValidation validateProfileById (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, ProfileApiEndpoints.GET_PROFILE_BY_ID).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, ProfileByIdResponse.class);
    }

    public static ResponseValidation validateSearchForProfiles (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, ProfileApiEndpoints.GET_SEARCH_FOR_PROFILES).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, SearchForProfilesResponse.class);
    }

    public static ResponseValidation validateProfileByIdPublic (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, ProfileApiEndpoints.GET_PROFILE_BY_ID_PUBLIC).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, ProfileByIdPublicResponse.class);
    }

    public static ResponseValidation validateUserAndRelatedProfiles (String accessToken){
        String jsonResponse = RestAssuredFunctions.get(accessToken, ProfileApiEndpoints.GET_USER_AND_RELATED_PROFILES).body().asString();
        return GsonFunctions.verifyResponse(jsonResponse, UserAndRelatedProfilesResponse.class);
    }


    public static ForgotPasswordResponse forgotPassword(String accessToken, ForgotPasswordRequest request) {
        Response response = RestAssuredFunctions.post(request, accessToken, ProfileApiEndpoints.POST_EMAIL_FORGOT_PASSWORD);
        StatusCodes.checkStatusAndReport("Reset password", response);
        System.out.println(response.asString());
        String jsonResponse = response.body().asString();
        return GsonFunctions.parseSuccessResponseToModel(jsonResponse, ForgotPasswordResponse.class);
    }

}
