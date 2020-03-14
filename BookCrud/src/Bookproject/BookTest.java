package Bookproject;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.BookDao;
import dto.Book;

public class BookTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		BookDao dao=new BookDao("jdbc:mysql://localhost:3306/cts","root","root");
		dao.connect();
		Book book=new Book(1010,"Data","Mathew",5654);
		int ch=0;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("********** Book CRUD Opeartions ************");
			System.out.println("1.Insert Book");
			System.out.println("2.Update Book");
			System.out.println("3.Delete Book");
			System.out.println("4.Show All Books");
			System.out.println("5.exit");
			System.out.println("Enter your Choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				dao.insertBook(book);System.out.println("Book Inserted");
				break;
			case 2:
				dao.updateBook(book);System.out.println("Book Updated");
				break;
			case 3:
				dao.deleteBook(book);System.out.println("Book deleted");
				break;
			case 4:
				List<Book> books=dao.listAllBooks();
				for(Book b:books) {
					System.out.println(b.getTitle()+" "+b.getAuthor());
				}
				break;
			case 5:System.exit(0);
			default:System.out.println("Wrong Choice");
			}
		}
	}

}
