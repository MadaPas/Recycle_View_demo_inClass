package com.madapas.recycleviewdemo.model;


import java.io.Serializable;

public class Note implements Serializable {

    static final long SerialVersionUID = 42L;

    public String headline;
    public String body;
    private boolean liked = false;

    public Note(String headline, String body){
        this.headline=headline;
        this.body=body;
    }

    public void toogleLike(){
        liked = !liked;
    }

    public boolean getLiked(){
        return liked;
    }
}
