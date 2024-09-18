package com.projectsem4.be_project_sem4.service.interfac;

import com.projectsem4.be_project_sem4.dto.Response;
import com.projectsem4.be_project_sem4.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
