package com.evento.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.evento.app.models.Evento;

public interface EventosRepository extends JpaRepository<Evento, Long> {
}
