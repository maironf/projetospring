package com.projeto.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.projeto.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
