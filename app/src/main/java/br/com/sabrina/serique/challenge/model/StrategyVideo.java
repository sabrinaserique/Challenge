package br.com.sabrina.serique.challenge.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StrategyVideo {

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("published")
    @Expose
    private String published;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("enabled_for_tvorama")
    @Expose
    private Boolean enabledForTvorama;
    @SerializedName("youtube_id")
    @Expose
    private String youtubeId;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getEnabledForTvorama() {
        return enabledForTvorama;
    }

    public void setEnabledForTvorama(Boolean enabledForTvorama) {
        this.enabledForTvorama = enabledForTvorama;
    }

    public String getYoutubeId() {
        return youtubeId;
    }

    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
