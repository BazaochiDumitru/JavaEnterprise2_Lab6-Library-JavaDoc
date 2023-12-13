/**
 * Clasa adițională care conține metode pentru export și import de informații în fișiere text.
 */
package Library;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author Bazaochi Dumitru, AW21M
 */
public class ToCsv {

    // constante
    private final static String ENTER = " "; // constanta pentru spațiu
    private final static String ENDL = "\n"; // constanta pentru trecere la linie nouă

    // Metoda pentru transformarea informațiilor despre carte într-un șir cu un parametru de tip Book
    public static String toLineBook(Book book) {
        StringBuilder strB = new StringBuilder();
        // Inițializarea unui obiect din clasa StringBuilder pentru a scrie toate informațiile într-o singură linie
        strB.append(book.getIsbn()); // Adaugarea ISBN
        strB.append(ENTER); // Separarea informațiilor cu un spațiu
        strB.append(book.getTitle());
        strB.append(ENTER);
        strB.append(book.getAuthor());
        strB.append(ENTER);
        strB.append(book.getGenre());
        strB.append(ENTER);
        strB.append(book.getDateOfRelease());
        strB.append(ENTER);
        strB.append(book.getLang());
        strB.append(ENTER);
        strB.append(book.getNumberOfPages());
        strB.append(ENTER);
        strB.append(book.getPrice());
        strB.append(ENTER);
        strB.append(book.getAvalabil());
        strB.append(ENDL);
        return strB.toString(); // Returnarea șirului rezultat
    }

    // Metoda pentru transformarea informațiilor despre bibliotecă într-un șir cu un parametru de tip Library
    static String toLineLib(Library lib) {
        ArrayList<Integer> l = lib.getBooks(); // Scrierea în matrice valoarea Isbn a cărților de bibliotecă
        StringBuilder strB = new StringBuilder();
        // Inițializarea unui obiect din clasa StringBuilder pentru a scrie toate informațiile într-o singură linie
        strB.append(lib.getIdLibrary());
        strB.append(ENTER); // Separarea informațiilor cu un spațiu
        strB.append(lib.getAdres());
        strB.append(ENTER);
        strB.append(lib.getTelephone());
        strB.append(ENTER);
        strB.append(lib.getNumberOfBooks());
        strB.append(ENTER);
        for (int i = 0; i < l.size(); i++) { // o buclă for pentru a înregistra cărțile isbn ale unei biblioteci după numărul lor
            strB.append(l.get(i));
            strB.append(ENTER);
        }
        strB.append(ENTER);
        strB.append(lib.getDistrict());
        strB.append(ENDL); // Separarea informațiilor prin rupere la o nouă linie
        return strB.toString();
    } // Inchiderea metodei

    // Metoda pentru transformarea informațiilor despre bibliotecă avansată într-un șir cu un parametru de tip AdvancedLibrary
    static String toLineAdLib(AdvancedLibrary lib) {
        StringBuilder strB = new StringBuilder();
        // Inițializarea unui obiect din clasa StringBuilder pentru a scrie toate informațiile într-o singură linie
        strB.append(lib.getIdLibrary());
        strB.append(ENTER); // Separarea informațiilor cu un spațiu
        strB.append(lib.getNumberOfFloors());
        strB.append(ENTER);
        strB.append(lib.getLibraryName());
        strB.append(ENDL); // Separarea informațiilor prin rupere la o nouă linie
        return strB.toString();
    }

    // Metoda pentru transformarea informațiilor despre carte de la client la obiect de tip Book
    public static Book toClientBook(String line) {
        String data[] = line.split(ENTER); // Crearea unei matrice de șiruri de caractere folosind delimitarea spațiului
        int isbn = Integer.parseInt(data[0]);
        String title = data[1]; // Crearea unui parametru de titlu de carte din al doilea element al unui tablou de șiruri
        String author = data[2]; // Crearea parametrului autor al cărții din al treilea element al matricei de șiruri
        String genre = data[3]; // Crearea parametrului gen al cărții din al patrulea element al matricei de șiruri
        String dateStr = data[4]; // Crearea parametrului data lansarii al cărții din al cincilea element al matricei de șiruri
        LocalDate dateOfRelease = LocalDate.parse(dateStr);
        String lang = data[5]; // Crearea parametrului limba al cărții din al șaselea element al matricei de șiruri
        int numOfPages = Integer.parseInt(data[6]); // Parametru întreg numărul de pagini de carte
        double price = Double.parseDouble(data[7]); // Parametrul de flotare a prețului cărții
        String avail = data[8];

        // crearea unui obiect din clasa Book cu parametrii dați
        Book client = new Book(isbn, title, author, genre, dateOfRelease, lang, numOfPages, price, avail);
        return client; // returnarea obiectului
    }

    // Metoda pentru transformarea informațiilor despre bibliotecă de la client la obiect de tip Library
    static Library toClientLib(String line) {
        String data[] = line.split(ENTER); // Crearea unei matrice de șiruri de caractere folosind delimitarea spațiului
        int id = Integer.parseInt(data[0]);
        String adres = data[1];
        String telephone = data[2];
        int n = Integer.parseInt(data[3]);
        ArrayList<Integer> l = new ArrayList<>();
        // Crearea unei liste destinate stocării cărților bibliotecii isbn
        int i = 4;
        for (int j = 0; j < n; i++, j++) {
            // o buclă for pentru a scrie cărți de bibliotecă ISbn într-o listă de până la un număr de cărți de bibliotecă
            l.add(Integer.parseInt(data[i]));
        }
        String district = data[i + 1];
        // Crearea unui parametru de regiune de bibliotecă din elementul (i+1) --lea al matricei de șiruri

        // Crearea unui obiect de clasă Library cu parametrii dați
        Library lib = new Library(id, adres, telephone, n, l, district);
        return lib; // Returnarea obiectului
    }

    // Metoda pentru transformarea informațiilor despre bibliotecă avansată de la client la obiect de tip AdvancedLibrary
    static AdvancedLibrary toClientAdvLib(String line) {
        String data[] = line.split(ENTER);
        int id = Integer.parseInt(data[0]);
        int floors = Integer.parseInt(data[1]);
        String name = data[2];

        // Crearea unui obiect de clasă Advanced Library cu parametri specificați
        AdvancedLibrary client = new AdvancedLibrary(id, floors, name);
        return client; // Returnarea obiectului
    } // Inchiderea metodei
} // Inchiderea clasei
