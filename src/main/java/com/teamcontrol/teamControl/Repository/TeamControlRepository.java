package com.teamcontrol.teamControl.Repository;

import com.teamcontrol.teamControl.Entity.TeamControlEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamControlRepository extends JpaRepository<TeamControlEntity, Long> {


    @Query (value = " SELECT * FROM TEAM WHERE STATUS = :status", nativeQuery = true)
    List<TeamControlEntity> findByStatus(@Param("status") String status);

    TeamControlEntity findById(long id);
}
