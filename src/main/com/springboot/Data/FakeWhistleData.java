package com.springboot.Data;

import com.springboot.Entity.Whistle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
@Qualifier("FakeData")
public class FakeWhistleData implements WhistleData {

    private static Map<Integer, Whistle> whistles;
    static
    {
        whistles = new HashMap<Integer, Whistle>()
        {
            {

                String complaintId;
                String companyName;
                String incidentType;
                String association;
                String awareOf;
                String personInvolved;
                String monetorValue;
                String date;
                String auditAware;
                String generalNature;
                String occurancePlace;
                String reviewer;
                put(1,new Whistle("1","Fixnix","Fraud","Mr. xxxx", "yes", "Mr. yyy", "1000000","2nd june 2019", "yes", "no", "accounts dept","O=PartyA,L=London,C=GB"));
                put(2,new Whistle("2","Infosys","scam","Mr. Rav", "yes", "Mr. Rami", "15600000","26 august 2016", "yes", "no", "accounts dept","O=PartyA,L=London,C=GB"));
                put(3,new Whistle("3","Wipro","bribe","Mr. Ragi", "no", "Mr. Ruman", "156000","15 may 2018", "yes", "no", "accounts dept","O=PartyA,L=London,C=GB"));
            }
         };
    }

    @Override
    public Collection<Whistle> getAllWhistle() {
                return  this.whistles.values();

    }

    @Override
    public Whistle getWhistleById(int id) {
                return  this.whistles.get(id);

    }

    @Override
    public void removeWhistleById(int id) {
         this.whistles.remove(id);

    }

    @Override
    public void updateWhistle(Whistle whistle) {

        Whistle w=whistles.get(whistle.getComplaintId());
        w.setCompanyName(whistle.getCompanyName());
        w.setIncidentType(whistle.getIncidentType());
        w.setAssociation(whistle.getAssociation());
        w.setAwareOf(whistle.getAwareOf());
        w.setPersonInvolved(whistle.getPersonInvolved());
        w.setMonetorValue(whistle.getMonetorValue());
        w.setDate(whistle.getDate());
        w.setAuditAware(whistle.getAuditAware());
        w.setGeneralNature(whistle.getGeneralNature());
        w.setOccurancePlace(whistle.getOccurancePlace());
        w.setReviewer(whistle.getReviewer());
        whistles.put(whistle.getComplaintId(),whistle);

    }

    @Override
    public void insertWhistleToDb(Whistle whistle) {
        this.whistles.put(whistle.getComplaintId(),whistle);



    }
}
