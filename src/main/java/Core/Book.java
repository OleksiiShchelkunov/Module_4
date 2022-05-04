package Core;

public class Book {

    private String name;
    private int price;

    public Book (String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString () {
        return "Book name="+name+" "+"book price="+price+"\n";
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Book)) {
            return false;
        }

        Book book = (Book) o;

        return book.name.equals(name) &&
                book.price == price;
    }

    //Idea from effective Java : Item 9
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + price;
        return result;
    }
}
