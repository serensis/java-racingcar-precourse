package racingcar.view;

import racingcar.model.Car;
import racingcar.model.RacingData;

public class RacingView {
    public static void viewStatusRacingCar(Car car) {
        System.out.print(car.getName()+" : ");
        for (int i = 0; i < car.getDistance(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void viewStatusRacing(RacingData racingData) {
        if (racingData.getTrys() < 0) {
            return;
        }
        for (Car racingCar: racingData.getRacingCarlist()) {
            RacingView.viewStatusRacingCar(racingCar);
        }
        System.out.println();
    }
}
