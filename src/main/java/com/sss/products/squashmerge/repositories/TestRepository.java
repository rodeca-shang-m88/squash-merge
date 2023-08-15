package com.sss.products.squashmerge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sss.products.squashmerge.domain.entities.Person;

public interface TestRepository extends JpaRepository<Person, Long> {

}
