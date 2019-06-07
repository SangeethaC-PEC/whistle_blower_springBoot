package com.springboot.Controller;

import com.springboot.Entity.Whistle;
import com.springboot.Service.WhistleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

    @RestController
    @RequestMapping("/comp")
    public class WhistleController {

        @Autowired
        private WhistleService whistleService;

        @RequestMapping(method = RequestMethod.GET)
        public Collection<Whistle> getAllStudents(){
            return whistleService.getAllComplaints();
        }

        @RequestMapping(value = "/{id}", method = RequestMethod.GET)
        public Whistle getWhistleById(@PathVariable("id") int id){
            return whistleService.getComplaintsById(id);
        }

        @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
        public void deleteWhistleById(@PathVariable("id") int id){
            whistleService.removeComplaintsById(id);
        }

        @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
        public void deleteWhistleById(@RequestBody Whistle student){
            whistleService.updateComplaints(student);
        }

        @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
        public void insertWhistle(@RequestBody Whistle student){
            whistleService.insertComplaints(student);
        }
    }
