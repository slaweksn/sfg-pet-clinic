package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.Set;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//@CreatedBy
	//@Column(name = "created_by", nullable = false, length = 50, updatable = false)
	//private String createdBy;

	//@CreatedDate
	//@Column(name = "created_date", updatable = false)
	//private Instant createdDate = Instant.now();

	//@LastModifiedBy
	//@Column(name = "last_modified_by", length = 50)
	//private String lastModifiedBy;

	//@LastModifiedDate
	//@Column(name = "last_modified_date")
	//private Instant lastModifiedDate = Instant.now();
	
	//public Long getId() {
	//	return id;
	//}

	//public void setId(Long id) {
	//	this.id = id;
	//}
	/*-
	
	public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    */
}
