package io.salon.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.salon.domain.Staff;
import io.salon.repositories.StaffRepository;

@RestController
public final class StaffsController {

  final StaffRepository staffRepository;

  @Autowired
  StaffsController(StaffRepository staffRepository) {
    this.staffRepository = staffRepository;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/staffs/{staffId}")
     ResponseEntity<Staff> findByStaffId(@PathVariable String staffId) {
         Staff staff = staffRepository.findByStaffId(staffId);

         if (staff == null) {
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         } else {
             return new ResponseEntity<>(staff, HttpStatus.OK);
         }
     }

  @RequestMapping(method = RequestMethod.GET, value = "/staffs/email/{email}")
  ResponseEntity<Staff> findByEmail(@PathVariable String email) {
      Staff staff = staffRepository.findByEmail(email);

      if (staff == null) {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      } else {
          return new ResponseEntity<>(staff, HttpStatus.OK);
      }
  }

  @RequestMapping(method = RequestMethod.GET, value = "/staffs/phone/{phone}")
  ResponseEntity<Staff> findByPhone(@PathVariable String phone) {
      Staff staff = staffRepository.findByPhone(phone);

      if (staff == null) {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      } else {
          return new ResponseEntity<>(staff, HttpStatus.OK);
      }
  }

  @RequestMapping(method = RequestMethod.GET, value = "/staffs/first/{first}/last/{last}")
  ResponseEntity<List<Staff>> findAllByFirstOrLast(@PathVariable String first, @PathVariable String last) {
      List<Staff> staffs = staffRepository.findByFirstOrLast(first, last);

      if (staffs == null) {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      } else {
          return new ResponseEntity<>(staffs, HttpStatus.OK);
      }
  }

  @RequestMapping(method = RequestMethod.GET, value = "/staffs/role/{roleId}")
  ResponseEntity<List<Staff>> findAllByRoleId(@PathVariable String roleId) {
      List<Staff> staffs = staffRepository.findByRoleId(roleId);

      if (staffs == null) {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      } else {
          return new ResponseEntity<>(staffs, HttpStatus.OK);
      }
  }

  @RequestMapping(method = RequestMethod.GET, value = "/staffs/services/{services}")
  ResponseEntity<List<Staff>> findAllByServices(@PathVariable String services) {
      List<Staff> staffs = staffRepository.findByServices(services);

      if (staffs == null) {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      } else {
          return new ResponseEntity<>(staffs, HttpStatus.OK);
      }
  }

  @RequestMapping(method = RequestMethod.GET, value = "/staffs/status/{statusCode}")
  ResponseEntity<List<Staff>> findAllByStatusCode(@PathVariable String statusCode) {
      List<Staff> staffs = staffRepository.findByStatusCode(statusCode);

      if (staffs == null) {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      } else {
          return new ResponseEntity<>(staffs, HttpStatus.OK);
      }
  }

  @RequestMapping(method = RequestMethod.GET, value = "/staffs")
  ResponseEntity<List<Staff>> findAll() {
      List<Staff> staffs = staffRepository.findAll();

      if (staffs == null) {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      } else {
          return new ResponseEntity<>(staffs, HttpStatus.OK);
      }
  }
}
