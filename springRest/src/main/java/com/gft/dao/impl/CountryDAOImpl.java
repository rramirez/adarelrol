package com.gft.dao.impl;

import com.gft.bean.Country;
import java.util.List;
import java.util.ArrayList;
import com.gft.dao.CountryDAO;

public class CountryDAOImpl implements CountryDAO{
    
    public List<Country> createCountryList() 
    {
        List<Country> countries = new ArrayList<Country>();
         
        Country country1 = new Country();
        country1.setName("Mexico");
        country1.setId(9);
        countries.add(country1);
         
        Country country2 = new Country();
        country2.setName("Chile");
        country2.setId(10);
        countries.add(country2);
         
        return countries;
    }
    
    public List<Country> getAllCountries()
    {
        List<Country> countriesGet = createCountryList();
        return countriesGet;
    }
    
}
