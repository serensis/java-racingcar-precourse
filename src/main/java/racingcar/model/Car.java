package racingcar.model;

import java.util.InputMismatchException;

public class Car {
    private String name;
    private int distance = 0;

    public Car(String name) throws IllegalArgumentException {
        setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) throws ArrayIndexOutOfBoundsException {
        if (name.length() > 5) {
            throw new IllegalArgumentException("[ERROR] 5자 미만의 이름으로 설정해야만 합니다.");
        }
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void go() {
        this.distance++;
    }
}
