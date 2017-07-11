package hiber;

import javax.persistence.*;

/**
 * Created by user on 7/11/17.
 */
@Entity
@Table(name = "table_pet", schema = "public", catalog = "postgres")
public class TablePetEntity {
    private String namePet;
    private String type;

    @Id
    @Column(name = "name_pet", nullable = false, length = 50)
    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    @Basic
    @Column(name = "type", nullable = false, length = 50)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TablePetEntity that = (TablePetEntity) o;

        if (namePet != null ? !namePet.equals(that.namePet) : that.namePet != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = namePet != null ? namePet.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
