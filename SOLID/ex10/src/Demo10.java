public class Demo10 {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        ReportService service1 = new ReportService(consoleLogger);
        service1.generate();

        Logger fileLogger = new FileLogger();
        ReportService service2 = new ReportService(fileLogger);
        service2.generate();
    }
}
