package com.usjr.finalsexam.entity;

public class Video {

    private String mId;
    private String mTitle;
    private String mDescription;
    private String mThumbnailUrl;

    public Video() {
    }

    public Video(String id, String title, String description, String thumbnailUrl) {
        this.mId = id;
        this.mTitle = title;
        this.mDescription = description;
        this.mThumbnailUrl = thumbnailUrl;
    }

    public String getId() {
        return mId;
    }

    public Video setId(String id) {
        mId = id;
        return this;
    }

    public String getTitle() {
        return mTitle;
    }

    public Video setTitle(String title) {
        mTitle = title;
        return this;
    }

    public String getDescription() {
        return mDescription;
    }

    public Video setDescription(String description) {
        mDescription = description;
        return this;
    }

    public String getThumbnailUrl() {
        return mThumbnailUrl;
    }

    public Video setThumbnailUrl(String thumbnailUrl) {
        mThumbnailUrl = thumbnailUrl;
        return this;
    }
}
