package com.goblinbag.beans;

import java.util.ArrayList;
import java.util.Date;

public class Campaign {

    private int id;
    private String title;
    private Date created;
    private String gameSystem;
    private ArrayList<Session> sessions;


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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getGameSystem() {
        return gameSystem;
    }

    public void setGameSystem(String gameSystem) {
        this.gameSystem = gameSystem;
    }
}
