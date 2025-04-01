package com.pokemedquest.model;

/**
 * Represents a customizable Avatar linked to a User in PokeMed_Quest.
 */
public class Avatar {

    // --- Fields ---
    private int avatarId;   // Unique identifier for the avatar
    private int userId;     // Foreign key linking to the User this avatar belongs to
    private String avatarName; // Name given to the avatar by the user
    private String color;      // Example customization: color attribute
    private String accessory;  // Example customization: accessory attribute
    private int level;         // Example gamification: avatar level

    // --- Constructors ---

    /**
     * Constructor for creating a new Avatar object.
     * The avatarId is typically generated by the database.
     * The userId links it to the owner.
     *
     * @param userId The ID of the user who owns this avatar.
     * @param avatarName The chosen name for the avatar.
     * @param color The initial color.
     * @param accessory The initial accessory.
     * @param level The starting level (usually 1).
     */
    public Avatar(int userId, String avatarName, String color, String accessory, int level) {
        this.userId = userId;
        this.avatarName = avatarName;
        this.color = color;
        this.accessory = accessory;
        this.level = level;
    }

    /**
     * Constructor used when retrieving Avatar data from the database.
     *
     * @param avatarId The unique ID from the database.
     * @param userId The ID of the user who owns this avatar.
     * @param avatarName The name of the avatar.
     * @param color The color attribute.
     * @param accessory The accessory attribute.
     * @param level The current level.
     */
    public Avatar(int avatarId, int userId, String avatarName, String color, String accessory, int level) {
        this.avatarId = avatarId;
        this.userId = userId;
        this.avatarName = avatarName;
        this.color = color;
        this.accessory = accessory;
        this.level = level;
    }

    // --- Getters and Setters ---

    public int getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(int avatarId) {
        this.avatarId = avatarId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAvatarName() {
        return avatarName;
    }

    public void setAvatarName(String avatarName) {
        this.avatarName = avatarName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // --- Optional: toString() method for debugging ---
    @Override
    public String toString() {
        return "Avatar{" +
               "avatarId=" + avatarId +
               ", userId=" + userId + // Included here for context during debugging
               ", avatarName='" + avatarName + '\'' +
               ", color='" + color + '\'' +
               ", accessory='" + accessory + '\'' +
               ", level=" + level +
               '}';
    }
}