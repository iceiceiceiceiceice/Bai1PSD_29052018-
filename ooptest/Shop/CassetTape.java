package Shop;

public class CassetTape extends Good{
	private int duration;
	public CassetTape(){
		super();
		duration = 0;
		type = "CassetTape";
	}

	public CassetTape(String id, String title, String publisher, int price,int duration) {
		super(id,title,publisher,price);
		this.duration = duration;
		type = "CassetTape";
	}
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString(){
		return "Good [" + (id != null ? "id=" + id + ", " : "") + (title != null ? "title=" + title + ", " : "")
				+ (publisher != null ? "publisher=" + publisher + ", " : "") + "type=" + type + ", price=" + price
				+ ", duration :"+duration+"]";
	}
	
	
}
