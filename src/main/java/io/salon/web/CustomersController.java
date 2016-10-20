package io.salon.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.salon.domain.Customer;
import io.salon.repositories.CustomerRepository;

@RestController
public final class CustomersController {

  final CustomerRepository customerRepository;

  @Autowired
  CustomersController(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/customers/{customerId}")
     ResponseEntity<Customer> findByCustomerId(@PathVariable String customerId) {
         Customer customer = customerRepository.findByCustomerId(customerId);

         if (customer == null) {
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         } else {
             return new ResponseEntity<>(customer, HttpStatus.OK);
         }
     }

  @RequestMapping(method = RequestMethod.GET, value = "/customers/email/{email}")
  ResponseEntity<Customer> findByEmail(@PathVariable String email) {
      Customer customer = customerRepository.findByEmail(email);

      if (customer == null) {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      } else {
          return new ResponseEntity<>(customer, HttpStatus.OK);
      }
  }

  @RequestMapping(method = RequestMethod.GET, value = "/customers/phone/{phone}")
  ResponseEntity<Customer> findByPhone(@PathVariable String phone) {
      Customer customer = customerRepository.findByPhone(phone);

      if (customer == null) {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      } else {
          return new ResponseEntity<>(customer, HttpStatus.OK);
      }
  }

  @RequestMapping(method = RequestMethod.GET, value = "/customers/first/{first}/last/{last}")
  ResponseEntity<List<Customer>> findAllByFirstOrLast(@PathVariable String first, @PathVariable String last) {
      List<Customer> customers = customerRepository.findByFirstOrLast(first, last);

      if (customers == null) {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      } else {
          return new ResponseEntity<>(customers, HttpStatus.OK);
      }
  }

  @RequestMapping(method = RequestMethod.GET, value = "/customers/city/{city}")
  ResponseEntity<List<Customer>> findAllByCity(@PathVariable String city) {
      List<Customer> customers = customerRepository.findByCity(city);

      if (customers == null) {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      } else {
          return new ResponseEntity<>(customers, HttpStatus.OK);
      }
  }

  @RequestMapping(method = RequestMethod.GET, value = "/customers/staff/{staffId}")
  ResponseEntity<List<Customer>> findAllByPreferredStaff(@PathVariable String preferred_staff) {
      List<Customer> customers = customerRepository.findByPreferredStaff(preferred_staff);

      if (customers == null) {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      } else {
          return new ResponseEntity<>(customers, HttpStatus.OK);
      }
  }

  @RequestMapping(method = RequestMethod.GET, value = "/customers")
  ResponseEntity<List<Customer>> findAll() {
      List<Customer> customers = customerRepository.findAll();

      if (customers == null) {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      } else {
          return new ResponseEntity<>(customers, HttpStatus.OK);
      }
  }
}
