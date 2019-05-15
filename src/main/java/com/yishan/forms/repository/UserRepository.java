package com.yishan.forms.repository;

import com.yishan.forms.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
