package com.infy.basic.example.repository;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

import com.infy.basic.example.model.Topic;
@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "Topic")
public interface TopicRepository extends CouchbaseRepository<Topic, String>{}