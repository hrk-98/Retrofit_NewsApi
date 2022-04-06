package com.example.newsapi;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Artical {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("published_date")
    @Expose
    private String publishedDate;
    @SerializedName("published_date_precision")
    @Expose
    private String publishedDatePrecision;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("clean_url")
    @Expose
    private String cleanUrl;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("rights")
    @Expose
    private String rights;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("topic")
    @Expose
    private String topic;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("authors")
    @Expose
    private List<String> authors = null;
    @SerializedName("media")
    @Expose
    private String media;
    @SerializedName("is_opinion")
    @Expose
    private Boolean isOpinion;
    @SerializedName("twitter_account")
    @Expose
    private String twitterAccount;
    @SerializedName("_score")
    @Expose
    private Double score;
    @SerializedName("_id")
    @Expose
    private String id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getPublishedDatePrecision() {
        return publishedDatePrecision;
    }

    public void setPublishedDatePrecision(String publishedDatePrecision) {
        this.publishedDatePrecision = publishedDatePrecision;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCleanUrl() {
        return cleanUrl;
    }

    public void setCleanUrl(String cleanUrl) {
        this.cleanUrl = cleanUrl;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public Boolean getIsOpinion() {
        return isOpinion;
    }

    public void setIsOpinion(Boolean isOpinion) {
        this.isOpinion = isOpinion;
    }

    public String getTwitterAccount() {
        return twitterAccount;
    }

    public void setTwitterAccount(String twitterAccount) {
        this.twitterAccount = twitterAccount;
    }

    public Number getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
