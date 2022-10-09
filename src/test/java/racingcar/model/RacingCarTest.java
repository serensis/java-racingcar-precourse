package racingcar.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RacingCarTest {

    private List<Car> list;
    private RacingCar rc;

    @BeforeEach
    void listUp (){
        list = new ArrayList<>();
        list.add(new Car("test1"));
        list.add(new Car("test2"));
        rc = new RacingCar("test1,test2");
    }

    @Test
    void setRacingCarlist_ShouldGenerateCarList() {
        assertTrue(rc.getRacingCarlist().size() == 2);
        assertTrue(rc.getRacingCarlist().get(1).getName().equals("test2"));
    }

    @Test
    void newRacingCar_catchException() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            RacingCar test = new RacingCar("test1 test2");
        });
    }

}