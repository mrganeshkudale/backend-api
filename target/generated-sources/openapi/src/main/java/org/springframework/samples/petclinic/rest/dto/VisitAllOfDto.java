package org.springframework.samples.petclinic.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * VisitAllOfDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-11T15:33:08.613541700+05:30[Asia/Calcutta]")
public class VisitAllOfDto   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("petId")
  private Integer petId;

  public VisitAllOfDto id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the visit.
   * minimum: 0
   * @return id
  */
  @ApiModelProperty(example = "1", required = true, readOnly = true, value = "The ID of the visit.")
  @NotNull

@Min(0)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public VisitAllOfDto petId(Integer petId) {
    this.petId = petId;
    return this;
  }

  /**
   * The ID of the pet.
   * minimum: 0
   * @return petId
  */
  @ApiModelProperty(example = "1", readOnly = true, value = "The ID of the pet.")

@Min(0)
  public Integer getPetId() {
    return petId;
  }

  public void setPetId(Integer petId) {
    this.petId = petId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VisitAllOfDto visitAllOf = (VisitAllOfDto) o;
    return Objects.equals(this.id, visitAllOf.id) &&
        Objects.equals(this.petId, visitAllOf.petId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, petId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VisitAllOfDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    petId: ").append(toIndentedString(petId)).append("\n");
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

