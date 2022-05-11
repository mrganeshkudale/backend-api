package org.springframework.samples.petclinic.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.samples.petclinic.rest.dto.PetTypeAllOfDto;
import org.springframework.samples.petclinic.rest.dto.PetTypeFieldsDto;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * A pet type.
 */
@ApiModel(description = "A pet type.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-11T15:33:08.613541700+05:30[Asia/Calcutta]")
public class PetTypeDto   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("id")
  private Integer id;

  public PetTypeDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the pet type.
   * @return name
  */
  @ApiModelProperty(example = "cat", required = true, value = "The name of the pet type.")
  @NotNull

@Size(min=1,max=80) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PetTypeDto id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the pet type.
   * minimum: 0
   * @return id
  */
  @ApiModelProperty(example = "1", required = true, readOnly = true, value = "The ID of the pet type.")
  @NotNull

@Min(0)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PetTypeDto petType = (PetTypeDto) o;
    return Objects.equals(this.name, petType.name) &&
        Objects.equals(this.id, petType.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PetTypeDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

