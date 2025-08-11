package com.cesurg.trabalho_enchente.core.domain.contract;

import com.cesurg.trabalho_enchente.core.domain.entity.Grupo;

import java.util.List;
import java.util.Optional;

public interface GrupoUsecase {
    Grupo salvar(Grupo grupo);
    Optional<Grupo> buscarPorId(Integer id);
    List<Grupo> listarTodos();
    void atualizar(Integer id, Grupo grupo);
    void remover(Integer id);
}
