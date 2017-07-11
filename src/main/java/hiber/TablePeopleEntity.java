package hiber;

import javax.persistence.*;

/**
 * Created by user on 7/11/17.
 */
@Entity
@Table(name = "table_people", schema = "public", catalog = "postgres")
public class TablePeopleEntity {
    private String name;
    private String city;
    private String pet;
    private int age;

    @Id
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "city", nullable = false, length = 50)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "pet", nullable = false, length = 50)
    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    @Basic
    @Column(name = "age", nullable = false)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TablePeopleEntity that = (TablePeopleEntity) o;

        if (age != that.age) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (pet != null ? !pet.equals(that.pet) : that.pet != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (pet != null ? pet.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
}
