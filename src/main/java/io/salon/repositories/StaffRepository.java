package io.salon.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.salon.domain.Staff;

public interface StaffRepository extends JpaRepository<Staff, String>{
	Customer findByStaffId(String staffId);
	Customer findByEmail(String email);
	Customer findByPhone(String phone);
	List<Customer> findByFirstOrLast(String first, String last);
	List<Customer> findByStatusCode(String statusCode);
	List<Customer> findByRoleId(String roleId);
	List<Customer> findByServices(String services);
	List<Customer> findAll();

}
