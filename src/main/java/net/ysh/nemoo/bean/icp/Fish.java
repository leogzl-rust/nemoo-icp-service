package net.ysh.nemoo.bean.icp;

import java.io.Serializable;

import org.ic4j.candid.annotations.Name;

public class Fish implements Serializable {

	private static final long serialVersionUID = -6471173502659954547L;

	// id: text;
	@Name("get_fish")
	private String id;

	// tag_id: text;
	@Name("get_fish")
	private String tagId;

	// fisher: text;
	@Name("get_fish")
	private String fisher;

	// location: text;
	@Name("get_fish")
	private String location;

	// date_catch: text;
	@Name("get_fish")
	private String dateCatch;

	// date_process: text;
	@Name("get_fish")
	private String dateProcess;

	// latitute: text;
	@Name("get_fish")
	private String latitute;

	// longitude: text;
	@Name("get_fish")
	private String longitude;

	// gross_weight: int32;
	@Name("get_fish")
	private int weight;

	// sekami_1: int32;
	@Name("get_fish")
	private int sekami1;

	// sekami_2: int32;
	@Name("get_fish")
	private int sekami2;

	// haranaka_1: int32;
	@Name("get_fish")
	private int haranaka1;

	// haranaka_2: int32;
	@Name("get_fish")
	private int haranaka2;

	// toro: int32;
	@Name("get_fish")
	private int toro;

	// head: int32;
	@Name("get_fish")
	private int head;

	// tail: int32;
	@Name("get_fish")
	private int tail;

	// bone: int32;
	@Name("get_fish")
	private int bone;

	// skin: int32;
	@Name("get_fish")
	private int skin;

	public Fish() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTagId() {
		return tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getFisher() {
		return fisher;
	}

	public void setFisher(String fisher) {
		this.fisher = fisher;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDateCatch() {
		return dateCatch;
	}

	public void setDateCatch(String dateCatch) {
		this.dateCatch = dateCatch;
	}

	public String getDateProcess() {
		return dateProcess;
	}

	public void setDateProcess(String dateProcess) {
		this.dateProcess = dateProcess;
	}

	public String getLatitute() {
		return latitute;
	}

	public void setLatitute(String latitute) {
		this.latitute = latitute;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getSekami1() {
		return sekami1;
	}

	public void setSekami1(int sekami1) {
		this.sekami1 = sekami1;
	}

	public int getSekami2() {
		return sekami2;
	}

	public void setSekami2(int sekami2) {
		this.sekami2 = sekami2;
	}

	public int getHaranaka1() {
		return haranaka1;
	}

	public void setHaranaka1(int haranaka1) {
		this.haranaka1 = haranaka1;
	}

	public int getHaranaka2() {
		return haranaka2;
	}

	public void setHaranaka2(int haranaka2) {
		this.haranaka2 = haranaka2;
	}

	public int getToro() {
		return toro;
	}

	public void setToro(int toro) {
		this.toro = toro;
	}

	public int getHead() {
		return head;
	}

	public void setHead(int head) {
		this.head = head;
	}

	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		this.tail = tail;
	}

	public int getBone() {
		return bone;
	}

	public void setBone(int bone) {
		this.bone = bone;
	}

	public int getSkin() {
		return skin;
	}

	public void setSkin(int skin) {
		this.skin = skin;
	}
}
