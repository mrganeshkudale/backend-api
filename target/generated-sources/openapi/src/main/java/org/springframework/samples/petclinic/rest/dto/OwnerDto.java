package org.springframework.samples.petclinic.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.samples.petclinic.rest.dto.OwnerAllOfDto;
import org.springframework.samples.petclinic.rest.dto.OwnerFieldsDto;
import org.springframework.samples.petclinic.rest.dto.PetDto;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * A pet owner.
 */
@ApiModel(description = "A pet owner.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-11T15:33:08.613541700+05:30[Asia/Calcutta]")
public class OwnerDto   {
  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("address")
  private String address;

  @JsonProperty("city")
  private String city;

  @JsonProperty("telephone")
  private String telephone;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("pets")
  @Valid
  private List<PetDto> pets = new ArrayList<>();

  public OwnerDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The first name of the pet owner.
   * @return firstName
  */
  @ApiModelProperty(example = "George", required = true, value = "The first name of the pet owner.")
  @NotNull

@Pattern(regexp="^[a-zA-Z]*$") @Size(min=1,max=30) 
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public OwnerDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The last name of the pet owner.
   * @return lastName
  */
  @ApiModelProperty(example = "Franklin", required = true, value = "The last name of the pet owner.")
  @NotNull

@Pattern(regexp="^[a-zA-Z]*$") @Size(min=1,max=30) 
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public OwnerDto address(String address) {
    this.address = address;
    return this;
  }

  /**
   * The postal address of the pet owner.
   * @return address
  */
  @ApiModelProperty(example = "110 W. Liberty St.", required = true, value = "The postal address of the pet owner.")
  @NotNull

@Size(min=1,max=255) 
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public OwnerDto city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The city of the pet owner.
   * @return city
  */
  @ApiModelProperty(example = "Madison", required = true, value = "The city of the pet owner.")
  @NotNull

@Size(min=1,max=80) 
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public OwnerDto telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

  /**
   * The telephone number of the pet owner.
   * @return telephone
  */
  @ApiModelProperty(example = "6085551023", required = true, value = "The telephone number of the pet owner.")
  @NotNull

@Pattern(regexp="^[0-9]*$") @Size(min=1,max=20) 
  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public OwnerDto id(Integer id) {
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

  public OwnerDto pets(List<PetDto> pets) {
    this.pets = pets;
    return this;
  }

  public OwnerDto addPetsItem(PetDto petsItem) {
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
    OwnerDto owner = (OwnerDto) o;
    return Objects.equals(this.firstName, owner.firstName) &&
        Objects.equals(this.lastName, owner.lastName) &&
        Objects.equals(this.address, owner.address) &&
        Objects.equals(this.city, owner.city) &&
        Objects.equals(this.telephone, owner.telephone) &&
        Objects.equals(this.id, owner.id) &&
        Objects.equals(this.pets, owner.pets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, address, city, telephone, id, pets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnerDto {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
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

