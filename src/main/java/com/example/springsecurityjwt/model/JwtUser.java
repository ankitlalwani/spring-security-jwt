package com.example.springsecurityjwt.model;

public class JwtUser {
    private String userName;
    private Long userId;
    private String role;
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setRole(String role) {
        this.role=role;
    }

    public String getUserName() {
        return userName;
    }

    public Long getUserId() {
        return userId;
    }

    public String getRole() {
        return role;
    }
}
