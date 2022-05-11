package org.springframework.samples.petclinic.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.samples.petclinic.rest.dto.SpecialtyDto;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * Editable fields of a veterinarian.
 */
@ApiModel(description = "Editable fields of a veterinarian.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-11T15:33:08.613541700+05:30[Asia/Calcutta]")
public class VetFieldsDto   {
  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("specialties")
  @Valid
  private List<SpecialtyDto> specialties = new ArrayList<>();

  public VetFieldsDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The first name of the vet.
   * @return firstName
  */
  @ApiModelProperty(example = "James", required = true, value = "The first name of the vet.")
  @NotNull

@Pattern(regexp="^[a-zA-Z]*$") @Size(min=1,max=30) 
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public VetFieldsDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The last name of the vet.
   * @return lastName
  */
  @ApiModelProperty(example = "Carter", required = true, value = "The last name of the vet.")
  @NotNull

@Pattern(regexp="^[a-zA-Z]*$") @Size(min=1,max=30) 
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public VetFieldsDto specialties(List<SpecialtyDto> specialties) {
    this.specialties = specialties;
    return this;
  }

  public VetFieldsDto addSpecialtiesItem(SpecialtyDto specialtiesItem) {
    if (this.specialties == null) {
      this.specialties = new ArrayList<>();
    }
    this.specialties.add(specialtiesItem);
    return this;
  }

  /**
   * The specialties of the vet.
   * @return specialties
  */
  @ApiModelProperty(required = true, value = "The specialties of the vet.")
  @NotNull

  @Valid

  public List<SpecialtyDto> getSpecialties() {
    return specialties;
  }

  public void setSpecialties(List<SpecialtyDto> specialties) {
    this.specialties = specialties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VetFieldsDto vetFields = (VetFieldsDto) o;
    return Objects.equals(this.firstName, vetFields.firstName) &&
        Objects.equals(this.lastName, vetFields.lastName) &&
        Objects.equals(this.specialties, vetFields.specialties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, specialties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VetFieldsDto {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    specialties: ").append(toIndentedString(specialties)).append("\n");
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

