package se.lexicon.MartinKlasson;

import java.time.LocalDate;

public class SalesPerson extends Employee{

    private String[] clients = new String[10];
    private int newClients;

    public SalesPerson(String[] clients, int newClients) {
        this.clients = clients;
        this.newClients = newClients;
    }

    public SalesPerson(int id, String name, double salary, LocalDate dateHired, String[] clients, int newClients) {
        super(id, name, salary, dateHired);
        this.clients = clients;
        this.newClients = newClients;
    }

    public String[] getClients() {
        return clients;
    }

    @Override
    public void calculateSalary() {
        double totalSalary = getSalary() + (getClients().length * 500) + (getNewClients() * 1000);
        System.out.println("Total salary: " + totalSalary);
    }

    public void setClients(String[] clients) {
        this.clients = clients;

    }
    public int getNewClients() {
        return newClients;
    }

    public void setNewClients(int newClients) {
        this.newClients = newClients;
    }

    @Override
    public String toString(){
        return("Nr of clients: " + clients.length + "\nNr of new clients : " + newClients);
    }



}
