package ru.ssianpost.anm.anmproject.model;

import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;

@Value
@Slf4j
@RequiredArgsConstructor//(staticName = "Dog")
public class Dog {
  String name;
}
