package com.floreo.bbah.model;

import de.ralleytn.simple.json.JSONObject;

/**
 * A class representing a message attachment.
 * See https://api.slack.com/docs/message-attachments
 */

public class Attachment {

    /*
        For each of line item below, I will be using the JSON keys commented out to assign of each field.
         */
    // TODO: implement private fields for each of the following attachment JSON keys:
    // "fallback"
    private String fallback;
    // "color"
    private int color;
    // "pretext"
    private String pretext;
    // "author_name"
    private String author_name;
    // "author_link"
    private String author_link;
    // "author_icon"
    private String author_icon;
    // "title"
    private String title;
    // "title_link"
    private String title_link;
    // "text"
    private String text;
    // "fields"
    private String image_url;
    // "thumb_url"
    private String thumb_url;
    // "footer"
    private String footer;
    // "footer_icon"
    private String footer_icon;
    // "ts"
    private String ts;

    public Attachment(JSONObject json) {
        // TODO: parse an attachment from the incoming json

        if (json.get("fallback") != null) {
            this.fallback = (String) json.get("fallback");
        }
        if (json.get("color") != null) {
            this.color = (int) json.get("color");
        }
        if (json.get("pretext") != null) {
            this.pretext = (String) json.get("pretext");
        }
        if (json.get("author_name") != null) {
            this.author_name = (String) json.get("author_name");
        }
        if (json.get("author_link") != null) {
            this.author_link = (String) json.get("author_link");
        }
        if (json.get("author_icon") != null) {
            this.author_icon = (String) json.get("author_icon");
        }
        if (json.get("title") != null) {
            this.title = (String) json.get("title");
        }
        if (json.get("title_link") != null) {
            this.title_link = (String) json.get("title_link");
        }
        if (json.get("text") != null) {
            this.text = (String) json.get("text");
        }
        if (json.get("image_url") != null) {
            this.image_url = (String) json.get("image_url");
        }
        if (json.get("thumb_url") != null) {
            this.thumb_url = (String) json.get("thumb_url");
        }
        if (json.get("footer") != null) {
            this.footer = (String) json.get("footer");
        }
        if (json.get("footer_icon") != null) {
            this.footer_icon = (String) json.get("footer_icon");
        }
        if (json.get("ts") != null) {
            this.ts = (String) json.get("ts");
        }
    }

    // TODO add getters to access private fields
    //Command 'N' to select Getters for private fields; to get all the fields, 'Shift' & 'Arrows'..

    public String getFallback() {
        return fallback;
    }

    public int getColor() {
        return color;
    }

    public String getPretext() {
        return pretext;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public String getAuthor_link() {
        return author_link;
    }

    public String getAuthor_icon() {
        return author_icon;
    }

    public String getTitle() {
        return title;
    }

    public String getTitle_link() {
        return title_link;
    }

    public String getText() {
        return text;
    }

    public String getImage_url() {
        return image_url;
    }

    public String getThumb_url() {
        return thumb_url;
    }

    public String getFooter() {
        return footer;
    }

    public String getFooter_icon() {
        return footer_icon;
    }

    public String getTs() {
        return ts;
    }


}
