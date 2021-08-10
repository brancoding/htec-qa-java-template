package com.binzie.test.api.data.model.profile.isUserFollower;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Data implements Serializable {
    @SerializedName("followed")
    @Expose
    private Boolean followed;

    public Boolean getFollowed() {
        return followed;
    }

    public void setFollowed(Boolean followed) {
        this.followed = followed;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("followed", followed)
                .toString();
    }
}
