package methodReference;

public class Main {
    public static void main(String[] args) {

        System.out.println("After that exception ");
        FunInterface funInterface = ReferenceClass::referenceMethod;
        funInterface.absMethod();


        Runnable runnable = ReferenceClass::threadMethod;
        Thread thread = new Thread(runnable);
        thread.start();

        ReferenceClass obj = new ReferenceClass(); // without this the below line throw error
        Runnable runnable1 = null; // for nonstatic method need to crete class object
        try {
            runnable1 = obj::todayDate;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        runnable1.run();

    }
}
