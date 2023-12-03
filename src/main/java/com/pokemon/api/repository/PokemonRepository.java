package com.pokemon.api.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.api.models.Pokemon;

@Repository
public interface PokemonRepository extends CrudRepository<Pokemon, Long> {

    List<Pokemon> findAllByOrderByIdAsc();

}
