package com.teamcontrol.teamControl.Controller;


import com.sun.istack.NotNull;
import com.teamcontrol.teamControl.Entity.StatusType;
import com.teamcontrol.teamControl.Entity.TeamControlEntity;
import com.teamcontrol.teamControl.Service.TeamControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static java.lang.String.valueOf;

@Controller
@ResponseBody
@RequestMapping ("/api")
@CrossOrigin (origins = "*")
public class TeamControlController {

    @Autowired
    TeamControlService service;

    @PostMapping("/list")
    public ResponseEntity saveNewTeamControl(@RequestBody TeamControlEntity teamControlEntity) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.saveNew(teamControlEntity));
    }

    @GetMapping("/list")
    public List getFindAll() {
        return service.getFindAll();
    }

    @GetMapping("/list/{id}")
    public TeamControlEntity findById(@PathVariable(value = "id") long id) {
        return service.gettingById(id);
    }

    @GetMapping("/list/status")
    public List<TeamControlEntity> searchStatus(@RequestParam StatusType status) {
        return service.getFindStatus(status);
    }

    @PatchMapping("/list/{id}")
    public ResponseEntity updateRegistr(@PathVariable(value = "id") long id,
                                        StatusType status, @RequestBody TeamControlEntity teamControlEntity) {
       TeamControlEntity us = service.gettingById(id);
            return service.updateRegistr(id,teamControlEntity,status);
        }
    @DeleteMapping("/list/{id}")
    public ResponseEntity delete(@PathVariable(value = "id")long id){
         return service.deleteWorker(id);

    }

}













