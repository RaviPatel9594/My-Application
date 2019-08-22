import java.util.*;
class Student
{
	protected int books=0,total_books=10,id,borr,ret;
	protected String name;
	Scanner sc=new Scanner(System.in);
	public void accept()
	{
		System.out.println("enter your name:");
		name=sc.nextLine();
	}
	public int borrow()
	{
		System.out.println("enter no. of books:");
		borr=sc.nextInt();
		if(borr<total_books)
		{
			books+=borr;
			return borr;
		}
		else
		{
			System.out.println("books are not available");
			return 0;
		}
	}
	public int Return()
	{	
		if(books==0)
		{
			System.out.println("total no. of borrowed books are :"+books+"\ncannot return books");
			return 0;
		}
		else
		{
			ret=sc.nextInt();
			books-=ret;
			return ret;
		}
	}
	public int total()
	{
		return books;
	}
}
class Library extends Student
{
	Scanner sc = new Scanner(System.in);
	public void Return(int x)
	{	
		total_books+=x;
	}
	public void borrow(int x)
	{
		total_books-=x;
	}
	public int total()
	{
		return total_books;
	}
}
class Main
{
	public static void main(String args[])
	{
		int x,choice=0;
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		s.accept();
		Library l=new Library();
		while(choice!=5)
		{
			System.out.println("1.return a book\n2.borrow a book\n3.total books available\n4.total books borrowed\n5.exit\nenter a choice");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1: x=s.Return();
					if(x!=0) l.Return(x);
					break;
				case 2: x=s.borrow();
					if(x!=0) l.borrow(x);
					break;
				case 3: x=l.total();
					System.out.println("books available are:"+x);
					break;
				case 4: x=s.total();
					System.out.println("total books borrowed are: "+x);
					break;
				case 5: break;
				default:System.out.println("enter a valid choice");
			}
		}
	}
}
					
		









	