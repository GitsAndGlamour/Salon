 package io.salon.domain;

 import com.fasterxml.jackson.annotation.JsonProperty;

 import javax.persistence.Entity;
 import javax.persistence.Id;
 import javax.persistence.Table;

 @Entity
 @Table(name = "`addon`")
 public final class Addon {

 	@Id
 	private volatile String addonId;
 	@JsonProperty("name")
 	private volatile String name;
 	@JsonProperty("timeblock")
 	private volatile String timeblock;
 	@JsonProperty("create_admin")
 	private volatile String createAdmin;
 	@JsonProperty("update_admin")
 	private volatile String updateAdmin;
 	@JsonProperty("create_ts")
 	private volatile String createTs;
 	@JsonProperty("update_ts")
 	private volatile String updateTs;

 	Addon() {
 	}

 	public Addon(
 			String addonId,
 			String name,
 			String timeblock,
 			String createAdmin,
 			String updateAdmin,
 			String createTs,
 			String updateTs) {
 				setaddonId(addonId);
 				setName(name);
 				setTimeblock(timeblock);
 				setCreateAdmin(createAdmin);
 				setUpdateAdmin(updateAdmin);
 				setCreate_ts(createTs);
 				setUpdate_ts(updateTs);

 	}


 	public String getaddonId() {
 		return addonId;
 	}

 	public String getName() {
 		return name;
 	}

 	public String getTimeblock() {
 		return timeblock;
 	}

 	public String getCreateAdmin() {
 		return createAdmin;
 	}

 	public String getUpdateAdmin() {
 		return updateAdmin;
 	}

 	public String getCreateTs() {
 		return createTs;
 	}

 	public String getUpdateTs() {
 		return updateTs;
 	}

 	public void setaddonId(String addonId) {
 		this.addonId = addonId;
 	}

 	public void setName(String name) {
 		this.name = name;
 	}

 	public void setTimeblock(String timeblock) {
 		this.timeblock = timeblock;
 	}

 	public void setCreateAdmin(String createAdmin) {
 		this.createAdmin = createAdmin;
 	}

 	public void setUpdateAdmin(String updateAdmin) {
 		this.updateAdmin = updateAdmin;
 	}

 	public void setCreate_ts(String createTs) {
 		this.createTs = createTs;
 	}

 	public void setUpdate_ts(String updateTs) {
 		this.updateTs = updateTs;
 	}

 }
