package studies.maratonajava.javacore.Ycolections.domain;

public class Smartphone {
    private String serialNumber;
    private String brand;

    public Smartphone(String serialNumber, String brand) {
        this.serialNumber = serialNumber;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        return this.serialNumber != null && this.serialNumber.equals(((Smartphone) obj).serialNumber);
    }

    // Is used to calculate a hash value for an object.
    // if x.equals(y) == true, y.hashCode() == x.hashCode()
    // if y.hashCode() == x.hashCode() the x.equals(y) not necessarily need to be true
    // if x.equals(y) == false the hashCode needs to be different
    // if y.hashCode() != x.hashCode() x.equals() must be false
    @Override
    public int hashCode() {
        return this.serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
