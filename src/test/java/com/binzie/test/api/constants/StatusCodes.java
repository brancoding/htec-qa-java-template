package com.binzie.test.api.constants;

import com.binzie.test.api.common.init.TestBase;
import io.restassured.response.Response;

public enum StatusCodes
{
    ok (200),
    created (201),
    noContent (204),
    badRequest (400),
    unauthorized (401),
    forbidden (403),
    notFound (404),
    payloadTooLarge (413),
    unsupported (415),
    unprocessable (422),
    serverError (500);


    private final int code;

    StatusCodes(int i)
    {
        this.code = i;
    }

    public static int getIntValue(StatusCodes s)
    {
        return s.code;
    }

    public static void checkStatusAndReport(String funcName, Response response)
    {
        if (response.getStatusCode() == StatusCodes.getIntValue(StatusCodes.ok))
        {
            TestBase.logStep("Good status code for " + funcName);
        }
        else
        {
            String message = "Bad status code for " + funcName + ". Asked for " + StatusCodes.getIntValue(StatusCodes.ok) + "(" + StatusCodes.ok + ")" + " but got " + response.getStatusCode();
            TestBase.logStep(message);
            org.testng.Assert.fail(message);
        }
    }

    public static void checkStatusAndReport(String funcName, Response response, StatusCodes statusCode)
    {
        if (response.getStatusCode() == StatusCodes.getIntValue(statusCode))
        {
            TestBase.logStep("Good status code for " + funcName);
        }
        else
        {
            String message = "Bad status code for " + funcName + ". Asked for " + StatusCodes.getIntValue(statusCode) + "(" + statusCode + ")" + " but got " + response.getStatusCode();
            TestBase.logStep(message);
            org.testng.Assert.fail(message);
        }
    }
}
