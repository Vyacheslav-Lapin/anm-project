package ru.ssianpost.anm.anmproject.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ssianpost.anm.anmproject.model.Cat;

//@Repository
public interface CatDao extends JpaRepository<Cat, UUID> {
}
