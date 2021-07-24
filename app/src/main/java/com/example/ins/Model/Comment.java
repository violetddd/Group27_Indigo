package com.example.ins.Model;

public class Comment {

    private String commentid;
    private String comment;
    private String publisher;

    public Comment(String commentid, String comment, String publisher){
        this.commentid=commentid;
        this.comment = comment;
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
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
