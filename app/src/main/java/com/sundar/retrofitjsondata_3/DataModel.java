package com.sundar.retrofitjsondata_3;

public class DataModel {
    private int albumId, id;
    private String title, thumbnailUrl, url;

    public DataModel(int albumId, int id, String title, String thumbnailUrl, String url) {
        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.thumbnailUrl = thumbnailUrl;
        this.url = url;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
