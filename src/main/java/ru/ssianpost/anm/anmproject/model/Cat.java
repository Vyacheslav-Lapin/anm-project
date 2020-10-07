package ru.ssianpost.anm.anmproject.model;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor//(staticName = "Cat")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cat {

  @Id
  @Include
  @GeneratedValue
  UUID id;

  @NonNull
  String name;
}
