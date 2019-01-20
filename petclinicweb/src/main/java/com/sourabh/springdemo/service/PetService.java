package com.sourabh.springdemo.service;

import com.sourabh.spring5demo.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findbyId(long id);

    Pet save(Pet pet);

    Pet findByLastName(String lastName);

    Set<Pet> findAll();
}
