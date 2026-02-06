package com.evento.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.evento.app.models.Evento;

public interface EventosRepository extends CrudRepository<Evento, String> {

Evento findbyIdEvento (long idEvento);


}
