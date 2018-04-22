package com.test.service;

import com.test.exception.FundDetailException;
import com.test.model.FundDetail;
import com.test.repository.FundDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundDetailService {

    private FundDetailRepository repository;

    @Autowired
    public void setFundDetailRepository(FundDetailRepository repository)
    {
        this.repository=repository;
    }

    public FundDetail getFundById (long id) throws FundDetailException
    {
        FundDetail fDetail=repository.getOne(id);
        if(fDetail==null)
        {
            throw new FundDetailException("Fund details for id = " + id + " not found");
        }
        return fDetail;
    }

    public List<FundDetail> getAllFunds ()
    {
        return repository.findAll();
    }

    public FundDetail getFundBySecId (String secId)
    {
        return repository.findByMStarID(secId);
    }

    public void saveFund(FundDetail fund)
    {
        repository.save(fund);
    }

    public void updateFund(FundDetail fund)
    {
        repository.save(fund);
    }

    public boolean fundExists(String secId)
    {
        return repository.findByMStarID(secId)!=null;
    }

}
