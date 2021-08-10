package com.binzie.test.api.data.model.profile.myFollowers;

import com.binzie.test.api.data.model.profile.myFollowees.Content;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class Page implements Serializable {
    @SerializedName("content")
    @Expose
    private List<Content> content = null;
    @SerializedName("page")
    @Expose
    private Long page;
    @SerializedName("size")
    @Expose
    private Long size;
    @SerializedName("totalItems")
    @Expose
    private Long totalItems;
    @SerializedName("totalPages")
    @Expose
    private Long totalPages;
    @SerializedName("first")
    @Expose
    private Boolean first;
    @SerializedName("last")
    @Expose
    private Boolean last;

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Long totalItems) {
        this.totalItems = totalItems;
    }

    public Long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }

    public Boolean getFirst() {
        return first;
    }

    public void setFirst(Boolean first) {
        this.first = first;
    }

    public Boolean getLast() {
        return last;
    }

    public void setLast(Boolean last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("content", content)
                .append("page", page)
                .append("size", size)
                .append("totalItems", totalItems)
                .append("totalPages", totalPages)
                .append("first", first)
                .append("last", last)
                .toString();
    }
}
