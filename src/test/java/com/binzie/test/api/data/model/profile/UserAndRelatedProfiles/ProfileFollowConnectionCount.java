package com.binzie.test.api.data.model.profile.UserAndRelatedProfiles;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class ProfileFollowConnectionCount implements Serializable {
    @SerializedName("profileIsSourceCount")
    @Expose
    private Long profileIsSourceCount;
    @SerializedName("profileIsTargetCount")
    @Expose
    private Long profileIsTargetCount;

    public Long getProfileIsSourceCount() {
        return profileIsSourceCount;
    }

    public void setProfileIsSourceCount(Long profileIsSourceCount) {
        this.profileIsSourceCount = profileIsSourceCount;
    }

    public Long getProfileIsTargetCount() {
        return profileIsTargetCount;
    }

    public void setProfileIsTargetCount(Long profileIsTargetCount) {
        this.profileIsTargetCount = profileIsTargetCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("profileIsSourceCount", profileIsSourceCount)
                .append("profileIsTargetCount", profileIsTargetCount)
                .toString();
    }
}
