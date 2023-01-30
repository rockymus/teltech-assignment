package com.teltech.mathapp.model;

import java.io.Serializable;

public class MathResponse implements Serializable {
    private String action;
    private String x;
    private String y;
    private String answer;
    private boolean cached;

    public MathResponse(String action, Double x, Double y, Double answer) {
        this.action = action;
        this.x = convertValueToString(x);
        this.y = convertValueToString(y);
        this.answer = convertValueToString(answer);
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

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isCached() {
        return cached;
    }

    public void setCached(boolean cached) {
        this.cached = cached;
    }

    private String convertValueToString(Double value) {
        if (value % 1 == 0) {
            return String.format("%d", value.longValue());
        }
        return Double.toString(value);
    }
}
