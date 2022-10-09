package racingcar;

import racingcar.controller.RacingController;

public class RacingCarGame {
    private RacingController racingController;

    public RacingCarGame(RacingController controller) {
        this.racingController = controller;
    }

    public void runRacingCar() {
        initRacaing();

        int racingCount = racingController.getCount();

        System.out.println("\n실행 결과");

        while (racingCount > 0) {
            racingController.runRacing();
            racingController.showRacingStatus();
            racingCount --;
        }
    }

    private void initRacaing() {
        setRacingCars();
        setRacingTrackTry();
    }

    private void setRacingTrackTry() {
        try {
            racingController.setTryNumber(getRacingTrack());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            setRacingTrackTry();
        }
    }

    private String getRacingTrack() {
        System.out.println("시도할 회수는 몇회인가요?");
        String tryTotal = camp.nextstep.edu.missionutils.Console.readLine();
        return tryTotal;
    }

    private String getRacingCarList() {
        System.out.println("경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)");
        String list = camp.nextstep.edu.missionutils.Console.readLine();
        return list;
    }

    private void setRacingCars() {
        try {
            racingController.setRacingCarLineUp(getRacingCarList());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            setRacingCars();
        }
    }
}
