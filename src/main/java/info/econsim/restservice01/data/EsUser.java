package info.econsim.restservice01.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class EsUser {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Getter @Setter
    public Long id;

    @Getter @Setter
    public String email;
    @Getter @Setter
    public String name;

    public EsUser() {}

    public EsUser(String email, String name) {
        this.email = email;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "EsUser[id=%s, email='%s', name='%s']",
                id, email, name);
    }
}