package web.model;


public class Car {
    private long id;
    private String model;
    private String series;
    private int year;


    public Car() {
    }

    public Car(long id, String model, String series, int year) {
        this.id = id;
        this.model = model;
        this.series = series;
        this.year = year;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", series=" + series +
                ", year=" + year +
                '}';
    }
}

