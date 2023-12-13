/**
 * Clasa Library, descrie caracteristicile:
 * numărul de identificare al bibliotecii,
 * adresa, numărul de telefon, raionul în care se află biblioteca,
 * lista de cărți pe care o conține biblioteca.
 */
package Library;

import java.util.ArrayList;

/**
 * @author Bazaochi Dumitru, AW21M
 */
// Clasa Library
public class Library {

    private int idLibrary;
    private String adres;
    private String telephone;
    private int numberOfBooks;
    private ArrayList<Integer> books;
    private String district;

    // Constructor gol al clasei
    public Library() {
    }

    // Constructor al clasei cu parametri
    public Library(int idLibrary, String adres, String telephone, int numberOfBooks, ArrayList<Integer> books, String district) {
        this.idLibrary = idLibrary; // Accesarea variabilei id bibliotecă folosind this
        this.adres = adres;
        this.telephone = telephone;
        this.numberOfBooks = numberOfBooks;
        this.books = books;
        this.district = district;
    }

    // Metodele getter și setter
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getIdLibrary() {
        return idLibrary;
    }

    public void setIdLibrary(int idLibrary) {
        this.idLibrary = idLibrary;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public ArrayList<Integer> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Integer> books) {
        this.books = books;
    }

    // Suprascriere a metodei hashCode
    @Override
    // Metodă pentru obținerea codului hash al obiectului
    public int hashCode() {
        int hash = 7; // Declarare și inițialize
        hash = 79 * hash + this.idLibrary; // Declarare și inițializare variabilă hashcode
        return hash; // Returnează valoarea codului hash
    }

    // Suprascriere a metodei equals
    @Override
    // Metodă pentru compararea a două obiecte ale clasei pentru identitate
    public boolean equals(Object obj) {
        if (this == obj) {  // Verifică dacă obiectul este identic cu el însuși.
            return true; // Returnează adevărat dacă afirmația din if este adevărată
        }
        if (obj == null) { // Verifică dacă obiectul are valoarea null
            return false; // Returnează fals dacă afirmația din if este adevărată
        }
        if (getClass() != obj.getClass()) { // Verifică dacă obiectul nu este o instanță a acestei clase
            return false; // Returnează fals dacă afirmația din if este adevărată
        }
        final Library other = (Library) obj;
        // Atribuirea obiectului obj cu conversie explicită la un obiect din această clasă
        // Returnează adevărat dacă niciuna dintre afirmațiile de mai sus nu este adevărată
        // Declarare și inițializare a unui obiect final other
        return this.idLibrary == other.idLibrary;
    }

    // Suprascriere a metodei toString
    @Override
    // Metodă pentru acces rapid la valorile obiectelor clasei;
    // de obicei utilizată în dezvoltare și testare prin afișarea informațiilor în consolă
    public String toString() {
        return "Library{" + "idLibrary=" + idLibrary + ", adres=" + adres + ", telephone=" +
                telephone + ", numberOfBooks=" + numberOfBooks + ", books=" + books +
                ", district=" + district + '}';
    }
}
//Inchiderea clasei Library
