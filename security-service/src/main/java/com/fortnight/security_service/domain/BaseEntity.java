package domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class BaseEntity implements Serializable {
    
    private static final long serialVersionUID = 3967453158129709274L;
    @JsonIgnore
	//@Column(name = "CREATED_BY", length = 20)
    protected String createdBy;
}
