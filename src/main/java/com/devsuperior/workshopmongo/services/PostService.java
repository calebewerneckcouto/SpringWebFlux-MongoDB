package com.devsuperior.workshopmongo.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.workshopmongo.dto.PostDTO;
import com.devsuperior.workshopmongo.repositories.PostRepository;
import com.devsuperior.workshopmongo.services.exceptioons.ResourceNotFoundException;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;

	public Mono<PostDTO> findById(String id) {
		return repository.findById(id).map(post -> new PostDTO(post))
				.switchIfEmpty(Mono.error(new ResourceNotFoundException("Id não encontrado"))); // retorna erro caso nao
																								// tenha usuario
	}

	public Flux<PostDTO> findByTitle(String text) {
		return repository.searchTitle(text).map(postFound -> new PostDTO(postFound));
	}

	public Flux<PostDTO> fullSearch(String text, Instant minDate, Instant maxDate) {
		maxDate = maxDate.plusSeconds(86400);// acresceta segundos que equivale 24 horas
		return repository.fullSearch(text, minDate, maxDate).map(postFound -> new PostDTO(postFound));
	}

}
