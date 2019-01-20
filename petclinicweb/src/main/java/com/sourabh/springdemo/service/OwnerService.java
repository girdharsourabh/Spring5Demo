package com.sourabh.springdemo.service;

import com.sourabh.spring5demo.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findbyId(long id);

    Owner save(Owner owner);

    Owner findByLastName(String lastName);

    Set<Owner> findAll();
}
