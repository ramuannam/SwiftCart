package com.hustler.scalerschool.model;

public class Holiday {
    private final String day;
    private final String reason;
    private final Type type;

    public enum Type{ // enum is used for constants.
         FESTIVAL, FEDERAL
    }

    public Holiday(String day, String reason, Type type) { //dues to constructor we don't need setters. (or simply use lombok setters and getters)
        this.day = day;
        this.reason = reason;
        this.type = type;
    }

    public String getDay() {
        return day;
    }

    public Type getType() {
        return type;
    }

    public String getReason() {
        return reason;
    }
}
