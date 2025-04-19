package com.gym.app.repository;

import com.gym.app.entity.Attendance;
import java.util.ArrayList;
import java.util.List;

public class AttendanceRepository {
    private List<Attendance> attendances = new ArrayList<>();

    public void addAttendance(Attendance attendance) {
        attendances.add(attendance);
    }

    public List<Attendance> getAll() {
        return attendances;
    }
}
