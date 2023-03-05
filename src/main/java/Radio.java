public class Radio {
    private int maxNumberStation = 9;
    private int minNumberStation = 0;
    private int numberStation = 10;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int volume = 101;

    public Radio(int numberStation) {
        this.maxNumberStation = numberStation - 1;
    }

    public Radio() {

    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation < minNumberStation) {
            newNumberStation = maxNumberStation;
        }
        if (newNumberStation > maxNumberStation) {
            newNumberStation = minNumberStation;
        }
        numberStation = newNumberStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setNextStation() {
        int target = numberStation + 1;
        setNumberStation(target);
    }

    public void setPrevStation() {
        int target = numberStation - 1;
        setNumStation(target);
    }

    public void setNumStation(int newNumberStation) {
        setNumberStation(newNumberStation);
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            newVolume = minVolume;
        }
        if (newVolume > maxVolume) {
            newVolume = maxVolume;
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
