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
        System.out.println("경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)");
        String list = camp.nextstep.edu.missionutils.Console.readLine();
        return list;
    }

    private void setRacingCars(String list) {
        racingController.setRacingCarLineUp(list);
    }
}
