package src.tasks.task3.model;

public class Matrix {

    double[][] table = new double[2][3];
    public Matrix(double[][] table){
        this.table = table;
        
    }
    


    public Matrix sum(Matrix other){
        double[][] result = new double[2][3];
        for (int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                result[i][j] = this.table[i][j] + other.table [i][j];
            }
        }
        Matrix sumAll = new Matrix(result);
        return sumAll;
        
    }

    public Matrix multiply(int num){
        for (int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                this.table[i][j] = this.table[i][j] * num;
            }
        }
        Matrix multiplyall = new Matrix(table);
        return multiplyall;
    }

    public Matrix multiplicationOfTables(Matrix another){
        double[][] answer = new double[2][3];
        for (int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                answer[i][j] = this.table[i][j] * another.table [i][j];
            }
        }
        Matrix mulOfTab = new Matrix(answer);
        return mulOfTab;
    }

    public void displayInfo(){ 
        for (int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                System.out.printf("%.2f \n", table [i][j]);
            }
        }
    }
}
