package com.binzie.test.api.data.provider;

import com.binzie.test.api.constants.DataProviderNames;
import org.testng.annotations.DataProvider;

public class BinProvider {

    @DataProvider(name = DataProviderNames.POST_COMMENT)
    public static Object[][] postComment(){
        return new Object[][]{
                {
                    "Comment? "
                }
        };
    }

    @DataProvider(name = DataProviderNames.POST_BIN_TO_VAULT)
    public static Object[][] postBinToVault(){
        return new Object[][]{
                {

                }

        };
    }


    @DataProvider(name = DataProviderNames.POST_LIKE_ON_COMMENT)
    public static Object[][] postLikeOnComment(){
        return new Object[][]{
                {

                }

        };
    }

    @DataProvider(name = DataProviderNames.POST_UNLIKE_ON_COMMENT)
    public static Object[][] postUnlikeOnComment(){
        return new Object[][]{
                {

                }

        };
    }

    @DataProvider(name = DataProviderNames.POST_LIKE_ON_BIN)
    public static Object[][] postLikeOnBin(){
        return new Object[][]{
                {

                }

        };
    }

    @DataProvider(name = DataProviderNames.POST_UNLIKE_ON_BIN)
    public static Object[][] postUnlikeOnBin(){
        return new Object[][]{
                {

                }

        };
    }





}
