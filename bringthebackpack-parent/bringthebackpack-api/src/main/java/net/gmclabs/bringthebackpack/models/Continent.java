package net.gmclabs.bringthebackpack.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Continent extends BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private Geolocation geolocation;
	private Image mainImage;
	private Video mainVideo;

	public Continent() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Geolocation getGeolocation() {
		return geolocation;
	}

	public void setGeolocation(Geolocation geolocation) {
		this.geolocation = geolocation;
	}

	public Image getMainImage() {
		return mainImage;
	}

	public void setMainImage(Image mainImage) {
		this.mainImage = mainImage;
	}

	public Video getMainVideo() {
		return mainVideo;
	}

	public void setMainVideo(Video mainVideo) {
		this.mainVideo = mainVideo;
	}

	@Override
	public String toString() {
		return "Continent [name=" + name + ", geolocation=" + geolocation + ", mainImage=" + mainImage + ", mainVideo="
				+ mainVideo + ", toString()=" + super.toString() + "]";
	}

}
