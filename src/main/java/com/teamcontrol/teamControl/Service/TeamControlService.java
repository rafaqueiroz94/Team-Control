package com.teamcontrol.teamControl.Service;

import com.teamcontrol.teamControl.Entity.StatusType;
import com.teamcontrol.teamControl.Entity.TeamControlEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TeamControlService {

    List getFindAll();


    TeamControlEntity gettingById(long id);


    List getFindStatus(StatusType statusType);


    TeamControlEntity saveNew(TeamControlEntity teamControlEntity);

    TeamControlEntity persist(TeamControlEntity teamControlEntity);


    ResponseEntity updateRegistr(long id, TeamControlEntity teamControlEntity, StatusType status);

    ResponseEntity deleteWorker(long id);
}
