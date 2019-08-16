package br.com.sabrina.serique.challenge.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PerformanceAudio implements Serializable {
    @SerializedName("reference_date")
    @Expose
    private String referenceDate;
    @SerializedName("soundcloud_id")
    @Expose
    private String soundcloudId;
    @SerializedName("permalink_url")
    @Expose
    private String permalinkUrl;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;

    public String getReferenceDate() {
        return referenceDate;
    }

    public void setReferenceDate(String referenceDate) {
        this.referenceDate = referenceDate;
    }

    public String getSoundcloudId() {
        return soundcloudId;
    }

    public void setSoundcloudId(String soundcloudId) {
        this.soundcloudId = soundcloudId;
    }

    public String getPermalinkUrl() {
        return permalinkUrl;
    }

    public void setPermalinkUrl(String permalinkUrl) {
        this.permalinkUrl = permalinkUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
