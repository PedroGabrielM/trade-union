package br.com.gameoverproject.tradeunion.departament.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="departament")
@Table(name="departament")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Departament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private DepartamentType departament;
}
