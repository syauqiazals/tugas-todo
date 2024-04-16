package com.example.recyclermgm;

public class Activity {
    public String id, what, time;
    public Activity(String id, String what, String time){
        this.id = id;
        this.what = what;
        this.time = time;
    }

    public String getId(){
        return id;
    }

    public String getWhat(){
        return what;
    }

    public String getTime(){
        return time;
    }
}
