package com.cesurg.trabalho_enchente.core.domain.contract;

import com.cesurg.trabalho_enchente.core.domain.entity.Autenticacao;

import java.util.List;
import java.util.Optional;

public interface AutenticacaoUsecase {
    Autenticacao salvar(Autenticacao autenticacao);
    Optional<Autenticacao> buscarPorId(Integer id);
    List<Autenticacao> listarTodos();
    void atualizar(Integer id, Autenticacao autenticacao);
    void remover(Integer id);
}
