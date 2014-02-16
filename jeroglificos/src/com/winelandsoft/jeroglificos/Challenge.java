package com.winelandsoft.jeroglificos;

import java.io.Serializable;


public class Challenge implements Serializable {

	private static final long serialVersionUID = -8098365531596764835L;

	private String id = "";
	private String title = "";
	private String summary = "";
	private String imageSrc = "";
	private int numLike = 0;
	private int numDone = 0;
	private boolean favorite = false;
	private boolean like = false;


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getImageSrc() {
		return imageSrc;
	}
	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}
	public int getNumLike() {
		return numLike;
	}
	public void setNumLike(int numLike) {
		this.numLike = numLike;
	}
	public int getNumDone() {
		return numDone;
	}
	public void setNumDone(int numDone) {
		this.numDone = numDone;
	}

	public boolean isFavorite() {
		return favorite;
	}
	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}
	public boolean isLike() {
		return like;
	}
	public void setLike(boolean like) {
		this.like = like;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}






}
