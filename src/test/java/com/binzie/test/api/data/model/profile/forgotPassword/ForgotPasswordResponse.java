package com.binzie.test.api.data.model.profile.forgotPassword;

import com.binzie.test.api.data.model.common.ResponseHelper;
import com.binzie.test.api.data.model.common.StatusResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class ForgotPasswordResponse extends StatusResponse implements Serializable, ResponseHelper {

    @SerializedName("data")
    @Expose
    private Data data;

    public ForgotPasswordResponse(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("data", data)
                .toString();
    }
}
