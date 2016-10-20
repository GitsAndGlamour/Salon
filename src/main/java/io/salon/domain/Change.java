package io.salon.domain;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "`Change`")
public class Change {

	@Id
	private volatile String changeId = UUID.randomUUID().toString();
	@JsonProperty("name")
	private volatile String name;
	@JsonProperty("table_name")
	private volatile String tableName;
	@JsonProperty("column_name")
	private volatile String columnName;
	@JsonProperty("previous_value")
	private volatile String previousValue;
	@JsonProperty("current_value")
	private volatile String currentValue;
	@JsonProperty("change_ts")
	private volatile String changeTs;
	@JsonProperty("is_undone")
	private volatile String isUndone;
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

	Change(){
	}
	public Change(	@JsonProperty("change_id") String changeId,
					@JsonProperty("name") String name,
					@JsonProperty("table_name") String tableName,
					@JsonProperty("column_name") String columnName,
					@JsonProperty("previous_value") String previousValue,
					@JsonProperty("current_value") String currentValue,
					@JsonProperty("change_ts") String changeTs,
					@JsonProperty("is_undone") String isUndone,
					@JsonProperty("create_admin") String createAdmin,
					@JsonProperty("update_admin") String updateAdmin,
					@JsonProperty("create_ts") String createTs,
					@JsonProperty("update_ts") String updateTs,
					@JsonProperty("is_active") String isActive) {

		this.changeId = changeId;
		this.setName(name);
		this.setTableName(tableName);
		this.setColumnName(columnName);
		this.setPreviousValue(previousValue);
		this.setCurrentValue(currentValue);
		this.setChangeTs(changeTs);
		this.setIsUndone(isUndone);
		this.setCreateAdmin(createAdmin);
		this.setUpdateAdmin(updateAdmin);
		this.setCreateTs(createTs);
		this.setUpdateTs(updateTs);
		this.setIsActive(isActive);

	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("table_name")
	public String getTableName() {
		return tableName;
	}

	@JsonProperty("table_name")
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	@JsonProperty("table_name")
	public String getColumnName() {
		return columnName;
	}

	@JsonProperty("column_name")
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	@JsonProperty("previous_value")
	public String getPreviousValue() {
		return previousValue;
	}

	@JsonProperty("previous_value")
	public void setPreviousValue(String previousValue) {
		this.previousValue = previousValue;
	}

	@JsonProperty("current_value")
	public String getCurrentValue() {
		return currentValue;
	}

	@JsonProperty("current_value")
	public void setCurrentValue(String currentValue) {
		this.currentValue = currentValue;
	}

	@JsonProperty("change_ts")
	public String getChangeTs() {
		return changeTs;
	}

	@JsonProperty("change_ts")
	public void setChangeTs(String changeTs) {
		this.changeTs = changeTs;
	}

	@JsonProperty("is_undone")
	public String getIsUndone() {
		return isUndone;
	}

	@JsonProperty("is_undone")
	public void setIsUndone(String isUndone) {
		this.isUndone = isUndone;
	}

	@JsonProperty("create_admin")
	public String getCreateAdmin() {
		return createAdmin;
	}

	@JsonProperty("create_admin")
	public void setCreateAdmin(String createAdmin) {
		this.createAdmin = createAdmin;
	}

	@JsonProperty("update_admin")
	public String getUpdateAdmin() {
		return updateAdmin;
	}

	@JsonProperty("update_admin")
	public void setUpdateAdmin(String updateAdmin) {
		this.updateAdmin = updateAdmin;
	}

	@JsonProperty("create_ts")
	public String getCreateTs() {
		return createTs;
	}

	@JsonProperty("create_ts")
	public void setCreateTs(String createTs) {
		this.createTs = createTs;
	}

	@JsonProperty("update_ts")
	public String getUpdateTs() {
		return updateTs;
	}

	@JsonProperty("update_ts")
	public void setUpdateTs(String updateTs) {
		this.updateTs = updateTs;
	}

	@JsonProperty("is_active")
	public String getIsActive() {
		return isActive;
	}

	@JsonProperty("is_active")
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}



}
