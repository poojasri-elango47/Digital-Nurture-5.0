package com.country.Orm_Learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.country.Orm_Learn.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

}