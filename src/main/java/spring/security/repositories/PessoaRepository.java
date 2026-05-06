package spring.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.security.models.PessoaModel;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {

}
