
package com.gft.bean;

@lombok.Setter
@lombok.Getter
@lombok.AllArgsConstructor
@lombok.RequiredArgsConstructor

public class Country implements Comparable<Country> {
    
    private int id;
    private String name;
    
    @Override
    public String toString()
    {
        return "id: " + this.id;
    }
    
     @Override
    public int compareTo(Country country) {
        return this.id - country.id;
    }
    
}
