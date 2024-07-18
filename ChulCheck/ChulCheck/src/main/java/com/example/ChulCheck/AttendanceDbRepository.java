package com.example.ChulCheck;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface    AttendanceDbRepository extends JpaRepository<Attendance, String> {
    Optional<Attendance> findById(String Id);
}
