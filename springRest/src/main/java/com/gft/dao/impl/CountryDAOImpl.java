package com.gft.dao.impl;

import com.gft.bean.Country;
import java.util.List;
import java.util.ArrayList;
import com.gft.dao.CountryDAO;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Slf4j

public class CountryDAOImpl implements CountryDAO {

    public List<Country> getAllCountries() {
        SessionFactory sf = null;
        Session sesion = null;
        Transaction tx = null;
        Query q = null;
        List<Country> countries = new ArrayList<Country>();

        try {
            sf = HibernateUtil.getSessionFactory();
            sesion = sf.openSession();
            tx = sesion.beginTransaction();
            q = sesion.createQuery("from Country");
            countries = q.list();
            sesion.close();

        }catch(RuntimeException re){
            re.printStackTrace();
            log.error("Error en la BD");
            return null;
        }finally{
            if (sesion.isOpen()) {
                sesion.close();
            }
        }
        if (countries != null) 
                return countries;
        
        return null;
    }

//    public List<Country> createCountryList() 
//    {
//        List<Country> countries = new ArrayList<Country>();
//         
//        Country country1 = new Country();
//        country1.setName("Mexico");
//        country1.setId(9);
//        countries.add(country1);
//         
//        Country country2 = new Country();
//        country2.setName("Chile");
//        country2.setId(10);
//        countries.add(country2);
//         
//        return countries;
//    }
//    
//    public List<Country> getAllCountries()
//    {
//        List<Country> countriesGet = createCountryList();
//        return countriesGet;
//    }
}
