package org.prog.demo;

public class Main {
    public static void main(String[] args) {
        // Создали Самолет
        Plane plane = new Plane();
        // Присвоили все значения переменным из класса Plane
        plane.flightId = "AA-1808";
        plane.maxSeats = 130;
        plane.takenSeats = 90;

        plane.printInfo();
    }
}
