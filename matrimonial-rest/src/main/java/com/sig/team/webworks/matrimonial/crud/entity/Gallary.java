package com.sig.team.webworks.matrimonial.crud.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gallary database table.
 * 
 */
@Entity
@NamedQuery(name="Gallary.findAll", query="SELECT g FROM Gallary g")
public class Gallary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="img_id")
	private int imgId;

	@Lob
	private byte[] images;

	@Column(name="prof_id")
	private int profId;

	public Gallary() {
	}

	public int getImgId() {
		return this.imgId;
	}

	public void setImgId(int imgId) {
		this.imgId = imgId;
	}

	public byte[] getImages() {
		return this.images;
	}

	public void setImages(byte[] images) {
		this.images = images;
	}

	public int getProfId() {
		return this.profId;
	}

	public void setProfId(int profId) {
		this.profId = profId;
	}

}