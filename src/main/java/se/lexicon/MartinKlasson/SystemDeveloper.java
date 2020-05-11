package se.lexicon.MartinKlasson;

import java.time.LocalDate;

public class SystemDeveloper extends Employee {

    private String[] certificates = new String[10];
    private String[] languages = new String[10];

    public SystemDeveloper(){

    }

    public SystemDeveloper(String[] certificates, String[] languages) {
        this.certificates = certificates;
        this.languages = languages;
    }

    public SystemDeveloper(int id, String name, double salary, LocalDate dateHired, String[] certificates, String[] languages) {
        super(id, name, salary, dateHired);
        this.certificates = certificates;
        this.languages = languages;
    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    @Override
    public void calculateSalary() {
        double totalSalary = getSalary() + (getCertificates().length * 1000) + (getLanguages().length * 1500);
        System.out.println("Total salary: " + totalSalary);

    }
    @Override
    public String toString(){
        return("Nr of certificates: " + certificates.length + "\nNr of new languages : " + languages.length);
    }
}
