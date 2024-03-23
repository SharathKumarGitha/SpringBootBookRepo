package com.api.book.bootrestbook.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "books")
public class Book {

    @Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + "]";
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
	@JsonProperty(value ="book_id")
    private int id;

	
	@JsonProperty(value ="book_name")
    private String title;

//    @OneToOne(cascade = CascadeType.ALL)   
//    @JsonManagedReference 
//    private Author author;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
        
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public Author getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(Author author) {
//        this.author = author;
//    }


}