package br.com.trader.robot.data.charting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.trader.robot.data.charting.repository.InscricaoValorRepositorio;

@Service
public class TesteService {

	/*private InscricaoValorRepositorio inscricaoValorRepositorio;

	@Autowired
	public TesteService(InscricaoValorRepositorio inscricaoValorRepositorio) {
		this.inscricaoValorRepositorio = inscricaoValorRepositorio;
	}*/

	public Integer getValorInscricaoLiga() {
		return null;
		//return inscricaoValorRepositorio.findValor();
	}

}
