package com.bookstore.bookstore_api.controller;


        import com.bookstore.bookstore_api.model.Book;
        import com.bookstore.bookstore_api.service.BookService;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/books")
@CrossOrigin
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public List<Book> getAll() {
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Long id) {
        return service.getBookById(id);
    }

    @PostMapping
    public Book create(@RequestBody Book book) {
        return service.addBook(book);
    }

    @PutMapping("/{id}")
    public Book update(@PathVariable Long id, @RequestBody Book book) {
        return service.updateBook(id, book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteBook(id);
    }
}

