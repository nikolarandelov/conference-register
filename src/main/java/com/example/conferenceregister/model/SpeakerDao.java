package com.example.conferenceregister.model;

import lombok.Data;

@Data
public class SpeakerDao {

  private Long speakerId;
  private String firstName;
  private String lastName;
  private String email;
  private String title;
  private int yearsInEndava;
}
