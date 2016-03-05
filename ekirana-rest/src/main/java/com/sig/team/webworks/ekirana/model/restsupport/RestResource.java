package com.sig.team.webworks.ekirana.model.restsupport;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import com.sig.team.webworks.ekirana.model.restsupport.resources.RestCollection;
import com.sig.team.webworks.ekirana.model.restsupport.resources.RestLocation;

@JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property = "type")
@JsonSubTypes({
		@JsonSubTypes.Type(value = RestLocation.class, name = "RestLocation"),
		@JsonSubTypes.Type(value = RestCollection.class, name = "RestCollection"),
})
public interface RestResource extends Serializable {
	//public String getResourceLocation();
}
