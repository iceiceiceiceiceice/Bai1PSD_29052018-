package Library;

public class GetBookForm {
	private int id, userid, bookid;
	private String day, status;
	public GetBookForm(){
		id =0 ; 
		userid = 0 ;
		bookid = 0 ;
		day = "";
		status = "";
	}
	public GetBookForm(int id, int userid, int bookid, String day, String status) {
		super();
		this.id = id;
		this.userid = userid;
		this.bookid = bookid;
		this.day = day;
		this.status = status;
	}
	@Override
	public String toString() {
		return "GetBookForm [id=" + id + ", userid=" + userid + ", bookid=" + bookid + ", "
				+ (day != null ? "day=" + day + ", " : "") + (status != null ? "status=" + status : "") + "]";
	}
	public int getId() {
		return id;
	}
	public int getUserid() {
		return userid;
	}
	public int getBookid() {
		return bookid;
	}
	public String getDay() {
		return day;
	}
	public String getStatus() {
		return status;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
