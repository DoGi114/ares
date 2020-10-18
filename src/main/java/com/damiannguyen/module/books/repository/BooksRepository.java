package com.damiannguyen.module.books.repository;

import com.damiannguyen.module.books.entity.BooksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BooksRepository extends JpaRepository<BooksEntity, Long>, JpaSpecificationExecutor<BooksEntity> {
}

