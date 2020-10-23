package com.floreo.bbah.model;

import de.ralleytn.simple.json.JSONObject;

public class Profile {
    private String title;
    private String phone;
    private String skype;
    private String real_name;
    private String real_name_normalized;
    private String display_name;
    private String display_name_normalized;
    private String status_text;
    private String status_emoji;
    private float status_expiration;
    private String avatar_hash;
    private String first_name;
    private String last_name;
    private String email;
    private String image_original;
    private String image_24;
    private String image_32;
    private String image_48;
    private String image_72;
    private String image_192;
    private String image_512;
    private String team;

    public String getTitle() {
        return title;
    }

    public String getPhone() {
        return phone;
    }

    public String getSkype() {
        return skype;
    }

    public String getReal_name() {
        return real_name;
    }

    public String getReal_name_normalized() {
        return real_name_normalized;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public String getDisplay_name_normalized() {
        return display_name_normalized;
    }

    public String getStatus_text() {
        return status_text;
    }

    public String getStatus_emoji() {
        return status_emoji;
    }

    public float getStatus_expiration() {
        return status_expiration;
    }

    public String getAvatar_hash() {
        return avatar_hash;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getImage_original() {
        return image_original;
    }

    public String getImage_24() {
        return image_24;
    }

    public String getImage_32() {
        return image_32;
    }

    public String getImage_48() {
        return image_48;
    }

    public String getImage_72() {
        return image_72;
    }

    public String getImage_192() {
        return image_192;
    }

    public String getImage_512() {
        return image_512;
    }

    public String getTeam() {
        return team;
    }

    public Profile(JSONObject profileObject) {
    }


}
