package part02.chapter18;

import java.util.LinkedList;

/**
 * Класс, описывающий почтовый адрес.
 */
class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return name + "\n" + street + "\n" + city + " " + state + " " + code;
    }
}

/**
 * Пример сохранения объектов произвольного класса (Address)
 * в коллекции (двусвязный список LinkedList).
 */
class MailList {
    public static void main(String[] args) {
        
        LinkedList<Address> list = new LinkedList<Address>();
        
        list.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        list.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
        list.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820"));

        for (Address a : list) {
            System.out.println(a + "\n");
        }
    }
}
