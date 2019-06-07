package com.springboot.Service;

import com.springboot.Data.WhistleData;
import com.springboot.Entity.Whistle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Qualifier("FakeData")
public class WhistleService {

    @Autowired
    private WhistleData whistleData;

    public Collection<Whistle> getAllComplaints(){
        return this.whistleData.getAllWhistle();
    }

    public Whistle getComplaintsById(int id){
        return this.whistleData.getWhistleById(id);
    }


    public void removeComplaintsById(int id) {
        this.whistleData.removeWhistleById(id);
    }

    public void updateComplaints(Whistle whistle){
        this.whistleData.updateWhistle(whistle);
    }

    public void insertComplaints(Whistle whistle) {
        this.whistleData.insertWhistleToDb(whistle);
    }
}