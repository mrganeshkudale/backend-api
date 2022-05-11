package org.springframework.samples.petclinic.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.springframework.samples.petclinic.rest.dto.PetTypeDto;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * Editable fields of a pet.
 */
@ApiModel(description = "Editable fields of a pet.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-11T15:33:08.613541700+05:30[Asia/Calcutta]")
public class PetFieldsDto   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("birthDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate birthDate;

  @JsonProperty("type")
  private PetTypeDto type;

  public PetFieldsDto name(String name) {
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

  public PetFieldsDto birthDate(LocalDate birthDate) {
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

  public PetFieldsDto type(PetTypeDto type) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PetFieldsDto petFields = (PetFieldsDto) o;
    return Objects.equals(this.name, petFields.name) &&
        Objects.equals(this.birthDate, petFields.birthDate) &&
        Objects.equals(this.type, petFields.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, birthDate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PetFieldsDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

