package com.alexlopes.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.alexlopes.workshopmongo.doman.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
