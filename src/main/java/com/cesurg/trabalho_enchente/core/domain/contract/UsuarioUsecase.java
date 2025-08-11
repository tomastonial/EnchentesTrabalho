package com.cesurg.trabalho_enchente.core.domain.contract;

import com.cesurg.trabalho_enchente.core.domain.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioUsecase {
    Usuario salvar(Usuario usuario);
    Optional<Usuario> buscarPorId(Integer id);
    List<Usuario> listarTodos();
    void atualizar(Integer id, Usuario usuario);
    void remover(Integer id);
}
