package com.companyname.springbootcrudrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.companyname.springbootcrudrest.model.User;

// Indicates that this interface is a repository, which is used to interact with the User entity.
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
