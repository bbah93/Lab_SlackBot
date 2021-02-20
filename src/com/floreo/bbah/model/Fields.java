package com.floreo.bbah.model;

import de.ralleytn.simple.json.JSONObject;

public class Fields {

    private String title;
    private String value;
    private boolean shorts;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isShorts() {
        return shorts;
    }

    public void setShorts(boolean shorts) {
        this.shorts = shorts;
    }
//  // TODO: parse an attachment from the incoming json
}
