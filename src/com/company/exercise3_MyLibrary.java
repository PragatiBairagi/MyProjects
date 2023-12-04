      /*You have to implement a library using java class Library
        Methods : addBook, issueBook , returnBook, showAvailableBooks
        Properties : Array to store the available books,
        Array to store the issued books
        */

      package com.company;

      class Lib{
         String[] books;
         int no_of_books ;

          Lib(){
              this.books = new String[100];
              this.no_of_books = 0;
          }

          void addBook(String book){

              this.books[no_of_books++] = book;
              System.out.println(book+" has been added");
          }

          void showAvailableBooks(){
              System.out.println("Available books are: ");
              for (String book:this.books) {
                  if(book==null){
                      continue;
                  }
                  System.out.println(" * "+book);
              }
          }

          void issueBook(String book){
              for(int i = 0;i<this.books.length;i++){
                  if(this.books[i].equals(book)){
                      System.out.println("The book has been issued!");
                      this.books[i]=null;
                      return;
                  }

              }
              System.out.println("Currently this books is not available");
          }

          void returnBook(String book){
              addBook(book);
          }
      }


class Library{
    public static void main(String[] args) {
         Lib centralLibrary = new Lib();
         centralLibrary.addBook("Bhagwat Geeta");
         centralLibrary.addBook("Rich dad poor dad");
         centralLibrary.addBook("The leader who had no title");
         centralLibrary.addBook("Thinking fast and slow");
         centralLibrary.addBook("Eat that frog");
         centralLibrary.addBook("Retire young retire rich");
         centralLibrary.addBook("Better than before");
         centralLibrary.addBook("Option B");
         centralLibrary.addBook("Getting things done");
         centralLibrary.addBook("Ikigai");
         centralLibrary.addBook("The monk who sold his Ferrary");
         centralLibrary.addBook("The lean startup");
         centralLibrary.addBook("The 5 seconds rule");
         centralLibrary.addBook("Thinking fast and slow");
         centralLibrary.addBook("How to win friends and influence people");
         centralLibrary.showAvailableBooks();
         centralLibrary.issueBook("Rich dad poor dad");
         centralLibrary.showAvailableBooks();
         centralLibrary.returnBook("Rich dad poor dad");
         centralLibrary.showAvailableBooks();
    }
}




//