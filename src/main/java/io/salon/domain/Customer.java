package io.salon.domain;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "`customer`")
public final class Customer {

	@Id
	private volatile String customerId = UUID.randomUUID().toString();
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
	@JsonProperty("notes")
	private volatile String notes;
	@JsonProperty("preferred_staff")
	private volatile String preferredStaff;
	@JsonProperty("discount_type")
	private volatile String discountType;
	@JsonProperty("referral_source")
	private volatile String referralSource;
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

	Customer() {
	}

	public Customer(@JsonProperty("customer_id") String customerId,
			@JsonProperty("first") String first,
			@JsonProperty("last") String last,
			@JsonProperty("email") String email,
			@JsonProperty("address") String address,
			@JsonProperty("city") String city,
			@JsonProperty("state") String state,
			@JsonProperty("postal") String postal,
			@JsonProperty("phone") String phone,
			@JsonProperty("alt_phone") String altPhone,
			@JsonProperty("notes") String notes,
			@JsonProperty("preferred_staff") String preferredStaff,
			@JsonProperty("discount_type") String discountType,
			@JsonProperty("referral_source") String referralSource,
			@JsonProperty("create_admin") String createAdmin,
			@JsonProperty("update_admin") String updateAdmin,
			@JsonProperty("create_ts") String createTs,
			@JsonProperty("update_ts") String updateTs,
			@JsonProperty("is_admin") String isActive) {
		this.customerId = customerId;
		this.first = first;
		this.last = last;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.postal = postal;
		this.phone = phone;
		this.altPhone = altPhone;
		this.notes = notes;
		this.preferredStaff = preferredStaff;
		this.discountType = discountType;
		this.referralSource = referralSource;
		this.createAdmin = createAdmin;
		this.updateAdmin = updateAdmin;
		this.createTs = createTs;
		this.updateTs = updateTs;

	}

	@JsonProperty("customer_id")
	public String getCustomerId() {
		return customerId;
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

	@JsonProperty("notes")
	public String getNotes() {
		return notes;
	}

	@JsonProperty("preferred_staff")
	public String getPreferredStaff() {
		return preferredStaff;
	}

	@JsonProperty("discount_type")
	public String getDiscountType() {
		return discountType;
	}

	@JsonProperty("referral_source")
	public String getReferralSource() {
		return referralSource;
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

	@JsonProperty("customer_id")
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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

	@JsonProperty("notes")
	public void setNotes(String notes) {
		this.notes = notes;
	}

	@JsonProperty("preferred_staff")
	public void setPreferredStaff(String preferredStaff) {
		this.preferredStaff = preferredStaff;
	}

	@JsonProperty("discount_type")
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	@JsonProperty("referral_source")
	public void setReferralSource(String referralSource) {
		this.referralSource = referralSource;
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
