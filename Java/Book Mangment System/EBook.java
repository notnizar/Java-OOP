public class EBook extends Book {

    private double fileSizeMB;

    public EBook(String title, String author, Double price, Double fileSizeMB) {
        super(title, author, price);
        this.fileSizeMB = fileSizeMB;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public String toString() {
        return "EBook{" + super.toString() + " " + "fileSizeMB=" + fileSizeMB + '}';
    }

}
