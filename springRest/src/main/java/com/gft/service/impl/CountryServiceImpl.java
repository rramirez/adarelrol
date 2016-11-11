package com.gft.service.impl;

import com.gft.bean.Country;
import java.util.List;
import com.gft.dao.CountryDAO;
import com.gft.dao.impl.CountryDAOImpl;
import com.gft.service.CountryService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CountryServiceImpl implements CountryService {
 
    @Autowired
    CountryDAO dao = new CountryDAOImpl();
     
    public List<Country> getAllCountries() 
    {
        return dao.getAllCountries();
    }
}