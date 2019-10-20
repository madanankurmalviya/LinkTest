package hasSet;

public class Book implements Comparable
{
	private String BookName ;
	private String AuthorName;
	private int Price;
	
	public Book(String name,String author,int price)
	{
		this.BookName=name;
		this.AuthorName=author;
		this.Price=price;
	}
	public String getBookName()
	{
		return this.BookName;
	}
	public void setBookName(String name)
	{
		this.BookName=name;
	}
	
	public String setAuthorName()
	{
		return this.AuthorName;
	}
	public void getAuthorName(String author)
	{
		this.AuthorName=author;
	}
	
	public int getPrice()
	{
		return this.Price;
	}
	public void setPrice(int price)
	{
		Price =price;
	}
	
	public String toString()
	{
		return BookName+"\t\t"+AuthorName+"\t\t"+Price;
	}
	
	@Override
	public int compareTo(Object comPrice)
	{
		int compPrice = ((Book)comPrice).getPrice();
		return this.Price-compPrice;
		
	}
	
}

