package com.infy.basic.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infy.basic.example.model.Topic;
import com.infy.basic.example.service.TopicService;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicservice;

	@RequestMapping("/topics")
	public List<Topic> getAll() {
		return topicservice.getAll();
	}

	@RequestMapping("/topics/{id}")
	public Optional<Topic> getTopic(@PathVariable String id) {
		return topicservice.getTopic(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicservice.addTopic(topic);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicservice.updateTopic(id, topic);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicservice.deleteTopic(id);
	}

}
