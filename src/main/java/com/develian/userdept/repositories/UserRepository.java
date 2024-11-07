package com.develian.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.develian.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
