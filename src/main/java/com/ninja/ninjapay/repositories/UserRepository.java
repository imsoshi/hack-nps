package com.ninja.ninjapay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ninja.ninjapay.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
    User findByMobile(String mobile);
    User findByUname(String uname);
    
}
