
package com.binzie.test.api.data.model.common;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class StatusResponse implements Serializable, ResponseHelper {
    @SerializedName("status")
    @Expose
    private Long status;
    @SerializedName("error")
    @Expose
    private String error;
    @SerializedName("errorCode")
    @Expose
    private Long errorCode;
    @SerializedName("message")
    @Expose
    private String message;

    public StatusResponse(Long status, String error, Long errorCode, String message) {
        super();
        this.status = status;
        this.error = error;
        this.errorCode = errorCode;
        this.message = message;
    }

    public StatusResponse() {
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("status", status)
                .append("error", error)
                .append("errorCode", errorCode)
                .append("message", message)
                .toString();
    }

    @Override
    public boolean isResponseNull() {
        return false;
    }
}
