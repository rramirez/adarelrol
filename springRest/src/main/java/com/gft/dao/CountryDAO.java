package com.gft.dao;

import com.gft.bean.Country;
import java.util.List;

public interface CountryDAO {
    
    public List<Country> getAllCountries();
    public List<Country> createCountryList();
}
