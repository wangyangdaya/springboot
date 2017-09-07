package com.demo.repository;

import com.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author wangy
 * @contact QQ 837195190
 * @created by thinkpad on 2017/8/29.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select t from User t where t.name = :name")
    User findByUserName(@Param("name") String name);

}
