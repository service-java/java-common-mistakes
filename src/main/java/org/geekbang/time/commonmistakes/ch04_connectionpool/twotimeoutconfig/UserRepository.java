package org.geekbang.time.commonmistakes.ch04_connectionpool.twotimeoutconfig;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
