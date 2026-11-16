package fundamentals.abstraction.collections.sets;

import java.util.Objects;

class customer implements Comparable<customer> {
    int id;
    String name;
    private String email;
    private long phoneno;
    private float balance;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        customer customer = (customer) o;
        return id == customer.id && phoneno == customer.phoneno && Float.compare(balance, customer.balance) == 0 && Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(gender, customer.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, phoneno, balance, gender);
    }

    @Override
    public String toString() {
        return "customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneno=" + phoneno +
                ", balance=" + balance +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    String gender;

    @Override
    public int compareTo(customer o) {
        return this.id-o.id;
    }
}
