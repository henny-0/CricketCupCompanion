package com.example.cricketcupcompanion;

import android.media.Image;
import android.widget.ImageView;

public class Team {
    String teamName;
    int flagID;

    public Team(int flagID, String teamName){
        this.teamName = teamName;
        this.flagID =flagID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getFlagID() {
        return flagID;
    }

    public void setFlagID(int flagID) {
        this.flagID = flagID;
    }
}
