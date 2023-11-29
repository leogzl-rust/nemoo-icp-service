package net.ysh.nemoo.bean;

import java.io.Serializable;

import net.ysh.nemoo.bean.icp.Fish;
import net.ysh.nemoo.bean.icp.Fisher;

public class Nemoo implements Serializable {

	private static final long serialVersionUID = 4311450409110768183L;

	private String fishId;
	private String fisherId;

	private Fish fish;
	private Fisher fisher;

	private String responseMessage;

	public Nemoo() {
	}

	public String getFishId() {
		return fishId;
	}

	public void setFishId(String fishId) {
		this.fishId = fishId;
	}

	public String getFisherId() {
		return fisherId;
	}

	public void setFisherId(String fisherId) {
		this.fisherId = fisherId;
	}

	public Fish getFish() {
		return fish;
	}

	public void setFish(Fish fish) {
		this.fish = fish;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public Fisher getFisher() {
		return fisher;
	}

	public void setFisher(Fisher fisher) {
		this.fisher = fisher;
	}

}
