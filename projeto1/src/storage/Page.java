package storage;

public class Page {
	public static int INVALID_PAGE_ID = 0;
	
	int pageId = INVALID_PAGE_ID;
	boolean isDirty = false;
	int pinCount = 0;
	
	public Page() {
		// TODO Auto-generated constructor stub
	}
	
	
	public int getPageId() {
		return pageId;
	}
	public void setPageId(int pageId) {
		this.pageId = pageId;
	}
	public boolean isDirty() {
		return isDirty;
	}
	public void setDirty(boolean isDirty) {
		this.isDirty = isDirty;
	}
	public int getPinCount() {
		return pinCount;
	}
	public void setPinCount(int pinCount) {
		this.pinCount = pinCount;
	}
	
	

}
