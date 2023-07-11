package com.devsenziani.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsenziani.dslist.dto.GameMinDTO;
import com.devsenziani.dslist.entities.Game;
import com.devsenziani.dslist.repositories.GameRepository;

//@Component ou outra por causa da classe GameService
//registrando o componente do sistema
@Service
public class GameService {

	// como injetar o game repository? com :
	@Autowired
	private GameRepository gameRepository;

	// o service devolve a lista de objetos
	public List<GameMinDTO> findAll() {
		// busca todos ,é convetido para uma lista de games e o resultado fica em
		// result
		List<Game> result = gameRepository.findAll();

		// .stream(permite fazer operações com sequencias de dados).map e passa o x como
		// argumento e pra voltar para lista usa .tolist()
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		// pode ser simplificado tirando o List<GameMinDTO> dto = por return

	}

}
