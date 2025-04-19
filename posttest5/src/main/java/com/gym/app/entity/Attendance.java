package com.gym.app.entity;

import java.time.LocalDateTime;

public final class Attendance {
    private final int id;
    private int userId;
    private LocalDateTime checkInTime;

    public Attendance(int id, int userId, LocalDateTime checkInTime) {
        this.id = id;
        this.userId = userId;
        this.checkInTime = checkInTime;
    }

    public final int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public LocalDateTime getCheckInTime() {
        return checkInTime;
    }
}
