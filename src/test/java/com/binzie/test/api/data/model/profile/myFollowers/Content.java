package com.binzie.test.api.data.model.profile.myFollowers;

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
    @SerializedName("profilePhotoUrl")
    @Expose
    private String profilePhotoUrl;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("fullName")
    @Expose
    private String fullName;
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

    public String getProfilePhotoUrl() {
        return profilePhotoUrl;
    }

    public void setProfilePhotoUrl(String profilePhotoUrl) {
        this.profilePhotoUrl = profilePhotoUrl;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
                .append("profilePhotoUrl", profilePhotoUrl)
                .append("bio", bio)
                .append("fullName", fullName)
                .append("following", following)
                .toString();
    }
}
