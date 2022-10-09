package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class RacingData {
    private List<Car> racingCarlist;

    private String slist;
    private int trys = 0;

    private int winnerDistance = 0;
    private List<Car> winners;

    public int getTrys() {
        return trys;
    }

    public RacingData(String list) throws IllegalArgumentException {
        checkError(list);
        this.slist = list;
        setRacingCarlist();
        if (winners == null) winners = new ArrayList<>();
    }

    private void checkError(String str) {
        if (!str.contains(",")) throw new IllegalArgumentException("[ERROR] ',' 로 구분된 2개 이상의 레이싱카 목록을 입력해 주세요.");
        if (str.contains(" ")) throw new IllegalArgumentException("[ERROR] 빈 문자열 없이 ',' 로 구분된 2개 이상의 레이싱카 목록을 입력해 주세요.");
    }

    public List<Car> getRacingCarlist() {
        return racingCarlist;
    }

    public void setRacingCarlist() {
        racingCarlist = new ArrayList<>();
        String[] cars = slist.split(",");

        for (String name: cars) {
            Car racingCar = new Car(name);
            racingCarlist.add(racingCar);
        }
    }

    public void setTrys(String parseInt) throws IllegalArgumentException {
        try {
            this.trys = Integer.parseInt(parseInt);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 시도 횟수는 숫자여야 한다.");
        }
    }

    public void setGoStops() {
        if (trys <= 0) return;
        for (int i = 0; i < racingCarlist.size(); i++) {
            setDistance(racingCarlist.get(i));
        }
    }

    private void setDistance(Car car) {
        int diceN = camp.nextstep.edu.missionutils.Randoms.pickNumberInRange(0, 9);
        if (diceN > 3) {
            car.go();
        }
        if (car.getDistance() != 0) setWinnerDistance(car.getDistance());
    }

    public void setWinnerDistance(int distance) {
        if (distance >= winnerDistance) {
            winnerDistance = distance;
        }
    }

    public int getWinnerDistance() {
        return winnerDistance;
    }

    public List<Car> getWinners() {
        for (Car car: racingCarlist) {
            setWinners(car);
        }
        return winners;
    }

    private void setWinners(Car c) {
        if (c.getDistance() == winnerDistance) {
            winners.add(c);
        }
    }
}
