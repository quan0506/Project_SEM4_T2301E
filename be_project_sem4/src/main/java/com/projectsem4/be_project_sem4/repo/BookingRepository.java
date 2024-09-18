package com.projectsem4.be_project_sem4.repo;


import com.projectsem4.be_project_sem4.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);
}
