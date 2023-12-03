package com.pokemon.api.services;

import java.util.List;

import com.pokemon.api.models.Pokemon;

public interface IPokemonService {

    List<Pokemon> find();

    Pokemon create(Pokemon pokemon);

    Pokemon update(Long id, int quantity);

    void delete(Long id);

}
