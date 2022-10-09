package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class RacingData {
    private List<Car> racingCarlist;

    private String slist;
    private int trys = 0;

    private int winnerDistance = 0;

    public int getTrys() {
        return trys;
    }

    public RacingData(String list) throws IllegalArgumentException {
        if (! list.contains(",")) throw new IllegalArgumentException("[ERROR] 빈 문자열 없이 ',' 로 구분된 2개 이상의 레이싱카 목록을 입력해 주세요.");
        if (list.contains(" ")) throw new IllegalArgumentException("[ERROR] 빈 문자열 없이 ',' 로 구분된 2개 이상의 레이싱카 목록을 입력해 주세요.");
        this.slist = list;
        setRacingCarlist();
    }

    public List<Car> getRacingCarlist() {
        return racingCarlist;
    }

    public void setRacingCarlist() {
        racingCarlist = new ArrayList<>();
        String[] cars = slist.split(",");

        for (String name: cars) {
            Car racingcar = new Car(name);
            racingCarlist.add(racingcar);
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

    public void setDistance(Car car) {
        int diceN = camp.nextstep.edu.missionutils.Randoms.pickNumberInRange(0, 9);
        if (diceN > 3) {
            car.go();
            if (car.getDistance() >= winnerDistance) {
                winnerDistance = car.getDistance();
            }
        }
    }
    public int getWinnerDistance() {
        return winnerDistance;
    }
}
