package com.springboot.Data;

import com.springboot.Entity.Whistle;

import java.util.Collection;

public interface WhistleData {
    Collection<Whistle> getAllWhistle();

    Whistle getWhistleById(int id);

    void removeWhistleById(int id);

    void updateWhistle(Whistle whistle);

    void insertWhistleToDb(Whistle whistle);
}
