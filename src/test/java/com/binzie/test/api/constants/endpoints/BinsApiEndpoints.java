package com.binzie.test.api.constants.endpoints;

//List of endpoint as constants
public class BinsApiEndpoints {

    public static final String GET_BIN_BY_ID_PUBLIC_EP = "public/bin/973/v1";
    public static final String GET_BIN_BY_ID = "bin/935/profile/423/v1";
    public static final String GET_BINS_BY_PROFILE_ID = "profile/423/bin/profile/425/v1";
    public static final String GET_ALL_BINS_COMMENTS = "bin/935/comment/profile/423/v1";
    public static final String GET_CAROUSEL_ASSETS_BY_TYPE = "asset/carousel/profile/407/v1?type=MOVIE";

    //VAULT
    public static final String GET_VAULT_BINS = "bin/vault/profile/423/v1";
    public static final String GET_SEARCH_VAULT_BINS = "search/bins/vault/profile/423/v1?q=cr";
    public static final String GET_VAULT_ASSETS = "asset/vault/profile/423/type/MOVIE/v1";

    //FEED
    public static final String GET_COMMUNITY_FEED = "bin/community-feed/profile/423/v1";
    public static final String GET_FOLLOWING_FEED = "bin/following-feed/profile/423/v1";

    //SEARCH EP
    public static final String GET_SEARCH_FOR_BINS = "search/bins/v1?q=test";
    public static final String GET_SEARCH_FOR_MOVIE_ASSETS = "search/movies/v1?q=titanic";
    public static final String GET_SEARCH_FOR_SHOW_ASSETS = "search/tv/v1?q=test";
    public static final String GET_SEARCH_FOR_PODCAST_EPISODE_ASSETS = "search/podcasts/episodes/v1?q=Elon";
    public static final String GET_SEARCH_FOR_PODCAST_SHOW_ASSETS = "search/podcasts/shows/v1?q=HTEC";
    public static final String GET_SEARCH_FOR_PODCAST_ASSETS = "search/podcasts/v1?q=Joe";
    public static final String GET_SEARCH_ALBUM_ASSETS = "search/music/albums/v1?q=Beetles";
    public static final String GET_SEARCH_ARTIST_ASSETS = "search/music/artists/v1?q=Selena";
    public static final String GET_SEARCH_SONG_ASSETS = "search/music/songs/v1?q=Symphony";
    public static final String GET_SEARCH_MUSIC_ASSETS = "search/music/v1?q=Love";

    //POST and DELETE
    public static final String POST_COMMENT = "bin/1002/comment/profile/423/v1";
    public static String DELETE_COMMENT (String commentId){
        return "comment/" + commentId + "/profile/423/v1";
    };

    public static final String POST_BIN_TO_VAULT = "bin/1002/vault/profile/423/v1";
    public static String DELETE_BIN_FROM_VAULT = "bin/1002/vault/profile/423/v1";

    public static final String POST_LIKE_ON_COMMENT = "comment/1750/like/profile/423/v1";
    public static final String POST_UNLIKE_ON_COMMENT= "comment/1750/unlike/profile/423/v1";

    public static final String POST_LIKE_ON_BIN = "bin/974/like/profile/423/v1";
    public static final String POST_UNLIKE_ON_BIN= "bin/974/unlike/profile/423/v1";




}
