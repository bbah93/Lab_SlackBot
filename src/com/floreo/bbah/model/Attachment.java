package com.floreo.bbah.model;

import de.ralleytn.simple.json.JSONArray;
import de.ralleytn.simple.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * A class representing a message attachment.
 * See https://api.slack.com/docs/message-attachments
 */

public class Attachment {
    //My solutions
    private String fallback;

    private List<String> fields;

    // TODO: implement private fields for each of the following attachment JSON keys:
    // "fallback"
    // "color"
    // "pretext"
    // "author_name"
    // "author_link"
    // "author_icon"
    // "title"
    // "title_link"
    // "text"
    // "fields"
    // "image_url"
    // "thumb_url"
    // "footer"
    // "footer_icon"
    // "ts"


    public Attachment(JSONObject json) {
        // TODO: parse an attachment from the incoming json

        if (json.get("fields") != null) {
            JSONArray membersArray = (JSONArray) json.get("fields");
            this.fields = new ArrayList<String>();
            for (int i = 0; i < membersArray.size(); i++) {
                this.fields.add((String) membersArray.get(i));
            }


        }


    }

    // TODO add getters to access private fields
    //getters to access private fields


    public List<String> getFields() {
        return fields;
    }


}
