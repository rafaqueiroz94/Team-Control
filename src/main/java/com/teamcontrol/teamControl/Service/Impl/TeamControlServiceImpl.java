package com.teamcontrol.teamControl.Service.Impl;


import com.teamcontrol.teamControl.Entity.StatusType;
import com.teamcontrol.teamControl.Entity.TeamControlEntity;
import com.teamcontrol.teamControl.Repository.TeamControlRepository;
import com.teamcontrol.teamControl.Service.TeamControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

import static java.lang.String.valueOf;

@Service
public class TeamControlServiceImpl implements TeamControlService {

    @Autowired
    TeamControlRepository repository;

    @Override
    public List getFindAll() {
        return repository.findAll();
    }

    @Override
    public TeamControlEntity gettingById(long id) {
        return repository.findById(id);
    }

    @Override
    public List getFindStatus(StatusType statusType) {
        return repository.findByStatus(statusType.toString());

    }

    @Override
    public TeamControlEntity saveNew(TeamControlEntity teamControlEntity) {
        return repository.save(teamControlEntity);

    }

    @Override
    public TeamControlEntity persist(TeamControlEntity teamControlEntity) {
        return repository.save(teamControlEntity);
    }


    @Override
    public ResponseEntity updateRegistr(long id, TeamControlEntity teamControlEntity, StatusType status){
        TeamControlEntity worker = repository.findById(id);
        worker.setStatus(status);
        worker.setUltimaAtt(valueOf(LocalDate.now()));
        worker.setObs(teamControlEntity.getObs());
        worker.setNovoNumero(teamControlEntity.getNovoNumero());
        worker.setImplantacao(teamControlEntity.getImplantacao());
        worker.setGmud(teamControlEntity.getGmud());
        worker.setApi(teamControlEntity.getApi());
        repository.save(worker);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity deleteWorker(long id) {
        TeamControlEntity user = repository.findById(id);
        if (user.getStatus() == StatusType.DESENVOLVER) {
            repository.deleteById(id);
        }
        else {
            user.setStatus(StatusType.CANCELADO);
            repository.save(user);
        }
        return null;

  }
}


