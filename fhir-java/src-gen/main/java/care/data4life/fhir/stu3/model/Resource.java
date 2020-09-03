/*
 * Copyright (c) 2020 D4L data4life gGmbH / All rights reserved.
 *
 * D4L owns all legal rights, title and interest in and to the Software Development Kit ("SDK"),
 * including any intellectual property rights that subsist in the SDK.
 *
 * The SDK and its documentation may be accessed and used for viewing/review purposes only.
 * Any usage of the SDK for other purposes, including usage for the development of
 * applications/third-party applications shall require the conclusion of a license agreement
 * between you and D4L.
 *
 * If you are interested in licensing the SDK for your own applications/third-party
 * applications and/or if you’d like to contribute to the development of the SDK, please
 * contact D4L by email to help@data4life.care.
 */

package care.data4life.fhir.stu3.model;

import com.squareup.moshi.Json;
import javax.annotation.Nullable;

/**
 * Resource.java
 *
 * This is the base resource type for everything.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Resource">Resource</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Resource) on 2020-07-29
 */
public class Resource extends FhirStu3Base {

  public static final String resourceType = "Resource";

  // Logical id of this artifact.
  @Json(name = "id")
  @Nullable
  public String id;

  // A set of rules under which this content was created.
  @Json(name = "implicitRules")
  @Nullable
  public String implicitRules;

  // Language of the resource content.
  @Json(name = "language")
  @Nullable
  public String language;

  // Metadata about the resource.
  @Json(name = "meta")
  @Nullable
  public Meta meta;

  public Resource() {
  }

  @Override
  public String getResourceType() {
    return Resource.resourceType;
  }
}
