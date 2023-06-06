package methodReference;

import java.time.LocalDate;

public class ReferenceClass {
    static void referenceMethod() {
        System.out.println("Working inside of referenceMethod");
    }


    static void threadMethod() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread number " + (i + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }
    }

    void todayDate() {
        LocalDate date = LocalDate.now();
        System.out.println(date.toString());
    }
}
