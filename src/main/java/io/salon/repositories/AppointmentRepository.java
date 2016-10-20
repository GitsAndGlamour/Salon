package io.salon.repositories;

import java.util.List;

import io.salon.domain.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, String> {
	Appointment findByAppointmentId(String appointmentId);
	List<Appointment> findByServiceId(String serviceId);
	List<Appointment> findByStaffId(String staffId);
	List<Appointment> findByScheduledAt(String scheduledAt);
	 List<Appointment> findByCustomerId(String customerId);
	List<Appointment> findByPromotionId(String promotionId);
	List<Appointment> findByIsRepeated(String isRepeated);
	List<Appointment> findAll();
}
