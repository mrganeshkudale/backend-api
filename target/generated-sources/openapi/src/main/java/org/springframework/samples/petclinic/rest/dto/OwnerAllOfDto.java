package org.springframework.samples.petclinic.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.samples.petclinic.rest.dto.PetDto;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * OwnerAllOfDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-11T15:33:08.613541700+05:30[Asia/Calcutta]")
public class OwnerAllOfDto   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("pets")
  @Valid
  private List<PetDto> pets = new ArrayList<>();

  public OwnerAllOfDto id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the pet owner.
   * minimum: 0
   * @return id
  */
  @ApiModelProperty(example = "1", readOnly = true, value = "The ID of the pet owner.")

@Min(0)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public OwnerAllOfDto pets(List<PetDto> pets) {
    this.pets = pets;
    return this;
  }

  public OwnerAllOfDto addPetsItem(PetDto petsItem) {
    if (this.pets == null) {
      this.pets = new ArrayList<>();
    }
    this.pets.add(petsItem);
    return this;
  }

  /**
   * The pets owned by this individual including any booked vet visits.
   * @return pets
  */
  @ApiModelProperty(required = true, readOnly = true, value = "The pets owned by this individual including any booked vet visits.")
  @NotNull

  @Valid

  public List<PetDto> getPets() {
    return pets;
  }

  public void setPets(List<PetDto> pets) {
    this.pets = pets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnerAllOfDto ownerAllOf = (OwnerAllOfDto) o;
    return Objects.equals(this.id, ownerAllOf.id) &&
        Objects.equals(this.pets, ownerAllOf.pets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnerAllOfDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pets: ").append(toIndentedString(pets)).append("\n");
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

