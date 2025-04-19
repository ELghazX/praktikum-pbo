package com.gym.app.entity;

import java.time.LocalDate;

public class Member extends User {
    private LocalDate expiredDate;

    @Override
    public String getInfo() {
        return "Member: " + name;
    }

    public Member(int id, String name, String password, LocalDate expiredDate) {
        super(id, name, password, "member");
        this.expiredDate = expiredDate;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public void extendMembership() {
        this.expiredDate = this.expiredDate.plusMonths(1);
    }
}
