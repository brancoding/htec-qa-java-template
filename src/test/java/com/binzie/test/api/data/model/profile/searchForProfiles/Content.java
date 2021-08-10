package com.binzie.test.api.data.model.profile.searchForProfiles;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Content implements Serializable {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("alias")
    @Expose
    private String alias;
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("profilePhotoUrl")
    @Expose
    private String profilePhotoUrl;
    @SerializedName("following")
    @Expose
    private Boolean following;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getProfilePhotoUrl() {
        return profilePhotoUrl;
    }

    public void setProfilePhotoUrl(String profilePhotoUrl) {
        this.profilePhotoUrl = profilePhotoUrl;
    }

    public Boolean getFollowing() {
        return following;
    }

    public void setFollowing(Boolean following) {
        this.following = following;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("alias", alias)
                .append("fullName", fullName)
                .append("profilePhotoUrl", profilePhotoUrl)
                .append("following", following)
                .toString();
    }
}
