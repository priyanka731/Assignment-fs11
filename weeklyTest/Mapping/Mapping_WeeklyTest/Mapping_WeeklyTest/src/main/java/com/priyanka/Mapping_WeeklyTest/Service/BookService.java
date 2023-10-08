package com.priyanka.Mapping_WeeklyTest.Service;

import com.priyanka.Mapping_WeeklyTest.Model.Book;
import com.priyanka.Mapping_WeeklyTest.Repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {

    @Autowired
    IBookRepo bookRepo;

    public Iterable<Book> getAllBook(){
        return bookRepo.findAll();
    }

    public void addBook(Book book) {
        bookRepo.save(book);
    }

    public String updateBook(Long bookId, String bookPrice) {

        if(bookRepo.existsById(bookId)){
            bookRepo.updateBookPrice(bookPrice,bookId);
            return "Book Price  is Updated";
        }
        else{
            return "Book Id does not exist";
        }
    }

    public String deleteBook(Long bookId){
        if (bookRepo.existsById(bookId)){
            bookRepo.deleteBook(bookId);
            return "Book is deleted";
        }
        else{
            return "Book Id does not exists";
        }
    }
}