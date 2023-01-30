package com.teltech.mathapp.model;

import java.io.Serializable;

public class MathResponse implements Serializable {
    private String action;
    private Integer x;
    private Integer y;
    private Integer answer;
    private boolean cached;

    public MathResponse(String action, Integer x, Integer y, Integer answer) {
        this.action = action;
        this.x = x;
        this.y = y;
        this.answer = answer;
        this.cached = false;
    }

    public MathResponse(MathResponse mathResponse) {
        this.action = mathResponse.action;
        this.x = mathResponse.x;
        this.y = mathResponse.y;
        this.answer = mathResponse.answer;
        this.cached = mathResponse.cached;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    public boolean isCached() {
        return cached;
    }

    public void setCached(boolean cached) {
        this.cached = cached;
    }
}
