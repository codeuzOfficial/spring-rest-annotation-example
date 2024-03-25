package dasturlash.uz.dto;

public class VehicleDTO {
    private Integer id;
    private String model;
    private Integer year;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "VehicleDTO{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
