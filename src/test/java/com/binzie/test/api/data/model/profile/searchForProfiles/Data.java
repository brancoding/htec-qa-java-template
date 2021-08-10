package com.binzie.test.api.data.model.profile.searchForProfiles;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Data implements Serializable {
    @SerializedName("page")
    @Expose
    private Page page;

    public Data(Page page) {
        this.page = page;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("page", page)
                .toString();
    }
}
