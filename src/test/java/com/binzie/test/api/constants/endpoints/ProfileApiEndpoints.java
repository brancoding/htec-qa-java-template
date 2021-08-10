package com.binzie.test.api.constants.endpoints;

//List of endpoint as constants
public class ProfileApiEndpoints {

    public static final String GET_IS_USER_FOLLOWER = "profile/423/followee-of/407/v1";
    public static final String GET_AM_I_FOLLOWING = "profile/423/follower-of/407/v1";
    public static final String GET_LIST_OF_MY_FOLLOWEES = "profile/423/followees/v1";
    public static final String GET_LIST_OF_MY_FOLLOWERS = "profile/423/followers/v1";
    public static final String GET_LIST_OF_PROFILES_FOLLOWEES = "profile/423/profile/407/followees/v1";
    public static final String GET_LIST_OF_PROFILES_FOLLOWERS = "profile/423/profile/407/followers/v1";
    public static final String GET_PROFILE_BY_ID = "profile/423/profile/412/v1";
    public static final String GET_PROFILE_BY_ID_PUBLIC = "public/profile/423/v1";
    public static final String GET_USER_AND_RELATED_PROFILES = "profile/v1";
    public static final String GET_SEARCH_FOR_PROFILES = "search/profile/423/v1?q=QA";


    //POST
    public static final String POST_EMAIL_FORGOT_PASSWORD = "public/user/forgot-password-with-code/v1";

}
