package br.com.ufpb.quark.Exercicio1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ufpb.quark.Exercicio1.Entity.Consumer;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, Long>{

}
