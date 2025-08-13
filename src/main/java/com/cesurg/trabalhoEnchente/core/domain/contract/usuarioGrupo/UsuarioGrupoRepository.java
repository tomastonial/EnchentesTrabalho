package com.cesurg.trabalhoEnchente.core.domain.contract.usuarioGrupo;

import com.cesurg.trabalhoEnchente.core.domain.entity.UsuarioGrupo;

import java.util.List;

public interface UsuarioGrupoRepository {
    public void create(UsuarioGrupo usuarioGrupo);
    public void update(int id,UsuarioGrupo usuarioGrupo);
    public void delete(int id);
    public UsuarioGrupo findById(int id);
    public List<UsuarioGrupo> findAll();
}
