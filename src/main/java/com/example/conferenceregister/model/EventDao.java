package com.example.conferenceregister.model;

import java.time.LocalDate;
import lombok.Data;

@Data
public class EventDao {

  private Long eventId;
  private String name;
  private String description;
  private LocalDate startDate;
  private LocalDate endDate;
  private int numberOfSpeakers;
}
