package com.erickgm.persona.PersonaBACKEND.repository;

import com.erickgm.persona.PersonaBACKEND.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
