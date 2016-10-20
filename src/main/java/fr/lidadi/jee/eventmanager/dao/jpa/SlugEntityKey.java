/*
 * Created on 17 oct. 2016 ( Time 17:17:45 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package fr.lidadi.jee.eventmanager.dao.jpa;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Lob;

/**
 * Composite primary key for entity "SlugEntity" ( stored in table "SLUG" )
 *
 * @author Telosys Tools Generator
 *
 */
@Embeddable
public class SlugEntityKey implements Serializable {
	private static final long serialVersionUID = 1L;

	// ----------------------------------------------------------------------
	// ENTITY KEY ATTRIBUTES
	// ----------------------------------------------------------------------
	@Lob
	@Column(name = "EVENT_ID", nullable = false)
	private byte[] eventId;

	@Column(name = "SLUG", nullable = false, length = 255)
	private String slug;

	// ----------------------------------------------------------------------
	// CONSTRUCTORS
	// ----------------------------------------------------------------------
	public SlugEntityKey() {
		super();
	}

	public SlugEntityKey(byte[] eventId, String slug) {
		super();
		this.eventId = eventId;
		this.slug = slug;
	}

	// ----------------------------------------------------------------------
	// GETTERS & SETTERS FOR KEY FIELDS
	// ----------------------------------------------------------------------
	public void setEventId(byte[] value) {
		this.eventId = value;
	}

	public byte[] getEventId() {
		return this.eventId;
	}

	public void setSlug(String value) {
		this.slug = value;
	}

	public String getSlug() {
		return this.slug;
	}

	// ----------------------------------------------------------------------
	// equals METHOD
	// ----------------------------------------------------------------------
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		SlugEntityKey other = (SlugEntityKey) obj;
		// --- Attribute eventId
		if (!Arrays.equals(eventId, other.eventId))
			return false;
		// --- Attribute slug
		if (slug == null) {
			if (other.slug != null)
				return false;
		} else if (!slug.equals(other.slug))
			return false;
		return true;
	}

	// ----------------------------------------------------------------------
	// hashCode METHOD
	// ----------------------------------------------------------------------
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		// --- Attribute eventId
		result = prime * result + Arrays.hashCode(eventId);
		// --- Attribute slug
		result = prime * result + ((slug == null) ? 0 : slug.hashCode());

		return result;
	}

	// ----------------------------------------------------------------------
	// toString METHOD
	// ----------------------------------------------------------------------
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(eventId);
		sb.append("|");
		sb.append(slug);
		return sb.toString();
	}
}