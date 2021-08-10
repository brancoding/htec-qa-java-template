package com.binzie.test.api.data.model.profile.profileById;

import com.binzie.test.api.data.model.common.StatusResponse;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class ProfileByIdResponse extends StatusResponse implements Serializable {
    private Data data;

    public ProfileByIdResponse(Data data) {
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
