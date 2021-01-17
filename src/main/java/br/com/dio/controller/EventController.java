package br.com.dio.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.dio.model.Event;

@Named
public class EventController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Event event;

	private List<Event> events = new ArrayList<Event>();
	
	public String addEvent() {
		events.add(event);
		System.out.println("Evento " + event + " cadastrado com sucesso!");
		
		return "";
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

}
