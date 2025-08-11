package com.cesurg.trabalho_enchente.core.usecase;

import com.cesurg.trabalho_enchente.core.domain.contract.UsuarioRepository;
import com.cesurg.trabalho_enchente.core.domain.contract.UsuarioUsecase;
import com.cesurg.trabalho_enchente.core.domain.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioUsecaseImpl implements UsuarioUsecase {

    private final UsuarioRepository usuarioRepository;

    public UsuarioUsecaseImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.salvar(usuario);
    }

    @Override
    public Optional<Usuario> buscarPorId(Integer id) {
        return usuarioRepository.buscarPorId(id);
    }

    @Override
    public List<Usuario> listarTodos() {
        return usuarioRepository.listarTodos();
    }

    @Override
    public void atualizar(Integer id, Usuario usuario) {
        return usuarioRepository.atualizar(id, usuario);
    }

    @Override
    public void remover(Integer id) {
        return usuarioRepository.remover(id);
    }
}
