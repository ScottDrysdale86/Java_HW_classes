public class Printer {
//    Create a Printer class that has a property for number of sheets of paper left.
//    Add a method to print that takes in a number of pages and number of copies.
//    The print method will only run if the printer has enough paper.
//    If it runs it will reduce the value of the paper left by number of copies * number of pages.
//    Add a toner volume property to the class.
//    Modify the printer so that it reduces the toner by 1 for each page printed.
    private int pagesLeft;
    private int tonerVolume;

    public Printer(int _pagesLeft, int _tonerVolume){
        this.pagesLeft = _pagesLeft;
        this.tonerVolume = _tonerVolume;
    }

    public int getPagesLeft() {
        return this.pagesLeft;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }

    public String print(int pages, int copies){
        if ( this.pagesLeft >= pages*copies) {
            this.pagesLeft -= pages*copies;
            this.tonerVolume -= pages*copies;
        }
        return "not enough pages";
    }
}
