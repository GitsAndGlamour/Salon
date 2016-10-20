package io.salon.domain;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`appointment`")
public final class Appointment {

	@Id
	private volatile String appointmentId = UUID.randomUUID().toString();
	@JsonProperty("service_id")
	private volatile String serviceId;
	@JsonProperty("customer_id")
	private volatile String customerId;
	@JsonProperty("promotion_id")
	private volatile String promotionId;
	@JsonProperty("notes")
	private volatile String notes;
	@JsonProperty("is_repeated")
	private volatile String isRepeated;
	@JsonProperty("staff_id")
	private volatile String staffId;
	@JsonProperty("resources")
	private volatile String resources;
	@JsonProperty("status_code")
	private volatile String statusCode;
	@JsonProperty("check_in")
	private volatile String checkIn;
	@JsonProperty("scheduled_at")
	private volatile String scheduledAt;
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

	Appointment() {
	}

	public Appointment(
			@JsonProperty("appointment_id") String appointmentId,
			@JsonProperty("service_id") 	String serviceId,
			@JsonProperty("customer_id") 	String customerId,
			@JsonProperty("promotion_id") 	String promotionId,
			@JsonProperty("notes") 			String notes,
			@JsonProperty("is_repeated") 	String isRepeated,
			@JsonProperty("staff_id") 		String staffId,
			@JsonProperty("resources") 		String resources,
			@JsonProperty("status_code") 	String statusCode,
			@JsonProperty("check_in") 		String checkIn,
			@JsonProperty("scheduled_at") 	String scheduledAt,
			@JsonProperty("create_admin") 	String createAdmin,
			@JsonProperty("update_admin") 	String updateAdmin,
			@JsonProperty("create_ts") 		String createTs,
			@JsonProperty("update_ts") 		String updateTs,
			@JsonProperty("is_active") 		String isActive) {
		this.appointmentId = appointmentId;
		setServiceId(serviceId);
		setCustomerId(customerId);
		setPromotionId(promotionId);
		setNotes(notes);
		setIsRepeated(isRepeated);
		setStaffId(staffId);
		setResources(resources);
		setStatusCode(statusCode);
		setCheckIn(checkIn);
		setScheduledAt(scheduledAt);
		setCreateAdmin(createAdmin);
		setUpdateAdmin(updateAdmin);
		setCreateTs(createTs);
		setUpdateTs(updateTs);
		setIsActive(isActive);

	}

	@JsonProperty("appointment_id")
	public String getAppointmentId() {
		return appointmentId;
	}

	@JsonProperty("service_id")
	public String getServiceId() {
		return serviceId;
	}

	@JsonProperty("customer_id")
	public String getCustomerId() {
		return customerId;
	}

	@JsonProperty("promotion_id")
	public String getPromotionId() {
		return promotionId;
	}

	@JsonProperty("notes")
	public String getNotes() {
		return notes;
	}

	@JsonProperty("is_repeated")
	public String getIsRepeated() {
		return isRepeated;
	}

	@JsonProperty("staff_id")
	public String getStaffId() {
		return staffId;
	}

	@JsonProperty("resources")
	public String getResources() {
		return resources;
	}

	@JsonProperty("statusCode")
	public String getStatusCode() {
		return statusCode;
	}

	@JsonProperty("check_in")
	public String getCheckIn() {
		return checkIn;
	}

	@JsonProperty("scheduled_at")
	public String getScheduledAt() {
		return scheduledAt;
	}

	@JsonProperty("create_admin")
	public String getCreateAdmin() {
		return createAdmin;
	}

	@JsonProperty("update_ts")
	public String getUpdateTs() {
		return updateTs;
	}

	@JsonProperty("is_active")
	public String getIsActive() {
		return isActive;
	}

	@JsonProperty("update_admin")
	public String getUpdateAdmin() {
		return updateAdmin;
	}

	@JsonProperty("create_ts")
	public String getCreateTs() {
		return createTs;
	}

	@JsonProperty("appointment_id")
	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	@JsonProperty("service_id")
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	@JsonProperty("customer_id")
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	@JsonProperty("promotion_id")
	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}

	@JsonProperty("notes")
	public void setNotes(String notes) {
		this.notes = notes;
	}

	@JsonProperty("is_repeated")
	public void setIsRepeated(String isRepeated) {
		this.isRepeated = isRepeated;
	}

	@JsonProperty("staff_id")
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	@JsonProperty("resources")
	public void setResources(String resources) {
		this.resources = resources;
	}

	@JsonProperty("status_code")
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	@JsonProperty("check_in")
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	@JsonProperty("scheduled_at")
	public void setScheduledAt(String scheduledAt) {
		this.scheduledAt = scheduledAt;
	}

	@JsonProperty("create_admin")
	public void setCreateAdmin(String createAdmin) {
		this.createAdmin = createAdmin;
	}

	@JsonProperty("update_ts")
	public void setUpdateTs(String updateTs) {
		this.updateTs = updateTs;
	}

	@JsonProperty("is_active")
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	@JsonProperty("update_admin")
	public void setUpdateAdmin(String updateAdmin) {
		this.updateAdmin = updateAdmin;
	}

	@JsonProperty("create_ts")
	public void setCreateTs(String createTs) {
		this.createTs = createTs;
	}

}
