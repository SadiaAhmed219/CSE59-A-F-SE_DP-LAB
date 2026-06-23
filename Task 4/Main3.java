// Interfaces
interface Printer {
    void printDocument();
}

interface Scanner {
    void scanDocument();
}

interface FaxMachine {
    void faxDocument();
}


// MultiFunction Device
class MultiFunctionCopier implements Printer, Scanner, FaxMachine {

    public void printDocument() {
        System.out.println("Printing...");
    }

    public void scanDocument() {
        System.out.println("Scanning...");
    }

    public void faxDocument() {
        System.out.println("Faxing...");
    }
}


// Basic Printer
class BasicPrinter implements Printer {

    public void printDocument() {
        System.out.println("Printing...");
    }
}


// Main class to run
public class Main {
    public static void main(String[] args) {

        Printer p1 = new BasicPrinter();
        p1.printDocument();

        System.out.println("----");

        MultiFunctionCopier mfc = new MultiFunctionCopier();
        mfc.printDocument();
        mfc.scanDocument();
        mfc.faxDocument();
    }
}
