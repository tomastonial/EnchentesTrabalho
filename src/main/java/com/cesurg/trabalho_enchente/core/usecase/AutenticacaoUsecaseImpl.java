package com.cesurg.trabalho_enchente.core.usecase;

import com.cesurg.trabalho_enchente.core.domain.contract.AutenticacaoUsecase;
import com.cesurg.trabalho_enchente.core.domain.entity.Autenticacao;

import java.util.List;
import java.util.Optional;

public class AutenticacaoUsecaseImpl implements AutenticacaoUsecase {
    @Override
    public Autenticacao salvar(Autenticacao autenticacao) {
        return null;
    }

    @Override
    public Optional<Autenticacao> buscarPorId(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<Autenticacao> listarTodos() {
        return List.of();
    }

    @Override
    public void atualizar(Integer id, Autenticacao autenticacao) {

    }

    @Override
    public void remover(Integer id) {

    }
}
