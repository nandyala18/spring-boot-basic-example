package com.infy.basic.example.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.infy.basic.example.model.Topic;
import com.infy.basic.example.repository.TopicRepository;

@Service
@Component
public class TopicService {
	@Autowired
	private TopicRepository topicrepository;

	public List<Topic> getAll() {
		List<Topic> topics = new ArrayList<Topic>();
		//topicrepository.findAll().forEach(topics::add);
		  Iterator<Topic> it=topicrepository.findAll().iterator();
		  while(it.hasNext()) {
			  topics.add(it.next());
	        }

		return topics;
	}

	public Optional<Topic> getTopic(String id) {

		// return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return topicrepository.findById(id);

	}

	public void addTopic(Topic topic) {

		// topics.add(topic);
		topicrepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		/*
		 * for(int i=0;i<topics.size();i++) { Topic t=topics.get(i);
		 * if(t.getId().equals(id)) { topics.set(i,topic); } }
		 */
		topicrepository.save(topic);
	}

	public void deleteTopic(String id) {
		// topics.removeIf(t->t.getId().equals(id));
		topicrepository.deleteById(id);
	}
}
