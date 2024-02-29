package src.Tasks.Task1;

import src.Tasks.Task1.model.Phone;

public class Task1 {

    public static void Execute() {
        Phone device1 = new Phone("+79164548455", "Xiaomi", 2.69);
        Phone device2 = new Phone("+79172687676", "Realme", 3.46);
        Phone device3 = new Phone("+79168679868", "Samsung", 2.87);
    
        device1.toString();
        device2.toString();
        device3.toString();
        String[] telephonss =  {"+79164548455", "+79172687676","+79168679868","+79172641876"};
        device1.sendMessage(telephonss);
        System.out.println(device1.getNumber());
        String[] telephons =  new String[3];
        telephons[0] = "+79164548455";
        telephons[1] = "+79172687676";
        telephons[2] = "+79168679868";
        device2.sendMessage("+79489487985","+79489487985");
        System.out.println(device2.getNumber());
        device3.receiveCall("sam", "+79489487985");
        device3.sendMessage(new String[]{"+79489487985","+79489487985","+79489487985","+79489487985"});
        System.out.println(device3.getNumber());

    }

}

