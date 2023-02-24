public class Radio {
    public int numberStation;
    public int volume;

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

    public void setNextStation(int newNumberStation) {
        newNumberStation++;
        setNumberStation(newNumberStation);
    }

    public void setPrevStation(int newNumberStation) {
        newNumberStation--;
        setNumberStation(newNumberStation);
    }

    public void setNumStation(int newNumberStation) {
        setNumberStation(newNumberStation);
    }

    public void setVolume(int newVolume) {
        if (0 <= newVolume && newVolume >= 10) ;
        volume = newVolume;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume(int newVolume) {
        newVolume++;
        setVolume(newVolume);
        if (newVolume > 10) {
            newVolume = 10;
        }
        volume = newVolume;
    }

    public void decreaseVolume(int newVolume) {
        newVolume--;
        setVolume(newVolume);
        if (newVolume < 0) {
            newVolume = 0;
        }
        volume = newVolume;
    }
}
