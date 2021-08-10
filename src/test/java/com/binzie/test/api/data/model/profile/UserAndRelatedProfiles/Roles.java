package com.binzie.test.api.data.model.profile.UserAndRelatedProfiles;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class Roles  implements Serializable {
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("permissions")
    @Expose
    private List<String> permissions;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("role", role)
                .append("permissions", permissions)
                .toString();
    }
}
