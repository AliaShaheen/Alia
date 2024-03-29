package com.hotels.beans;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hotels.subbeans.Destination;
import com.hotels.subbeans.HotelInfo;
import com.hotels.subbeans.HotelPricingInfo;
import com.hotels.subbeans.HotelScores;
import com.hotels.subbeans.HotelUrgencyInfo;
import com.hotels.subbeans.HotelUrls;
import com.hotels.subbeans.OfferDateRange;

/*
 * @author alias
 */
public class Hotel implements Serializable {

	
	private static final long serialVersionUID = -3225624954550968862L;


	@JsonProperty("offerDateRange")
	private OfferDateRange offerDateRange;
	@JsonProperty("destination")
	private Destination destination;
	@JsonProperty("hotelInfo")
	private HotelInfo hotelInfo;
	@JsonProperty("hotelUrgencyInfo")
	private HotelUrgencyInfo hotelUrgencyInfo;
	@JsonProperty("hotelPricingInfo")
	private HotelPricingInfo hotelPricingInfo;
	@JsonProperty("hotelUrls")
	private HotelUrls hotelUrls;
	@JsonProperty("hotelScores")
	private HotelScores hotelScores;

	public HotelInfo getHotelInfo() {
		return hotelInfo;
	}
	public void setHotelInfo(HotelInfo hotelInfo) {
		this.hotelInfo = hotelInfo;
	}
	public HotelUrgencyInfo getHotelUrgencyInfo() {
		return hotelUrgencyInfo;
	}
	public void setHotelUrgencyInfo(HotelUrgencyInfo hotelUrgencyInfo) {
		this.hotelUrgencyInfo = hotelUrgencyInfo;
	}
	public HotelPricingInfo getHotelPricingInfo() {
		return hotelPricingInfo;
	}
	public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
		this.hotelPricingInfo = hotelPricingInfo;
	}
	public HotelUrls getHotelUrls() {
		return hotelUrls;
	}
	public void setHotelUrls(HotelUrls hotelUrls) {
		this.hotelUrls = hotelUrls;
	}
	public HotelScores getHotelScores() {
		return hotelScores;
	}
	public void setHotelScores(HotelScores hotelScores) {
		this.hotelScores = hotelScores;
	}
	public OfferDateRange getOfferDateRange() {
		return offerDateRange;
	}
	public void setOfferDateRange(OfferDateRange offerDateRange) {
		this.offerDateRange = offerDateRange;
	}
	public Destination getDestination() {
		return destination;
	}
	public void setDestination(Destination destination) {
		this.destination = destination;
	}


}
