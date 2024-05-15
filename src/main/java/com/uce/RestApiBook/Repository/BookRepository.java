package com.uce.RestApiBook.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.uce.RestApiBook.Entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByPriceBetween(Double priceMin, Double priceMax);

    @Query("SELECT b FROM Book b WHERE b.price BETWEEN :priceMin AND :priceMax")
    List<Book> findByPriceInRange(@Param("priceMin") Double priceMin, @Param("priceMax") Double priceMax);
}
