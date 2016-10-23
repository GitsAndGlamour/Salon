(function() {
  'use strict';

  app.service('User', User);
  function User() {

    this.userId = null;
    this.password = null;
    this.first = null;
    this.last = null;
    this.email = null;
    this.address = null;
    this.city = null;
    this.state = null;
    this.postal = null;
    this.phone = null;
    this.altPhone = null;
    this.roleId = null;
    this.services = null;
    this.statusCode = null;
    this.createAdmin = null;
    this.updaateAdmin = null;
    this.createTs = null;
    this.updateTs = null;
    this.isActive = null;

    this.getUserId = function() {
      return this.userId;
    }

    this.getPassword = function() {
      return this.password;
    }

    this.getFirst = function() {
      return this.first;
    }

    this.getLast = function() {
      return this.last;
    }

    this.getEmail = function() {
      return this.email;
    }

    this.getAddress = function() {
      return this.address;
    }

    this.getCity = function() {
      return this.city;
    }

    this.getState = function() {
      return this.state;
    }

    this.getPostal = function() {
      return this.postal;
    }

    this.getPhone = function() {
      return this.phone;
    }

    this.getAltPhone = function() {
      return this.altPhone;
    }

    this.getRoleId = function() {
      return this.roleId;
    }

    this.getServices = function() {
      return this.services;
    }

    this.getStatusCode = function() {
      return this.statusCode;
    }

    this.getCreateAdmin = function() {
      return this.createAdmin;
    }

    this.getUpdateAdmin = function() {
      return this.updateAdmin;
    }

    this.getCreateTs = function() {
      return this.createTs;
    }

    this.getUpdateTs = function() {
      return this.updateTs;
    }

    this.setUserId = function(userId) {
      this.userId = userId;
    }

    this.setPassword = function(password) {
      this.password = password;
    }

    this.setFirst = function(first) {
      this.first = first;
    }

    this.setLast = function(last) {
      this.last = last;
    }

    this.setEmail = function(email) {
      this.email = email;
    }

    this.setAddress = function(address) {
      this.address = address;
    }

    this.setCity = function(city) {
      this.city = city;
    }

    this.setState = function(state) {
      this.state = state;
    }

    this.setPostal = function(postal) {
      this.postal = postal;
    }

    this.setPhone = function(phone) {
      this.phone = phone;
    }

    this.setAltPhone = function(altPhone) {
      this.altPhone = altPhone;
    }

    this.setRoleId = function(roleId) {
      this.roleId = roleId;
    }

    this.setServices = function(services) {
      this.services = services;
    }

    this.setStatusCode = function(statusCode) {
      this.statusCode = statusCode;
    }

    this.setCreateAdmin = function(createAdmin) {
      this.createAdmin = createAdmin;
    }

    this.setUpdateAdmin = function(updateAdmin) {
      this.updateAdmin = updateAdmin;
    }

    this.setCreateTs = function(createTs) {
      this.createTs = createTs;
    }

    this.setUpdateTs = function(updateTs) {
      this.updateTs = updateTs;
    }

    this.setUser = function(data) {
      this.userId = data.staff_id;
      this.password = data.password;
      this.first = data.first;
      this.last = data.last;
      this.email = data.email;
      this.address = data.address;
      this.city = data.city;
      this.state = data.state;
      this.postal = data.postal;
      this.phone = data.phone;
      this.altPhone = data.alt_phone;
      this.roleId = data.role_id;
      this.services = data.services;
      this.statusCode = data.status_code;
      this.createAdmin = data.create_admin;
      this.updaateAdmin = data.update_admin;
      this.createTs = data.create_ts;
      this.updateTs = data.update_ts;
      this.isActive = data.is_active;
    }

    this.getUser = function() {
      return this;
    }
  }
})();
