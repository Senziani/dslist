package com.devsenziani.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsenziani.dslist.dto.GameMinDTO;
import com.devsenziani.dslist.entities.Game;
import com.devsenziani.dslist.services.GameService;

// setando como controller
@RestController
//caminho de resposta da API
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService gameservice;

	// setado como get
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameservice.findAll();
		return result;
	}

}
