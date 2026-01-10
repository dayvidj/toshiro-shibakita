package br.com.dayvid.toshiro_api.repository;

import br.com.dayvid.toshiro_api.model.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
}
