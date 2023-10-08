package com.priyanka.Mapping_WeeklyTest.Controller;


import com.priyanka.Mapping_WeeklyTest.Model.Book;
import com.priyanka.Mapping_WeeklyTest.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("book")
    public Iterable<Book> getAllBook(){
        return bookService.getAllBook();
    }

    @PostMapping("book")
    public void addBook(@RequestBody Book book)
    {
        bookService.addBook(book);
    }

    @PutMapping("book/update/of")
    public String updateBook(@RequestParam("bookId") Long bookId,@RequestParam("bookPrice") String bookPrice){
        return bookService.updateBook(bookId,bookPrice);
    }

    @DeleteMapping("book/delete/of")
    public String deleteBook(@RequestParam("bookId") Long bookId){
        return bookService.deleteBook(bookId);
    }
}