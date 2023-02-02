package com.example.conferenceregister.service;

import com.example.conferenceregister.dto.Event;
import java.util.List;

public interface EventService {

  void addSpeaker(Event event);

  List<Event> getSpeakers();
}
