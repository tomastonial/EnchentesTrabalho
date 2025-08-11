package com.cesurg.trabalho_enchente.core.usecase;

import com.cesurg.trabalho_enchente.core.domain.contract.GrupoUsecase;
import com.cesurg.trabalho_enchente.core.domain.entity.Grupo;

import java.util.List;
import java.util.Optional;

public class GrupoUsecaseImpl implements GrupoUsecase {
    @Override
    public Grupo salvar(Grupo grupo) {
        return null;
    }

    @Override
    public Optional<Grupo> buscarPorId(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<Grupo> listarTodos() {
        return List.of();
    }

    @Override
    public void atualizar(Integer id, Grupo grupo) {

    }

    @Override
    public void remover(Integer id) {

    }
}
