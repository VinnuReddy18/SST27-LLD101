public class Demo07 {
    public static void main(String[] args) {
        Printer printer = new BasicPrinter();
        printer.print("Hello");

        MultiFunctionMachine mfm = new MultiFunctionMachine();
        mfm.print("Document");
        mfm.scan("/tmp/out");
        mfm.fax("555-1234");
    }
}
