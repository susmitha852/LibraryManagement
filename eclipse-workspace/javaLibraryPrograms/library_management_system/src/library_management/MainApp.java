package library_management;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		String title;
		int id;
		int noOfPages;
		int cost;
		String author;
		Library l=new Library();
		Scanner sc=new Scanner(System.in);
		boolean isStart=true;
		while(isStart)
		{
			System.out.println("Enter the choice: \n 1. Add Book  \n 2.Display Book \n 3.Search book based on Id\n 4.Search book based on Author\n "
					+ "5.Update book cost based on title\n 6.Remove book\n");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					while(true)
					{
						try {
							System.out.println("Ener the Book title : ");
							title=sc.next();
							System.out.println("Enter the Book Id : ");
							id=sc.nextInt();
							System.out.println("Enter the Book Cost : ");
							cost=sc.nextInt();
							System.out.println("Enter the no of pages in the book : ");
							noOfPages=sc.nextInt();
							System.out.println("Ener the author name : ");
							author=sc.next();
							l.addBook(new Book(title,id,cost,noOfPages,author));
							break;
						}
						catch(TitleMisMatchException e)
						{
							System.out.println("Entered invalid title....! give valid title");
							title=sc.next();
						}
						catch(IdOutOfBoundsException e)
						{
							System.out.println("Entered invalid id....! give valid id");
							id=sc.nextInt();
						}
						catch(InvalidCostException e)
						{
							System.out.println("Entered invalid cost....! give valid cost");
						}
						catch(PagesOutOfBoundsException e)
						{
							System.out.println("Entered invalid pages....! give valid no of pages");
						}
						catch(AuthorNotFoundException e)
						{
							System.out.println("Entered invalid author....! give valid author name");
						}
						
					}
					
				}
				break;
				case 2:
				{
					l.displayBook();
					break;
				}
			
				case 3:
				{
					System.out.println("Enter Id to search book : ");
					id=sc.nextInt();
					l.searchBookBasedOnId(id);
					break;
				}
				
				case 4:
				{
					System.out.println("Enter author name to search book : ");
					title=sc.next();
					l.searchBookBasedOnAuthor(title);
					break;
				}
				
				case 5:
				{
					System.out.println("Enter title to search book : ");
					title=sc.next();
					l.upadateBookCostBasedOnTitle(title);
					break;
				}
				
				case 6:
				{
					System.out.println("Enter id to remove Book");
					id=sc.nextInt();
					l.removeBookBasedOnId(id);
					break;
				}
			
				case 7:
				{
					isStart=false;
					System.out.println("*.....Thank You.....*");
					break;
				}
		
				default:
					System.err.println("Enter Valid choice....!");
			}
		}
	}
}
