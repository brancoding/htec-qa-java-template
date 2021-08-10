package com.example.test.performance;

import com.example.test.api.calls.ExampleAPI;
import com.example.test.api.common.init.TestBase;
import com.example.test.api.data.model.example.ExampleRequest;
import org.testng.annotations.Test;

public class PrepareDataForTests extends TestBase {

    //If you are doing performance benchmarking and you need to prepare data you can reuse testng and your written API methods
    //to generate those data automatically before you start performance tests. If you are using jenkins for example first run this job and
    //if it failed then abort execution of performance tests
    @Test(groups = {"performance"})
    public void prepareTestData() {
        logStep("INFO: Add new data for performance user");
        ExampleAPI.createExample("accessToken", new ExampleRequest());
        logStep("PASS: Data is added");
    }
}
