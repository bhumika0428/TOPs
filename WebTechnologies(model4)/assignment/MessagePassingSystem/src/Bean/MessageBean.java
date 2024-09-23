package Bean;

public class MessageBean {

	
	private int massageid,userid;
	private String from, to, massage;
	/**
	 * @return the massageid
	 */
	public int getMassageid() {
		return massageid;
	}
	/**
	 * @param massageid the massageid to set
	 */
	public void setMassageid(int massageid) {
		this.massageid = massageid;
	}
	/**
	 * @return the userid
	 */
	public int getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(int userid) {
		this.userid = userid;
	}
	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}
	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}
	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}
	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}
	/**
	 * @return the massage
	 */
	public String getMassage() {
		return massage;
	}
	/**
	 * @param massage the massage to set
	 */
	public void setMassage(String massage) {
		this.massage = massage;
	}
	@Override
	public String toString() {
		return "MessageBean [massageid=" + massageid + ", userid=" + userid + ", from=" + from + ", to=" + to
				+ ", massage=" + massage + "]";
	}
	
	
	
}
