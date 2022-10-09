package racingcar.controller;

import racingcar.model.RacingCar;

public class RacingController {
    RacingCar listup;
    public void setRacingCarLineUp(String list) {
        listup = new RacingCar(list);
    }
}
