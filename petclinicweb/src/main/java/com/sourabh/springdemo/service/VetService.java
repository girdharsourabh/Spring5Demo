package com.sourabh.springdemo.service;

import com.sourabh.spring5demo.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findbyId(long id);

    Vet save(Vet vet);

    Vet findByLastName(String lastName);

    Set<Vet> findAll();
}
