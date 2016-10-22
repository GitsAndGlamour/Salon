package io.salon.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.salon.domain.Staff;

public interface StaffRepository extends JpaRepository<Staff, String>{
	Staff findByStaffId(String staffId);
	Staff findByStaffIdAndPassword(String staffId, String password);
	Staff findByEmail(String email);
	Staff findByPhone(String phone);
	List<Staff> findByFirstOrLast(String first, String last);
	List<Staff> findByStatusCode(String statusCode);
	List<Staff> findByRoleId(String roleId);
	List<Staff> findByServices(String services);
	List<Staff> findAll();

}
