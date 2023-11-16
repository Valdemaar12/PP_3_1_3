package ru.bogomolov.springsecurity.service;

import ru.bogomolov.springsecurity.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
}
