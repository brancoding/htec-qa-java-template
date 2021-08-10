package com.binzie.test.api.data.model.profile.profileByIdPublic;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Profile implements Serializable {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("verified")
    @Expose
    private Boolean verified;
    @SerializedName("alias")
    @Expose
    private String alias;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("profilePhotoUrl")
    @Expose
    private String profilePhotoUrl;
    @SerializedName("profileFollowConnectionCount")
    @Expose
    private ProfileFollowConnectionCount profileFollowConnectionCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getProfilePhotoUrl() {
        return profilePhotoUrl;
    }

    public void setProfilePhotoUrl(String profilePhotoUrl) {
        this.profilePhotoUrl = profilePhotoUrl;
    }

    public ProfileFollowConnectionCount getProfileFollowConnectionCount() {
        return profileFollowConnectionCount;
    }

    public void setProfileFollowConnectionCount(ProfileFollowConnectionCount profileFollowConnectionCount) {
        this.profileFollowConnectionCount = profileFollowConnectionCount;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("title", title)
                .append("type", type)
                .append("verified", verified)
                .append("alias", alias)
                .append("bio", bio)
                .append("fullName", fullName)
                .append("profilePhotoUrl", profilePhotoUrl)
                .append("profileFollowConnectionCount", profileFollowConnectionCount)
                .toString();
    }
}
