package org.prog.demo;

public class Plane {  // Создали класс Plane
String flightId;      // Добавили переменную номер рейса
int maxSeats;         // Добавили переменную поле макс. мест
int takenSeats ;      // Добавили переменную поле занятых мест

    public void printInfo(){
        int percent = (takenSeats * 100) / maxSeats; // считаем процент занятых мест.
        System.out.println("number:" + flightId + " has:" + percent + "%" );
    }
}
