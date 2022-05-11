package org.springframework.samples.petclinic.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.samples.petclinic.rest.dto.PetAllOfDto;
import org.springframework.samples.petclinic.rest.dto.PetFieldsDto;
import org.springframework.samples.petclinic.rest.dto.PetTypeDto;
import org.springframework.samples.petclinic.rest.dto.VisitDto;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * A pet.
 */
@ApiModel(description = "A pet.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-11T15:33:08.613541700+05:30[Asia/Calcutta]")
public class PetDto   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("birthDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate birthDate;

  @JsonProperty("type")
  private PetTypeDto type;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("ownerId")
  private Integer ownerId;

  @JsonProperty("visits")
  @Valid
  private List<VisitDto> visits = new ArrayList<>();

  public PetDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the pet.
   * @return name
  */
  @ApiModelProperty(example = "Leo", required = true, value = "The name of the pet.")
  @NotNull

@Size(max=30) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PetDto birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * The date of birth of the pet.
   * @return birthDate
  */
  @ApiModelProperty(example = "Tue Sep 07 05:30:00 IST 2010", required = true, value = "The date of birth of the pet.")
  @NotNull

  @Valid

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public PetDto type(PetTypeDto type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PetTypeDto getType() {
    return type;
  }

  public void setType(PetTypeDto type) {
    this.type = type;
  }

  public PetDto id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the pet.
   * minimum: 0
   * @return id
  */
  @ApiModelProperty(example = "1", required = true, readOnly = true, value = "The ID of the pet.")
  @NotNull

@Min(0)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PetDto ownerId(Integer ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * The ID of the pet's owner.
   * minimum: 0
   * @return ownerId
  */
  @ApiModelProperty(example = "1", readOnly = true, value = "The ID of the pet's owner.")

@Min(0)
  public Integer getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  public PetDto visits(List<VisitDto> visits) {
    this.visits = visits;
    return this;
  }

  public PetDto addVisitsItem(VisitDto visitsItem) {
    if (this.visits == null) {
      this.visits = new ArrayList<>();
    }
    this.visits.add(visitsItem);
    return this;
  }

  /**
   * Vet visit bookings for this pet.
   * @return visits
  */
  @ApiModelProperty(required = true, readOnly = true, value = "Vet visit bookings for this pet.")
  @NotNull

  @Valid

  public List<VisitDto> getVisits() {
    return visits;
  }

  public void setVisits(List<VisitDto> visits) {
    this.visits = visits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PetDto pet = (PetDto) o;
    return Objects.equals(this.name, pet.name) &&
        Objects.equals(this.birthDate, pet.birthDate) &&
        Objects.equals(this.type, pet.type) &&
        Objects.equals(this.id, pet.id) &&
        Objects.equals(this.ownerId, pet.ownerId) &&
        Objects.equals(this.visits, pet.visits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, birthDate, type, id, ownerId, visits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PetDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    visits: ").append(toIndentedString(visits)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

