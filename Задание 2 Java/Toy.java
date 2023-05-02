public class Toy {
    int id;
    String name;
    int how_many;
    int weight;

    public String info() {
        return "Toy.info : " +
                "id = " + this.getId() +
                " name = " + this.getName() +
                " how_many = " + this.getHow_many() +
                " weight " + this.getWeight();
    }

    public Toy() {
    }

    public Toy(int id, String name, int how_many, int weight) {
        this.id = id;
        this.name = name;
        this.how_many = how_many;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHow_many() {
        return how_many;
    }

    public void setHow_many(int how_many) {
        this.how_many = how_many;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}