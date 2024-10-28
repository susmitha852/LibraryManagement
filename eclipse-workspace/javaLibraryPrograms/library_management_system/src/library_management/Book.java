package library_management;

public class Book {
	private String title;//java sql python
	private int id;//id should be even
	private int cost;//300-3000
	private int noOfPages;//500-3000
	private String author;//james scott alean
	public Book() {}
	
	public Book(String title, int id, int cost, int noOfPages, String author)  {
		if(validTitle(title))
		{
			this.title = title;
		}
		else {
			throw new TitleMisMatchException();
		}
		if(validId(id))
		{
			this.id = id;
		}
		else {
			throw new IdOutOfBoundsException();
		}
		if(validCost(cost))
		{
			this.cost = cost;
		}
		else {
			throw new InvalidCostException();
		}
		if(validNoOfPages(noOfPages))
		{
			this.noOfPages = noOfPages;
		}
		else {
			throw new PagesOutOfBoundsException();
		}
		if(validAuthor(author))
		{
			this.author = author;
		}
		else {
			throw new AuthorNotFoundException();
		}
		
		
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean validTitle(String title)
	{
		if(title.equalsIgnoreCase("java")||title.equalsIgnoreCase("sql")||title.equalsIgnoreCase("python"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean validId(int id)
	{
		if(id%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean validCost(int cost)
	{
		if(cost>300 && cost<2000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean validNoOfPages(int noOfPages)
	{
		if(noOfPages>500 && noOfPages<3000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean validAuthor(String author)
	{
		if(author.equalsIgnoreCase("james")||author.equalsIgnoreCase("effcodd")||author.equalsIgnoreCase("ritche"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void display()
	{
		System.out.println("----------------------------------------");
		System.out.println("Book title: "+getTitle());
		System.out.println("Book Id: "+getId());
		System.out.println("Book Cost: "+getCost());
		System.out.println("No of Pages in the book: "+getNoOfPages());
		System.out.println("Author of the Book: "+getAuthor());
		System.out.println("----------------------------------------");
	}
	@Override
	public String toString() {
		return "\nBook title=" + getTitle() + "\nId=" + getId() + "\nCost=" + getCost() + "\nNoOfPages=" + getNoOfPages() + "\nAuthor="
				+ getAuthor();
	}
	
	
	
}
