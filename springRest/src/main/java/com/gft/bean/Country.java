package com.gft.bean;
// Generated 11-nov-2016 16:56:55 by Hibernate Tools 4.3.1

@lombok.Setter
@lombok.Getter
@lombok.AllArgsConstructor
@lombok.RequiredArgsConstructor
public class Country implements java.io.Serializable, Comparable<Country> {

    private Integer id;
    private String name;

    @Override
    public int compareTo(Country country) {
        return this.id - country.id;
    }
}