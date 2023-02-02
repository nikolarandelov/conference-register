package com.example.conferenceregister.controller;

import com.example.conferenceregister.api.EventsApi;
import com.example.conferenceregister.dto.Event;
import com.example.conferenceregister.service.EventService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EventController implements EventsApi {

  private final EventService eventService;

  @Override
  public ResponseEntity<Void> addEvent(Event event) {
    eventService.addSpeaker(event);

    return new ResponseEntity<>(HttpStatusCode.valueOf(201));
  }

  @Override
  public ResponseEntity<List<Event>> getEvents() {
    return ResponseEntity.ok(eventService.getSpeakers());
  }
}
