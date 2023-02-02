package com.example.conferenceregister.service.impl;

import com.example.conferenceregister.dto.Event;
import com.example.conferenceregister.model.EventDao;
import com.example.conferenceregister.service.EventService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

  private final HashMap<Long, EventDao> events = new HashMap<>();
  private Long index = 0L;

  @Override
  public void addSpeaker(Event event) {
    EventDao eventDao = new EventDao();
    eventDao.setEventId(index);
    eventDao.setName(event.getName());
    eventDao.setDescription(event.getDescription());
    eventDao.setStartDate(event.getStartDate());
    eventDao.setEndDate(event.getEndDate());
    eventDao.setNumberOfSpeakers(event.getNumberOfSpeakers());

    events.put(index, eventDao);
    index++;
  }

  @Override
  public List<Event> getSpeakers() {
    List<Event> eventList = new ArrayList<>();
    events.values().stream().toList().forEach(eventDao -> {
      Event event = new Event();
      event.setName(eventDao.getName());
      event.setDescription(eventDao.getDescription());
      event.setStartDate(eventDao.getStartDate());
      event.setEndDate(eventDao.getEndDate());
      event.setNumberOfSpeakers(eventDao.getNumberOfSpeakers());
      eventList.add(event);
    });
    return eventList;
  }
}
