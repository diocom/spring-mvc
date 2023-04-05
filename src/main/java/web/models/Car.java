package web.models;

public class Car {
    private int id;
    private String models;
    private int series;

    public Car(int id, String models, int series) {
        this.id = id;
        this.models = models;
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", models='" + models + '\'' +
                ", series=" + series +
                '}';
    }
}

