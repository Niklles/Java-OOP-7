package src.Tasks.Task1.model;

public class Phone implements java.io.Serializable {
    private String number;

    public String getNumber(){
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Phone(String number, String model, double weight){
        this(number, model);

        this.weight = weight;

    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){
        
    }
    
    public void receiveCall(String name){
        System.out.printf("Звонит: %s\n", name);
    }

    public void receiveCall(String name, String number){
        System.out.printf("Звонит: %s Номер телефона: %s\n", name, number);
    }

    // public void sendMessage(String[] telephons){
    //     for (String telephon : telephons){
    //         System.out.printf("Вам сообщение: %s \n", telephon); 
    //     }
    // }

    public void sendMessage(String... telephons){
        for (String telephon : telephons){
            System.out.printf("Вам сообщение: %s \n", telephon); 
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((number == null) ? 0 : number.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Phone other = (Phone) obj;
        if (number == null) {
            if (other.number != null)
                return false;
        } else if (!number.equals(other.number))
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Phone [number=" + number + ", model=" + model + ", weight=" + weight + "]";
    }
         
}
