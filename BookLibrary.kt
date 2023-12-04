import java.util.Scanner
var scan= Scanner(System.`in`)
fun main(args: Array<String>) {
    println("\n********************************")
    println("*********** WELCOME TO **********")
    println("** White Coller's Book Library **")
    println("*********************************\n")

    println("-What can we do for you?")
    println("1. Searching for books.")
    println("2. Adding books.")
    println("3. Borrowing books.")
    println("4. Returning books.\n")

    print("-Enter serial number to choose an option: ")
    var choise = scan.nextInt()

    if(choise == 1) {
        searchBook()
    }else if(choise == 2) {
        addBook()
    }else if(choise == 3) {
        borrowing()
    }else if(choise == 4) {
        returning()
    }

}
//////////////////////////////////////////////////////////
fun searchBook() {
    var availableBooks = Library(0, "", "", 0)
    println("-Our available books is:")
    availableBooks.showLibraryBooks()
    println()
    println("-How do you want to search?")
    println("1. Search by the author's name.")
    println("2. Search by publishing year.")
    print("-Enter serial number to choose an option: ")
    var choise = scan.nextInt()

    if(choise == 1) {
        authorSearch()
    }else if(choise == 2) {
        yearSearch()
    }
}

fun authorSearch() {
    println("Coming Soon...")
//    print("Enter Author Name: ")
//    var searchAuthor = readln()
//    if(searchAuthor.equals("")) {
//
//    }
}
fun yearSearch() {
    println("Coming Soon...")
}

//////////////////////////////////////////////////////////
fun addBook() {
    println("-Please consider with us..")
    print("Enter Book Title: ")
    var newB_Title:String = readln()

    print("Enter Author Name: ")
    var newB_Author = readln()

    print("Enter Publication Year: ")
    var newB_PYear = scan.nextInt()

    println("Thank you for adding a new book.\n")

    var newBook = Library(6,newB_Title, newB_Author, newB_PYear)
    println("-Updated book list is:")
    newBook.updateBookList()
}

//////////////////////////////////////////////////////////
fun borrowing() {
    println("Coming Soon...")
}

//////////////////////////////////////////////////////////
fun returning() {
    println("-Please follow those steps for returning book.")
    print("Enter Book Title: ")
    var newB_Title:String = readln()

    print("Enter Author Name: ")
    var newB_Author = readln()

    print("Enter Publication Year: ")
    var newB_PYear = scan.nextInt()

    println("Thank you for adding a new book.\n")
    display(newB_Title, newB_Author, newB_PYear)

}

//////////////////////////////////////////////////////////
fun display(newB_Title:String, newB_Author:String, newB_PYear:Int) {
    println("New book details is:")
    println("Title: ${newB_Title}, Aurthor: ${newB_Author}, Publishing Year: ${newB_PYear} ")
}






