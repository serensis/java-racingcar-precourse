package racingcar;

import racingcar.controller.RacingController;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        new CarRacingGame(new RacingController()).runRacingCarGame();
    }
}

