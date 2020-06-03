package org.geekbang.time.commonmistakes.ch16_datetime.mysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TimeRepository extends JpaRepository<TimeEntity, Long> {
}
