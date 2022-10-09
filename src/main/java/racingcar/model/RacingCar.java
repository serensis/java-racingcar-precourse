package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class RacingCar {
    private List<Car> racingCarlist;
    private String slist;

    public RacingCar(String list) throws IllegalArgumentException {
        if (! list.contains(",")) throw new IllegalArgumentException("빈 문자열 없이 ',' 로 구분된 2개 이상의 레이싱카 목록을 입력해 주세요.");
        if (! list.contains(" ")) throw new IllegalArgumentException("빈 문자열 없이 ',' 로 구분된 2개 이상의 레이싱카 목록을 입력해 주세요.");
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
}
