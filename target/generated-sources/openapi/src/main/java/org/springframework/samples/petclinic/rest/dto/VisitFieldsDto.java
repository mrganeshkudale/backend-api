package org.springframework.samples.petclinic.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * Editable fields of a vet visit.
 */
@ApiModel(description = "Editable fields of a vet visit.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-11T15:33:08.613541700+05:30[Asia/Calcutta]")
public class VisitFieldsDto   {
  @JsonProperty("date")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate date;

  @JsonProperty("description")
  private String description;

  public VisitFieldsDto date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * The date of the visit.
   * @return date
  */
  @ApiModelProperty(example = "Tue Jan 01 05:30:00 IST 2013", value = "The date of the visit.")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public VisitFieldsDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description for the visit.
   * @return description
  */
  @ApiModelProperty(example = "rabies shot", required = true, value = "The description for the visit.")
  @NotNull

@Size(min=1,max=255) 
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VisitFieldsDto visitFields = (VisitFieldsDto) o;
    return Objects.equals(this.date, visitFields.date) &&
        Objects.equals(this.description, visitFields.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VisitFieldsDto {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

