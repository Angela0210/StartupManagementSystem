package mk.ukim.finki.wp.june2025g1.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Founder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

//    @OneToMany
//    private List<Startup> startups;
    public Founder(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
