class Library(serial:Int, title:String,author:String,pYear:Int) {
    var book1 = Book(1,"kot69","Babaji",2023)
    var book2 = Book(2,"The Note Book","Nicholas",2004)
    var book3 = Book(3,"Safe Heaven","Nicholas",2010)
    var book4 = Book(4,"Poor Dad Reach Dad","Robert kiyosaki",1997)
    var book5 = Book(5,"Natto Totto","Kolostantin stanoslavasky",1938)
    var book6 = Book(serial,title, author, pYear)


    fun showLibraryBooks() {
        book1.display()
        book2.display()
        book3.display()
        book4.display()
        book5.display()
    }

    fun updateBookList() {
        book1.display()
        book2.display()
        book3.display()
        book4.display()
        book5.display()
        book6.display()
    }
}
