(function() {
  'use strict';

  app.service('User', User);
  function User() {
    var User = this;
    User.userId = null;
    User.password = null;
    User.first = null;
    User.last = null;
    User.email = null;
    User.address = null;
    User.city = null;
    User.state = null;
    User.postal = null;
    User.phone = null;
    User.altPhone = null;
    User.roleId = null;
    User.services = null;
    User.statusCode = null;
    User.createAdmin = null;
    User.updaateAdmin = null;
    User.createTs = null;
    User.updateTs = null;
    User.isActive = null;

    User.getUserId = function() {
      return User.userId;
    }

    User.getPassword = function() {
      return User.password;
    }

    User.getFirst = function() {
      return User.first;
    }

    User.getLast = function() {
      return User.last;
    }

    User.getEmail = function() {
      return User.email;
    }

    User.getAddress = function() {
      return User.address;
    }

    User.getCity = function() {
      return User.city;
    }

    User.getState = function() {
      return User.state;
    }

    User.getPostal = function() {
      return User.postal;
    }

    User.getPhone = function() {
      return User.phone;
    }

    User.getAltPhone = function() {
      return User.altPhone;
    }

    User.getRoleId = function() {
      return User.roleId;
    }

    User.getServices = function() {
      return User.services;
    }

    User.getStatusCode = function() {
      return User.statusCode;
    }

    User.getCreateAdmin = function() {
      return User.createAdmin;
    }

    User.getUpdateAdmin = function() {
      return User.updateAdmin;
    }

    User.getCreateTs = function() {
      return User.createTs;
    }

    User.getUpdateTs = function() {
      return User.updateTs;
    }

    User.setUserId = function(userId) {
      User.userId = userId;
    }

    User.setPassword = function(password) {
      User.password = password;
    }

    User.setFirst = function(first) {
      User.first = first;
    }

    User.setLast = function(last) {
      User.last = last;
    }

    User.setEmail = function(email) {
      User.email = email;
    }

    User.setAddress = function(address) {
      User.address = address;
    }

    User.setCity = function(city) {
      User.city = city;
    }

    User.setState = function(state) {
      User.state = state;
    }

    User.setPostal = function(postal) {
      User.postal = postal;
    }

    User.setPhone = function(phone) {
      User.phone = phone;
    }

    User.setAltPhone = function(altPhone) {
      User.altPhone = altPhone;
    }

    User.setRoleId = function(roleId) {
      User.roleId = roleId;
    }

    User.setServices = function(services) {
      User.services = services;
    }

    User.setStatusCode = function(statusCode) {
      User.statusCode = statusCode;
    }

    User.setCreateAdmin = function(createAdmin) {
      User.createAdmin = createAdmin;
    }

    User.setUpdateAdmin = function(updateAdmin) {
      User.updateAdmin = updateAdmin;
    }

    User.setCreateTs = function(createTs) {
      User.createTs = createTs;
    }

    User.setUpdateTs = function(updateTs) {
      User.updateTs = updateTs;
    }

    User.setUser = function(data) {
      User.userId = data.staff_id;
      User.password = data.password;
      User.first = data.first;
      User.last = data.last;
      User.email = data.email;
      User.address = data.address;
      User.city = data.city;
      User.state = data.state;
      User.postal = data.postal;
      User.phone = data.phone;
      User.altPhone = data.alt_phone;
      User.roleId = data.role_id;
      User.services = data.services;
      User.statusCode = data.status_code;
      User.createAdmin = data.create_admin;
      User.updaateAdmin = data.update_admin;
      User.createTs = data.create_ts;
      User.updateTs = data.update_ts;
      User.isActive = data.is_active;
    }

    User.resetUser = function() {
      User.userId = null;
      User.password = null;
      User.first = null;
      User.last = null;
      User.email = null;
      User.address = null;
      User.city = null;
      User.state = null;
      User.postal = null;
      User.phone = null;
      User.altPhone = null;
      User.roleId = null;
      User.services = null;
      User.statusCode = null;
      User.createAdmin = null;
      User.updaateAdmin = null;
      User.createTs = null;
      User.updateTs = null;
      User.isActive = null;
    }
    User.getUser = function() {
      return User;
    }
  }
})();
