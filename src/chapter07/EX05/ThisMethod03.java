package chapter07.EX05;

class Book{
	
	String bookName; //책 이름
	String author; //팩 저자
	
	Book(){
		bookName = "책이름없음";
		author = "작자미상";
	}
	
	Book(String bookName){
		this();
		this.bookName = bookName;
	}
	Book(String bookName, String author){
		this(bookName); //this() 메소드 호출이고
		this.author = author; //여긴 this 키워드임
	}
	
	void print() {
		System.out.println("책 이름은 : " + bookName);
		System.out.println("저자의 이름은 : " + author);
	}
	
	
	
}

public class ThisMethod03 { 

	public static void main(String[] args) {
		
		//기본생성자 호출
		Book book1 = new Book();
		book1.print();
		
		Book book2 = new Book("심청전");
		book2.print();
		
		Book book3 = new Book("심청전","허균");
		book3.print();
		
		
		
		
		

	}

}
