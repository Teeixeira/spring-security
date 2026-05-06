package spring.security.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_pessoa")
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public PessoaModel() {
    }
}
