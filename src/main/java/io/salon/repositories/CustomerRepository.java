package io.salon.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.salon.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String>{
	Customer findByCustomerId(String customerId);
	Customer findByEmail(String email);
	Customer findByPhone(String phone);
	List<Customer> findByFirstOrLast(String first, String last);
	List<Customer> findByCity(String city);
	List<Customer> findByPreferredStaff(String staffId);
	List<Customer> findAll();

}
