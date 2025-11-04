package com.paredesmorafernando.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.paredesmorafernando.spring6webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
