package main;

public class Video {
	private String name;
	private String size;
	private String cdnLink;

	public Video(String name, String size, String cdnLink) {
		this.name = name;
		this.size = size;
		this.cdnLink = cdnLink;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCdnLink() {
		return cdnLink;
	}

	public void setCdnLink(String cdnLink) {
		this.cdnLink = cdnLink;
	}

}
