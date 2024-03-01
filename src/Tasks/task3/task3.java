package src.tasks.task3;

import src.tasks.task3.model.*;

public class task3 {
    public static void Execute() {
        Matrix table1 = new Matrix(new double[][] {{1.5, 2.5, 3.5}, {4.5, 5.5, 6.5}});

        Matrix table2 = new Matrix(new double[][] {{1.8, 2.8, 3.8}, {4.8, 5.8, 6.8}});
        Matrix all;

        all = table1.sum(table2);
        all.displayInfo();
        table1.displayInfo();
        table2.displayInfo();
        table1.multiply(10);
        table2.multiply(5);
        table1.multiplicationOfTables(table2);
        

    }
}
