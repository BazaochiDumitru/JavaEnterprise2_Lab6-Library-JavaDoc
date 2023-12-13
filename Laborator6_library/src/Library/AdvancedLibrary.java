/**
 * Clasa AdvancedLibrary, extinde clasa Library
 * descrie caracteristicile suplimentare
 * numărul etajelor din bibliotecă și numele bibliotecii
 */
package Library;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bazaochi Dumitru, AW21M
 */
public class AdvancedLibrary extends Library { //extinde clasa Library

    private int id;
    private int numberOfFloors;
    private String libraryName;

    //constructorul gol al clasei
    public AdvancedLibrary() {
    }

    //constructor al clasei cu parametri
    public AdvancedLibrary(int id, int numberOfFloors, String libraryName) {
        this.id = id; //accesarea variabilei clasei id a bibliotecii prin this
        this.numberOfFloors = numberOfFloors;
        this.libraryName = libraryName;
    }

    // Metodele getter și setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    // Anotație pentru suprascrierea metodei
    @Override
    // Metoda pentru acces rapid la valorile obiectelor clasei;
    public String toString() {
        return "AdvancedLibrary{" + "id=" + id + ", numberOfFloors=" + numberOfFloors +
                ", libraryName=" + libraryName + '}';
    }
} //se închide clasa AdvancedLibrary
