package LampProgram.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "country")
    private String country;
    @Column(name = "light")
    private boolean light;

    @Override
    public String toString() {
        return
                "id= " + id +
                "name= " + name  +
                "country= " + country +
                "light= " + light + '\n'
                ;
    }
}
