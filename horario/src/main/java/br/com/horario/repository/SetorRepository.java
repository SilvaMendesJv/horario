package br.com.horario.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import br.com.horario.entity.SetorEntity;

@Repository
public interface SetorRepository extends JpaRepositoryImplementation<SetorEntity, Long> {

}
