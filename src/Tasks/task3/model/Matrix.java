package src.tasks.task3.model;

public class Matrix {

    double[][] table = new double [][] 
    {
        {1.5, 2.5, 3.5},
        {4.5, 5.5, 6.5}
    };

    for (int i = 0; i < table.length; i++){
        for(int j = 0; j < table[i].length; j++){
                 
            System.out.printf("%.2f ", table[i][j]);
        }
        System.out.println();
    }
}
