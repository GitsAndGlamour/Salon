package io.salon.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.salon.domain.Appointment;
import io.salon.repositories.AppointmentRepository;

@RestController
public final class AppointmentsController {

	private final AppointmentRepository appointmentRepository;

	@Autowired
    AppointmentsController(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

	 @RequestMapping(method = RequestMethod.GET, value = "/appointments/{appointmentId}")
	    ResponseEntity<Appointment> findByAppointmentId(@PathVariable String appointmentId) {
	        Appointment appointment = appointmentRepository.findByAppointmentId(appointmentId);

	        if (appointment == null) {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        } else {
	            return new ResponseEntity<>(appointment, HttpStatus.OK);
	        }
	    }

	 @RequestMapping(method = RequestMethod.GET, value = "/appointments/service/{serviceId}")
	    ResponseEntity<List<Appointment>> findAllByServiceId(@PathVariable String serviceId) {
	        List<Appointment> appointments = appointmentRepository.findByServiceId(serviceId);

	        if (appointments == null) {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        } else {
	            return new ResponseEntity<>(appointments, HttpStatus.OK);
	        }
	    }

	 @RequestMapping(method = RequestMethod.GET, value = "/appointments/staff/{staffId}")
	    ResponseEntity<List<Appointment>> findAllByStaffId(@PathVariable String staffId) {
	        List<Appointment> appointments = appointmentRepository.findByStaffId(staffId);

	        if (appointments.size() == 0) {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        } else {
	            return new ResponseEntity<>(appointments, HttpStatus.OK);
	        }
	    }

	 @RequestMapping(method = RequestMethod.GET, value = "/appointments/schedule/{scheduledAt}")
	    ResponseEntity<List<Appointment>> findAllByScheduledAt(@PathVariable String scheduledAt) {
	        List<Appointment> appointments = appointmentRepository.findByScheduledAt(scheduledAt);

	        if (appointments.size() == 0) {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        } else {
	            return new ResponseEntity<>(appointments, HttpStatus.OK);
	        }
	    }

	  @RequestMapping(method = RequestMethod.GET, value = "/appointments/customer/{customerId}")
	     ResponseEntity<List<Appointment>> findAllByCustomerId(@PathVariable String customerId) {
	         List<Appointment> appointments = appointmentRepository.findByCustomerId(customerId);

	         if (appointments.size() == 0) {
	             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	         } else {
	             return new ResponseEntity<>(appointments, HttpStatus.OK);
	         }
	     }

	 @RequestMapping(method = RequestMethod.GET, value = "/appointments/promotion/{promotionId}")
	    ResponseEntity<List<Appointment>> findAllByPromotionId(@PathVariable String promotionId) {
	        List<Appointment> appointments = appointmentRepository.findByPromotionId(promotionId);

	        if (appointments.size() == 0) {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        } else {
	            return new ResponseEntity<>(appointments, HttpStatus.OK);
	        }
	    }

	 @RequestMapping(method = RequestMethod.GET, value = "/appointments/repeat/{isRepeated}")
	  ResponseEntity<List<Appointment>> findAllByIsRepeated(@PathVariable String isRepeated) {
		 List<Appointment> appointments = appointmentRepository.findByIsRepeated(isRepeated);

		 if (appointments.size() == 0) {
			 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		 } else {
			 return new ResponseEntity<>(appointments, HttpStatus.OK);
		 }
	 }

	 @RequestMapping(method = RequestMethod.GET, value = "/appointment")
	  ResponseEntity<List<Appointment>> findAll() {
		 List<Appointment> appointments = appointmentRepository.findAll();

		 if (appointments.size() == 0) {
			 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		 } else {
			 return new ResponseEntity<>(appointments, HttpStatus.OK);
		 }
	 }
}
