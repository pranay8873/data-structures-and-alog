package fundamentals.abstraction.collections.sets;

import java.util.Objects;

class product implements Comparable<product> {
    private int id;
    private String name;
    private float cost;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        product product = (product) o;
        return id == product.id && Float.compare(cost, product.cost) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cost);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public int compareTo(product o) {
        return this.name.compareTo(o.name);
    }
}
