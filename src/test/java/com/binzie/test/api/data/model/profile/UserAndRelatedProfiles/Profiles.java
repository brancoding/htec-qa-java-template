package com.binzie.test.api.data.model.profile.UserAndRelatedProfiles;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class Profiles  implements Serializable {
    @SerializedName("createdAt")
    @Expose
    private Long createdAt;
    @SerializedName("updatedAt")
    @Expose
    private Long updatedAt;
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
    @SerializedName("headline")
    @Expose
    private String headline;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("profilePhotoUrl")
    @Expose
    private String profilePhotoUrl;
    @SerializedName("roles")
    @Expose
    private List<Roles> roles;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("profileFollowConnectionCount")
    @Expose
    private ProfileFollowConnectionCount profileFollowConnectionCount;

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

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

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProfileFollowConnectionCount getProfileFollowConnectionCount() {
        return profileFollowConnectionCount;
    }

    public void setProfileFollowConnectionCount(ProfileFollowConnectionCount profileFollowConnectionCount) {
        this.profileFollowConnectionCount = profileFollowConnectionCount;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("createdAt", createdAt)
                .append("updatedAt", updatedAt)
                .append("id", id)
                .append("title", title)
                .append("type", type)
                .append("verified", verified)
                .append("alias", alias)
                .append("headline", headline)
                .append("website", website)
                .append("bio", bio)
                .append("fullName", fullName)
                .append("profilePhotoUrl", profilePhotoUrl)
                .append("roles", roles)
                .append("status", status)
                .append("profileFollowConnectionCount", profileFollowConnectionCount)
                .toString();
    }
}
