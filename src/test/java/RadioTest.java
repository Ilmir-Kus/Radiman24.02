import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setNumberStation() {
        Radio rad = new Radio();

        rad.setNumberStation(10);

        int expected = 0;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio rad = new Radio();

        rad.setNextStation(9);

        int expected = 0;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevStation() {
        Radio rad = new Radio();

        rad.setPrevStation(-1);

        int expected = 9;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNumStation() {
        Radio rad = new Radio();

        rad.setNumStation(3);

        int expected = 3;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeTest() {
        Radio rad = new Radio();

        rad.setVolume(7);

        int expected = 7;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {
        Radio rad = new Radio();

        rad.increaseVolume(11);

        int expected = 10;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeTestin() {
        Radio rad = new Radio();

        rad.increaseVolume(3);

        int expected = 4;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeTest() {
        Radio rad = new Radio();

        rad.decreaseVolume(-1);

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeTestin() {
        Radio rad = new Radio();

        rad.decreaseVolume(9);

        int expected = 8;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
