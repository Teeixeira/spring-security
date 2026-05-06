package spring.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.security.models.PessoaModel;
import spring.security.repositories.PessoaRepository;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    public List<PessoaModel> findAll() {
        return pessoaRepository.findAll();
    }

    public PessoaModel save(PessoaModel pessoaModel) {
        return pessoaRepository.save(pessoaModel);
    }
}
