package com.example.ins;

public class Gallery {
    private String Title;
    private String Location;
    private String Description;
    private int Thumbnail;
    private String Link;

    public Gallery (){

    }

    public Gallery (String title, String location, String description, int thumbnail, String link){
        Title = title;
        Location = location;
        Description = description;
        Thumbnail = thumbnail;
        Link = link;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }

    public String getLink() { return Link; }

    public void setLink(String link) { Link = link; }

}
