package com.sig.team.webworks.ekirana.model;

import com.sig.team.webworks.ekirana.crud.entity.Image;
import com.sig.team.webworks.ekirana.crud.entity.Items;

public class ItemsWithImage extends Items {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Image image;
	
	private String url;
 
	public ItemsWithImage(Items itemsObject) {
		setCost(itemsObject.getCost());
		setCreatedby(itemsObject.getCreatedby());
		setCreateon(itemsObject.getCreateon());
		setGrocerycategoryid(itemsObject.getGrocerycategoryid());
		setImageid(itemsObject.getImageid());
		setItemcategoryid(itemsObject.getItemcategoryid());
		setItemid(itemsObject.getItemid());
		setItemdescription(itemsObject.getItemdescription());
		setItemname(itemsObject.getItemname());
		setItemsubname(itemsObject.getItemsubname());
		setMessage(itemsObject.getMessage());
		setRating(itemsObject.getRating());
		setUnit(itemsObject.getUnit());
		setUpdateby(itemsObject.getUpdateby());
		setUpdatedon(itemsObject.getUpdatedon());
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
