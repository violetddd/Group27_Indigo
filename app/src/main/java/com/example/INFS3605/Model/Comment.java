package com.example.INFS3605.Model;

public class Comment {

    private String commentid;
    private String comments;
    private String publisher;

    public Comment(String commentid, String comments, String publisher){
        this.commentid=commentid;
        this.comments = comments;
        this.publisher=publisher;
    }

    public Comment() {
    }

    public String getCommentid() {
        return commentid;
    }

    public void setCommentid(String commentid) {
        this.commentid = commentid;
    }

    public String getComment() {
        return comments;
    }

    public void setComment(String comment) {
        this.comments = comment;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
