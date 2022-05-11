package org.springframework.samples.petclinic.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.samples.petclinic.rest.dto.VisitDto;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * PetAllOfDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-11T15:33:08.613541700+05:30[Asia/Calcutta]")
public class PetAllOfDto   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("ownerId")
  private Integer ownerId;

  @JsonProperty("visits")
  @Valid
  private List<VisitDto> visits = new ArrayList<>();

  public PetAllOfDto id(Integer id) {
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

  public PetAllOfDto ownerId(Integer ownerId) {
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

  public PetAllOfDto visits(List<VisitDto> visits) {
    this.visits = visits;
    return this;
  }

  public PetAllOfDto addVisitsItem(VisitDto visitsItem) {
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
    PetAllOfDto petAllOf = (PetAllOfDto) o;
    return Objects.equals(this.id, petAllOf.id) &&
        Objects.equals(this.ownerId, petAllOf.ownerId) &&
        Objects.equals(this.visits, petAllOf.visits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ownerId, visits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PetAllOfDto {\n");
    
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

