package ca.drewm.example.webapi.models;

import java.time.LocalDate;

public class Book
{
   private String author;
   private String title;
   private LocalDate releaseDate;

   public Book() { }

   public Book(String author, String title, LocalDate releaseDate)
   {
      this.author = author;
      this.title = title;
      this.releaseDate = releaseDate;
   }

   public String getAuthor()
   {
      return author;
   }

   public void setAuthor(String author)
   {
      this.author = author;
   }

   public String getTitle()
   {
      return title;
   }

   public void setTitle(String title)
   {
      this.title = title;
   }

   public LocalDate getReleaseDate() {
      return releaseDate;
   }

   public void setReleaseDate(LocalDate releaseDate) {
      this.releaseDate = releaseDate;
   }
}