package io.salon.domain;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "`staff`")
public final class Staff {

	@Id
	private volatile String staffId = UUID.randomUUID().toString();
	@JsonProperty("first")
	private volatile String first;
	@JsonProperty("last")
	private volatile String last;
	@JsonProperty("email")
	private volatile String email;
	@JsonProperty("address")
	private volatile String address;
	@JsonProperty("city")
	private volatile String city;
	@JsonProperty("state")
	private volatile String state;
	@JsonProperty("postal")
	private volatile String postal;
	@JsonProperty("phone")
	private volatile String phone;
	@JsonProperty("alt_phone")
	private volatile String altPhone;
	@JsonProperty("role_id")
	private volatile String roleId;
	@JsonProperty("services")
	private volatile String services;
	@JsonProperty("status_code")
	private volatile String statusCode;
	@JsonProperty("password")
	private volatile String password;
	@JsonProperty("create_admin")
	private volatile String createAdmin;
	@JsonProperty("update_admin")
	private volatile String updateAdmin;
	@JsonProperty("create_ts")
	private volatile String createTs;
	@JsonProperty("update_ts")
	private volatile String updateTs;
	@JsonProperty("is_active")
	private volatile String isActive;

	Staff() {
	}

	public Staff(@JsonProperty("staff_id") String staffId,
			@JsonProperty("first") String first,
			@JsonProperty("last") String last,
			@JsonProperty("email") String email,
			@JsonProperty("address") String address,
			@JsonProperty("city") String city,
			@JsonProperty("state") String state,
			@JsonProperty("postal") String postal,
			@JsonProperty("phone") String phone,
			@JsonProperty("alt_phone") String altPhone,
			@JsonProperty("role_id") String roleId,
			@JsonProperty("services") String services,
			@JsonProperty("status_code") String statusCode,
			@JsonProperty("password") String password,
			@JsonProperty("create_admin") String createAdmin,
			@JsonProperty("update_admin") String updateAdmin,
			@JsonProperty("create_ts") String createTs,
			@JsonProperty("update_ts") String updateTs,
			@JsonProperty("is_admin") String isActive) {
		this.staffId = staffId;
		this.first = first;
		this.last = last;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.postal = postal;
		this.phone = phone;
		this.altPhone = altPhone;
		this.roleId = roleId;
		this.services = services;
		this.statusCode = statusCode;
		this.password = password;
		this.createAdmin = createAdmin;
		this.updateAdmin = updateAdmin;
		this.createTs = createTs;
		this.updateTs = updateTs;

	}

	@JsonProperty("staff_id")
	public String getStaffId() {
		return staffId;
	}

	@JsonProperty("first")
	public String getFirst() {
		return first;
	}

	@JsonProperty("last")
	public String getLast() {
		return last;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("address")
	public String getAddress() {
		return address;
	}

	@JsonProperty("city")
	public String getCity() {
		return city;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	@JsonProperty("postal")
	public String getPostal() {
		return postal;
	}

	@JsonProperty("phone")
	public String getPhone() {
		return phone;
	}

	@JsonProperty("alt_phone")
	public String getAltPhone() {
		return altPhone;
	}

	@JsonProperty("role_id")
	public String getRoleId() {
		return roleId;
	}

	@JsonProperty("services")
	public String getServices() {
		return services;
	}

	@JsonProperty("status_code")
	public String getStatusCode() {
		return statusCode;
	}

	@JsonProperty("password")
	public String getPassword() {
		return password;
	}

	@JsonProperty("create_admin")
	public String getCreateAdmin() {
		return createAdmin;
	}

	@JsonProperty("update_admin")
	public String getUpdateAdmin() {
		return updateAdmin;
	}

	@JsonProperty("create_ts")
	public String getCreateTs() {
		return createTs;
	}

	@JsonProperty("update_ts")
	public String getUpdateTs() {
		return updateTs;
	}

	@JsonProperty("is_active")
	public String getIsActive() {
		return isActive;
	}

	@JsonProperty("staff_id")
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	@JsonProperty("first")
	public void setFirst(String first) {
		this.first = first;
	}

	@JsonProperty("last")
	public void setLast(String last) {
		this.last = last;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty("address")
	public void setAddress(String address) {
		this.address = address;
	}

	@JsonProperty("city")
	public void setCity(String city) {
		this.city = city;
	}

	@JsonProperty("state")
	public void setState(String state) {
		this.state = state;
	}

	@JsonProperty("postal")
	public void setPostal(String postal) {
		this.postal = postal;
	}

	@JsonProperty("phone")
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@JsonProperty("alt_phone")
	public void setAltPhone(String altPhone) {
		this.altPhone = altPhone;
	}

	@JsonProperty("role_id")
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	@JsonProperty("services")
	public void setServices(String services) {
		this.services = services;
	}

	@JsonProperty("status_code")
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	@JsonProperty("password")
	public void setPassword(String password) {
		this.password = password;
	}

	@JsonProperty("create_admin")
	public void setCreateAdmin(String createAdmin) {
		this.createAdmin = createAdmin;
	}

	@JsonProperty("update_admin")
	public void setUpdateAdmin(String updateAdmin) {
		this.updateAdmin = updateAdmin;
	}

	@JsonProperty("create_ts")
	public void setCreateTs(String createTs) {
		this.createTs = createTs;
	}

	@JsonProperty("update_ts")
	public void setUpdateTs(String updateTs) {
		this.updateTs = updateTs;
	}

	@JsonProperty("is_active")
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
}
