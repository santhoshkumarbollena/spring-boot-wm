package com.example.DMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.DMS.Models.Dog;

import java.util.*;

public interface DogRepository extends CrudRepository<Dog,Integer> {

}
