class Book {
    var title:String= ""
    var author:String= ""
    var pYear:Int= 0
    var serial:Int = 0

    constructor(serial:Int, title:String,author:String,pYear:Int) {
        this.serial = serial
        this.title = title
        this.author = author
        this.pYear = pYear
    }

    fun display() {
        println("${serial}. Title: ${title}, Aurthor: ${author}, Publishing Year: ${pYear} ")
    }
}