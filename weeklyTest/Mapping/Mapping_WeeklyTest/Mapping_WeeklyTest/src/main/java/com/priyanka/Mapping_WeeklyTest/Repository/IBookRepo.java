package com.priyanka.Mapping_WeeklyTest.Repository;

import com.priyanka.Mapping_WeeklyTest.Model.Book;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends JpaRepository<Book,Long> {
    @Transactional
    @Modifying
    @Query("delete from Book where bookId=:bookId")
    public void deleteBook(@Param("bookId") Long bookId);

    @Transactional
    @Modifying
    @Query("update Book set bookPrice =:bookPrice where bookId = :bookId")
    public void updateBookPrice(@Param("bookPrice") String bookPrice, @Param("bookId") Long bookId);
}