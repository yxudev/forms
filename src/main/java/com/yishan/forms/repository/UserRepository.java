package com.yishan.forms.repository;

import com.yishan.forms.domain.User;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    @Override
    List<User>findAll();

    @Override
    default <S extends User> S save(S entity) {
        return null;
    }

    @Override
    default <S extends User> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    default long count() {
        return 0;
    }

    @Override
    default void deleteById(Long aLong) {

    }

    @Override
    default void delete(User entity) {

    }

    @Override
    default void deleteAll(Iterable<? extends User> entities) {

    }

    @Override
    default void deleteAll() {

    }
}
