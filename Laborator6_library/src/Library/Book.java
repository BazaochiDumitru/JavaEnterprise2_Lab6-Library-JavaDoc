package Library;
/*
 * Book descrie cartea prin urmatoarele caracteristici:
 * ISBN, titlu, autor, gen, data publicarii, limba, nr de pagini, pretul, disponibilitatea
 */

import java.time.LocalDate;

/**
 * data 12.10.2023
 *
 * @author Bazaochi Dumitru, AW21M
 */
public class Book {

    private int isbn;                // Variabila pentru ISBN-ul cărții
    private String title;           // Variabila pentru titlul cărții
    private String author;          // Variabila pentru autorul cărții
    private String genre;           // Variabila pentru genul cărții
    private LocalDate dateOfRelease; // Variabila pentru data de publicare a cărții
    private String lang;            // Variabila pentru limba cărții
    private int numberOfPages;      // Variabila pentru numărul de pagini al cărții
    private double price;           // Variabila pentru prețul cărții
    private String avalabil;        // Variabila pentru disponibilitatea cărții

    // Constructorul fără argumente al clasei
    public Book() {
    }

    // Constructorul cu argumente al clasei
    public Book(int isbn, String title, String author, String genre, LocalDate dateOfRelease, String lang, int numberOfPages, double price, String avalabil) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.dateOfRelease = dateOfRelease;
        this.lang = lang;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.avalabil = avalabil;
    }

    // Metodele getter și setter pentru parametrii cărții
    // (pentru accesul și actualizarea variabilelor private)
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getDateOfRelease() {
        return dateOfRelease;
    }

    public void setDateOfRelease(LocalDate dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAvalabil() {
        return avalabil;
    }

    public void setAvalabil(String avalabil) {
        this.avalabil = avalabil;
    }

    @Override
    // Metoda pentru generarea codului hash al obiectului
    public int hashCode() {
        int hash = 5; // declararea și inițializarea variabilei cod hash
        hash = 79 * hash + this.isbn; // algoritm pentru obținerea unui cod hash unic pentru fiecare obiect
        return hash; // returnează valoarea codului hash
    }

    @Override
    // Metoda pentru compararea a doi obiecte din clasa Library.Book pe baza ISBN-ului
    public boolean equals(Object obj) {
        if (this == obj) { // este verificat dacă obiectul este însuși.
            return true; // returnează True dacă declarația if este adevărată
        }
        if (obj == null) {// verificat dacă obiectul este nul
            return false; // returnează False dacă declarația if este adevărată
        }
        if (getClass() != obj.getClass()) {// verifica dacă obiectul nu este un obiect al clasei date
            return false;// returnează False dacă declarația if este adevărată
        }
        final Book other = (Book) obj; // atribuirea unui obiect obj cu conversie explicită unui obiect din această clasă
        // returnează True dacă niciuna dintre afirmațiile de mai sus nu este adevărată.
        // declararea si initializarea obiectului final al clasei other by
        return this.isbn == other.isbn;
    }

    @Override
    // Metoda pentru a obține o reprezentare sub formă de string a obiectului
    // utilizat de obicei în dezvoltare și testare prin imprimarea informațiilor pe consolă

    public String toString() {
        return "Library.Book{" + "isbn=" + isbn + ", title=" + title + ", author=" + author + ", genre=" + genre + ", dateOfRelease=" + dateOfRelease + ", lang=" + lang + ", numberOfPages=" + numberOfPages + ", price=" + price + ", avalabil=" + avalabil + '}';
    }
}
//Inchiderea clasei Library.Book

