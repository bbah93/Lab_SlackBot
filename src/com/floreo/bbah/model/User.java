package com.floreo.bbah.model;

import de.ralleytn.simple.json.JSONObject;

/**
 *
 * A class representing a user.
 * See https://api.slack.com/types/user
 *
 */

public class User {

    private String id;
    private String name;
    private boolean deleted;
    private String color;
    private String profile;
    private boolean isAdmin;
    private boolean isOwner;
    private boolean isPrimaryOwner;
    private boolean isRestricted;
    private boolean isUltraRestricted;
    private boolean  has2fa;
    private boolean twoFactorType;
    private boolean hasFiles;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public String getColor() {
        return color;
    }

    public String getProfile() {
        return profile;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public boolean isPrimaryOwner() {
        return isPrimaryOwner;
    }

    public boolean isRestricted() {
        return isRestricted;
    }

    public boolean isUltraRestricted() {
        return isUltraRestricted;
    }

    public boolean isHas2fa() {
        return has2fa;
    }

    public boolean isTwoFactorType() {
        return twoFactorType;
    }

    public boolean isHasFiles() {
        return hasFiles;
    }

    // TODO: implement private fields for each of the following user JSON keys:
    // "id"
    // "name"
    // "deleted"
    // "color"
    // "profile"
    // "is_admin"
    // "is_owner"
    // "is_primary_owner"
    // "is_restricted"
    // "is_ultra_restricted"
    // "has_2fa"
    // "two_factor_type"
    // "has_files"

    public User(JSONObject json) {
        // TODO: parse a user from the incoming json

        this.id = json.getString("id");
        this.name = json.getString("name");
        this.deleted = json.getBoolean("deleted");
        this.color = json.getString("color");
        this.profile = json.getString("profile");
        this.isAdmin =  json.getBoolean("is_admin");
        this.isOwner = json.getBoolean("is_owner");
        this.isPrimaryOwner = json.getBoolean("is_primary_owner");
        this.isRestricted = json.getBoolean("is_restricted");
        this.isUltraRestricted = json.getBoolean("is_ultra_restricted");
        this.has2fa = json.getBoolean("has_2fa");
        this.twoFactorType = json.getBoolean("two_factor_type");
        this.hasFiles = json.getBoolean("has_files");
    }

    // TODO add getters to access private fields
}
