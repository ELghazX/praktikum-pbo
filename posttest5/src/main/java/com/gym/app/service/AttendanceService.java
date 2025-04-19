package com.gym.app.service;

import java.time.LocalDateTime;

import com.gym.app.entity.Attendance;
import com.gym.app.repository.AttendanceRepository;
import com.gym.app.repository.UserRepository;

public class AttendanceService {
    private AttendanceRepository attendanceRepo;
    private UserRepository userRepo;
    private int idCounter = 1;

    public AttendanceService(AttendanceRepository attendanceRepo, UserRepository userRepo) {
        this.attendanceRepo = attendanceRepo;
        this.userRepo = userRepo;
    }

    public void checkIn(int userId) {
        if (userRepo.findById(userId) == null) {
            System.out.println("User not found.");
            return;
        }
        Attendance att = new Attendance(idCounter++, userId, LocalDateTime.now());
        attendanceRepo.addAttendance(att);
        System.out.println("Check-in successful for user ID: " + userId);
    }

}
