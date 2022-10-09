package racingcar;

import racingcar.controller.RacingController;

public class RacingCarGame {
    private RacingController racingController;

    public RacingCarGame(RacingController controller) {
        this.racingController = controller;
    }

    public void runRacingCar() {
        setRacingCars(getRacingCarList());
    }

    private String getRacingCarList() {
        String list = camp.nextstep.edu.missionutils.Console.readLine();
        return list;
    }

    private void setRacingCars(String list) {
        racingController.setRacingCarLineUp(list);
    }
}
