public class Radio {
    private int numberStation;
    private int volume;

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation > 9) {
            newNumberStation = 0;
        }
        if (newNumberStation < 0) {
            newNumberStation = 9;
        }
        numberStation = newNumberStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setNextStation() {
        int target = numberStation + 1;
        setNumStation(target);
    }

    public void setPrevStation() {
        int target = numberStation - 1;
        setNumStation(target);
    }

    public void setNumStation(int newNumberStation) {
        setNumberStation(newNumberStation);
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        volume = newVolume;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        int target = volume + 1;
        setVolume(target);
    }

    public void decreaseVolume() {
        int target = volume - 1;
        setVolume(target);
    }
}
