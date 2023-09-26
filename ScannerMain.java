public class  ScannerMain {
    public static void main(String[] args) {
        ScannerMachine.scanDocument("Contract", 300, "PDF");
        ScannerMachine.saveDocument("Invoice", "invoice123", "JPEG");
        ScannerMachine.printDocument("Report", 5);
        ScannerMachine.turnOff();
    }
}
