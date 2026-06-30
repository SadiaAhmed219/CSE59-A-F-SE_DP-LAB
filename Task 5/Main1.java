interface Printer {
    void printDocument();
}
interface Scanner {
    void scanDocument();
}
interface FaxMachine {
    void faxDocument();
    
}
class BasicPrinter implements Printer {
    public void printDocument(){
        System.out.println("Basic Printer: Printing...");
    }
}

class MultiFunctionCopier implements Printer, Scanner, FaxMachine {
    
    public void printDocument() {
        System.out.println("Copier: Printing...");
    }
    public void scanDocument() {
        System.out.println("Copier: Scanning...");
        
    
}
  public void faxDocumnet() {
      System.out.println("Copier: Faxing...");
  }
}


public class Main1 {

    public static void main(String[] args) {

        BasicPrinter bp = new BasicPrinter();
        bp.printDocument();

        MultiFunctionCopier mc = new MultiFunctionCopier();
        mc.printDocument();
        mc.scanDocument();
        mc.faxDocument();
    }
}
