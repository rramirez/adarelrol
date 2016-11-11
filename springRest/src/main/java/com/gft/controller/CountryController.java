package com.gft.controller;

import java.util.ArrayList;  
import java.util.List;    
import com.gft.bean.Country;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RestController; 
import com.gft.service.CountryService;
import com.gft.service.impl.CountryServiceImpl;
import java.util.Collections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController  
public class CountryController {  
    
    private static final Logger logger = LoggerFactory.getLogger(CountryController.class);
    private CountryService countryService = new CountryServiceImpl();
   
 @RequestMapping(value = "/countries", method = RequestMethod.GET,headers="Accept=application/json")  
 public List<Country> getCountries()  
 {  
  List<Country> listOfCountries = new ArrayList<Country>();
  listOfCountries = countryService.getAllCountries();  
  return listOfCountries;  
 }  
  
 @RequestMapping(value = "/countries/{id}", method = RequestMethod.GET,headers="Accept=application/json")  
 public Country getCountryById(@PathVariable int id)  
 {
     
  int posicion;   
  List<Country> listOfCountries = new ArrayList<Country>();  
  listOfCountries = countryService.getAllCountries();
  Country country = new Country();
  country.setId(id);
  
  Collections.sort(listOfCountries);
  posicion = Collections.binarySearch(listOfCountries, country);
  
  logger.info("La posicion es: " + posicion);
  
     if (posicion >= 0) {
         return listOfCountries.get(posicion);
     }
     else
        return null;  
 }   
}  