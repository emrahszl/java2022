public class Customer {
    public Customer (){
        System.out.println("Müşteri nesnesi başlatıldı");
    }
    private int id;
    private String City;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
