package model;

import java.util.Arrays;

public class Note {
    private String surname;
    private String name;
    private int[] date;
    private String phone;
    private String address;

    public Note() {
    }

    public Note(String surname, String name, int[] date, String phone, String address) {
        this.surname = surname;
        this.name = name;
        this.date = date;
        this.phone = phone;
        this.address = address;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getDate() {
        return date;
    }

    public void setDate(int[] date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Note{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", date=" + Arrays.toString(date) +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}


