package library_management;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
	private int libId;
	private String location;
	
	private Book b;
	
	private ArrayList<Book> book=new ArrayList<Book>();
	
	public void addBook(Book b)
	{
		book.add(b);
		System.out.println("Book Added Successfully...");
		
	}
	public void displayBook()
	{
		if(book.isEmpty())
		{
			System.err.println("Books are not yet added....!");
		}
		else
		{
			for(Book b:book)
			{
				b.display();
			}
		}
	}
	public void searchBookBasedOnId(int id)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.err.println("Books are not yet Added....!");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getId()==id)
				{
					System.out.println("Book found..."+b.getTitle());
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			throw new IdOutOfBoundsException();
		}
	}
	public void searchBookBasedOnAuthor(String author)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.err.println("Books are not yet Added....!");
			
		}
		else
		{
			for(Book b:book)
			{
				if(b.getAuthor().equals(author))
				{
					System.out.println("Book found..."+b.getTitle());
					isFound=true;
				}
			}
			if(isFound==false)
			{
				System.err.println("You have entered invalid author name");
			}
		}
		
	}
	public void upadateBookCostBasedOnTitle(String title)
	{
		boolean isUpdated=false;
		if(book.isEmpty())
		{
			System.err.println("Books are not yet Added....!");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getTitle().equals(title))
				{
					b.setCost(1000);
					System.out.println("Book cost updated...");
					isUpdated=true;
				}
			}
			if(isUpdated==false)
			{
				System.err.println("You have entered invalid book title....book not found");
			}
		}
		
	}
	public void removeBookBasedOnId(int id)
	{
		Iterator<Book> itr=book.iterator();
		boolean isRemoved=false;
		if(book.isEmpty())
		{
			System.out.println("Books are not yet Added");
		}
		else
		{
			while(itr.hasNext())
			{
				Book b=itr.next();
				if(b.getId()==id)
				{
					itr.remove();
					System.out.println("Book removed...");
					isRemoved=true;
				}
			}
			if(isRemoved==false)
			{
				System.out.println("Invalid book Id....Book not found");
			}
		}
		
	}
	
}
